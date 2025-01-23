package com.curiter.screen;

import com.curiter.block.entity.PetriDishBlockEntity;
import com.curiter.item.ModItems;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;

public class PetriDishScreenHandler extends ScreenHandler {
    private final Inventory inventory;
    private final PropertyDelegate propertyDelegate;
    public final PetriDishBlockEntity blockEntity;

    public PetriDishScreenHandler(int syncId, PlayerInventory inventory, PacketByteBuf buf){
        this(syncId,inventory,inventory.player.getWorld().getBlockEntity(buf.readBlockPos()),
                new ArrayPropertyDelegate(6));
    }

    public PetriDishScreenHandler(int syncId, PlayerInventory playerInventory, BlockEntity blockEntity, PropertyDelegate arrayPropertyDelegate) {
        super(ModScreenHandlers.PETRI_DISH_SCREEN_HANDLER,syncId);
        checkSize((Inventory) blockEntity,3);
        this.inventory = (Inventory) blockEntity;
        inventory.onOpen(playerInventory.player);
        this.propertyDelegate = arrayPropertyDelegate;
        this.blockEntity = (PetriDishBlockEntity) blockEntity;

        this.addSlot(new Slot(inventory,0,83,34){
            @Override
            public boolean canInsert(ItemStack stack) {
                return stack.getItem() == ModItems.YEAST;
            }
        });
        this.addSlot(new Slot(inventory,1,25,12){
            @Override
            public boolean canInsert(ItemStack stack) {
                return stack.getItem() == Items.SUGAR;
            }
        });
        this.addSlot(new Slot(inventory,2,25,54){
            @Override
            public boolean canInsert(ItemStack stack) {
                return stack.getItem() == Items.POTION;
            }
        });

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);

        addProperties(arrayPropertyDelegate);
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);
        if (slot != null && slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (invSlot < this.inventory.size()) {
                if (!this.insertItem(originalStack, this.inventory.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 1, this.inventory.size(), false)) {
                return ItemStack.EMPTY;
            }

            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }

        return newStack;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    private void addPlayerInventory(PlayerInventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(PlayerInventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }
    public boolean isCrafting(){
        return propertyDelegate.get(0) > 0;
    }
    public boolean haveFood(){
        return propertyDelegate.get(4) >= 0;
    }
    public boolean haveWater(){
        return propertyDelegate.get(2) >= 0;
    }

    public int getScaledProgress() {
        int progress = this.propertyDelegate.get(0);
        int maxProgress = this.propertyDelegate.get(1);
        int progressSize = 32;

        return maxProgress != 0 && progress != 0 ? progress * progressSize / maxProgress : 0;
    }
    public int getScaledProgressFood() {
        int nourishment = this.propertyDelegate.get(4);
        int maxNourishment = this.propertyDelegate.get(5);
        int progressSize = 32;

        return maxNourishment != 0 && nourishment != 0 ? nourishment * progressSize / maxNourishment : 0;
    }
    public int getScaledProgressWater() {
        int moisture = this.propertyDelegate.get(2);
        int maxMoisture = this.propertyDelegate.get(3);
        int progressSize = 32;

        return maxMoisture != 0 && moisture != 0 ? moisture * progressSize / maxMoisture : 0;
    }
}
