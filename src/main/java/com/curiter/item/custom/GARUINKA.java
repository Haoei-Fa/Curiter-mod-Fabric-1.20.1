package com.curiter.item.custom;

import com.curiter.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GARUINKA extends Item {
    public GARUINKA(Settings settings) {
        super(settings);
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
            //对紫水晶块使用
            if (BlockIsAmethyst_Block(BlockState)){
                UseOnAmethyst_Block(player, context.getWorld(), context.getBlockPos());
                context.getStack().setCount(context.getStack().getCount()-1);
            }
        }
        return super.useOnBlock(context);
    }

    private boolean BlockIsAmethyst_Block(BlockState blockState){
        return blockState.isOf(Blocks.AMETHYST_BLOCK);
    }
    private void UseOnAmethyst_Block(PlayerEntity player, World world, BlockPos blockPos){
        BlockState blockState1 = Blocks.BUDDING_AMETHYST.getDefaultState();
        world.setBlockState(blockPos,blockState1);
        player.giveItemStack(new ItemStack(ModItems.GARUINKA_STORAGE_BOTTLE));
    }
}
