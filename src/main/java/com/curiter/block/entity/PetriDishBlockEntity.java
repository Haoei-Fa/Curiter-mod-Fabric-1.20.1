package com.curiter.block.entity;

import com.curiter.item.ModItems;
import com.curiter.screen.PetriDishScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class PetriDishBlockEntity extends BlockEntity implements ExtendedScreenHandlerFactory,ImplementedInventory{
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(3,ItemStack.EMPTY);

    private static final int CELLS = 0;
    private static final int FOOD = 1;
    private static final int WATER = 2;

    protected final PropertyDelegate propertyDelegate;
    //水分
    private int moisture = 0;
    private int maxMoisture = 64;

    //营养
    private int nourishment = 0;
    private int maxNourishment = 64;

    private int progress = 0;
    private int maxProgress = 600;

    public PetriDishBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.PETRI_DISH_BLOCK_ENTITY, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return switch (index){
                    case 0 -> PetriDishBlockEntity.this.progress;
                    case 1 -> PetriDishBlockEntity.this.maxProgress;
                    case 2 -> PetriDishBlockEntity.this.moisture;
                    case 3 -> PetriDishBlockEntity.this.maxMoisture;
                    case 4 -> PetriDishBlockEntity.this.nourishment;
                    case 5 -> PetriDishBlockEntity.this.maxNourishment;

                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index){
                    case 0 -> PetriDishBlockEntity.this.progress = value;
                    case 1 -> PetriDishBlockEntity.this.maxProgress = value;
                    case 2 -> PetriDishBlockEntity.this.moisture = value;
                    case 3 -> PetriDishBlockEntity.this.maxMoisture = value;
                    case 4 -> PetriDishBlockEntity.this.nourishment = value;
                    case 5 -> PetriDishBlockEntity.this.maxNourishment = value;
                }
            }

            @Override
            public int size() {
                return 6;
            }
        };
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
        buf.writeBlockPos(this.pos);
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable("petri_dish_gui_name");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new PetriDishScreenHandler(syncId,playerInventory,this,this.propertyDelegate);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt,inventory);
        nbt.putInt("petri_dish",progress);
        nbt.putInt("petri_dish_moisture",moisture);
        nbt.putInt("petri_dish_nourishment",nourishment);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt,inventory);
        progress = nbt.getInt("petri_dish");
        moisture = nbt.getInt("petri_dish_moisture");
        nourishment = nbt.getInt("petri_dish_nourishment");
    }

    public void tick(World world1, BlockPos pos, BlockState state1) {
        if (world1.isClient()){
            return;
        }
        if (hsaWater()){
                addMoisture();
        }

        if (hsaFood()){
                addNourishment();
        }
        if (isCellsSlotAvailable()){
            if (this.hsaRecipe()){
                this.increaseCraftProgress();
                markDirty(world1,pos,state1);

                if (hasCraftingFinished()){
                    this.addCells();
                    this.resetProgress();

                }
            }else {
                this.resetProgress();
            }
        }else {
            this.resetProgress();
            markDirty(world1, pos, state1);
        }
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private boolean hsaWater(){
        if (getStack(WATER).getItem() == Items.POTION){
            return true;
        }
        else return false;
    }

    private boolean hsaFood(){
        if (getStack(FOOD).getItem() == Items.SUGAR){
            return true;
        }
        else return false;
    }

    private void addMoisture() {
        Item hasWater = getStack(WATER).getItem();
        if (moisture < maxMoisture){
            if (hasWater == Items.POTION){
                this.setStack(WATER,new ItemStack(Items.GLASS_BOTTLE));
                moisture = moisture + 4;
                if (moisture > maxMoisture){
                    moisture = maxMoisture;
                }
            }
        }
    }

    private void addNourishment() {
        Item hasFood = getStack(FOOD).getItem();
        if
        (nourishment < maxNourishment){
            if (hasFood == Items.SUGAR){
                this.removeStack(FOOD,1);
                nourishment++;
                if (nourishment > maxNourishment){
                    nourishment = maxNourishment;
                }
            }
        }
    }

    private void addCells() {
        ItemStack result = new ItemStack(ModItems.YEAST);
        this.setStack(CELLS,new ItemStack(result.getItem(),getStack(CELLS).getCount() + result.getCount()));
        this.nourishment--;
        this.moisture--;
    }

    private boolean hasCraftingFinished() {
        return progress >= maxProgress && moisture > 0 && nourishment > 0;
    }

    private void increaseCraftProgress() {
        progress++;
    }

    private boolean hsaRecipe() {
        ItemStack result = new ItemStack(ModItems.YEAST);
        boolean hasCells = getStack(CELLS).getItem() == ModItems.YEAST;

        return hasCells && canInsertAmountIntoOutputSlot(result) && canInsertItemIntoOutputSlot(result.getItem()) && moisture > 0 && nourishment > 0;
    }

    private boolean canInsertAmountIntoOutputSlot(ItemStack result) {
        return this.getStack(CELLS).getCount() + result.getCount() <= getStack(CELLS).getMaxCount() && this.getStack(CELLS).getCount()!=0 ;
    }

    private boolean canInsertItemIntoOutputSlot(Item item) {
        return this.getStack(CELLS).getItem() == item;
    }

    private boolean isCellsSlotAvailable() {
        return this.getStack(CELLS).getCount() < this.getStack(CELLS).getMaxCount();
    }

}
