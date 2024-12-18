package com.curiter.item.custom;

import com.curiter.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GARUINKA_COLLECTORS extends Item {
    public GARUINKA_COLLECTORS(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        if (!world.isClient()){
            boolean foundBlock = false;
            BlockPos pos = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            ItemStack stack = context.getStack();
            BlockState BlockState = world.getBlockState(context.getBlockPos());
            if (BlockIsRight(BlockState)){
                ObtainGaruinka(player,context.getWorld(),context.getBlockPos());
                context.getStack().damage(-2500,context.getPlayer(),PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
            }
        }

        return super.useOnBlock(context);
    }

    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player) {
        super.onCraft(stack, world, player);
        stack.setDamage(10000);
    }

    private boolean BlockIsRight(BlockState blockState){
        return blockState.isOf(ModBlocks.CURITER_BLOCK);
    }
    private void ObtainGaruinka(PlayerEntity player,World world,BlockPos blockPos){
        world.breakBlock(blockPos,false);
    }
}
