package com.curiter.item.custom;

import com.curiter.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RESIN_SCYTHE extends SwordItem {
    public RESIN_SCYTHE(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        if (!world.isClient()) {
                boolean foundBlock = false;
                BlockPos pos = context.getBlockPos();
                PlayerEntity player = context.getPlayer();
                ItemStack stack = context.getStack();
                BlockState BlockState = world.getBlockState(context.getBlockPos());
            //检测是否按下Shift键
            if (Screen.hasShiftDown()) {
                //对橡木原木使用
                if (BlockIsOakLog(BlockState)) {
                    UseOnOakLog(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(1, context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
                //对深色橡木原木使用
                else if (BlockIsDarkOakWoodLog(BlockState)) {
                    UseOnDarkOakLog(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(1, context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
            }
        }
        return super.useOnBlock(context);
    }

    private boolean BlockIsOakLog(BlockState blockState){
        return blockState.isOf(Blocks.OAK_LOG);
    }
    private void UseOnOakLog(PlayerEntity player, World world, BlockPos blockPos){
        BlockState blockState = Blocks.STRIPPED_OAK_LOG.getDefaultState();
        world.setBlockState(blockPos, blockState);
        player.giveItemStack(new ItemStack(ModItems.RESIN));
    }

    private boolean BlockIsDarkOakWoodLog(BlockState blockState){
        return blockState.isOf(Blocks.DARK_OAK_LOG);
    }
    private void UseOnDarkOakLog(PlayerEntity player, World world, BlockPos blockPos){
        BlockState blockState = Blocks.STRIPPED_DARK_OAK_LOG.getDefaultState();
        world.setBlockState(blockPos, blockState);
        player.giveItemStack(new ItemStack(ModItems.RESIN));
    }
}
