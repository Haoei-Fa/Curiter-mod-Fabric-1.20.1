package com.curiter.item.custom;

import com.curiter.util.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

import java.util.List;

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
            //对草方块使用
            if (BlockIsGrassBlock(BlockState)){
                if (context.getStack().getDamage() != 0) {
                    UseOnGrassBlock(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-1, context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
            }
            //对凋零玫瑰使用
            else if (BlockIsWitherRose(BlockState)){
                if (context.getStack().getDamage() != 0) {
                    UseOnWitherRose(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-20-RollNumber3(), context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
            }
            //对花卉使用
            else if (BlockIsFlowers(BlockState)){
                if (context.getStack().getDamage() != 0) {
                    UseOnFlowers(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-2-RollNumber1(), context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
            }
            //对草使用
            else if (BlockIsGrass(BlockState)){
                if (context.getStack().getDamage() != 0) {
                    UseOnGrass(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-2, context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
            }
            //对树苗使用
            else if (BlockIsSaplings(BlockState)){
                if (context.getStack().getDamage() != 0) {
                    UseOnSaplings(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-5-RollNumber2(), context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
            }
            //对红石矿使用
            else if (BlockIsRedStone(BlockState)){
                if (context.getStack().getDamage() != 0) {
                    UseOnRedStone(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-20-RollNumber3(), context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
            }
            //对深层红石矿使用
            else if (BlockIsDeepSlateRedStone(BlockState)){
                if (context.getStack().getDamage() != 0) {
                    UseOnDeepSlateRedStone(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-20-RollNumber3(), context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
            }

        }

        return super.useOnBlock(context);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        List<AreaEffectCloudEntity> list = world.getEntitiesByClass(
                AreaEffectCloudEntity.class,
                user.getBoundingBox().expand(2.0),
                entity -> entity != null && entity.isAlive() && entity.getOwner() instanceof EnderDragonEntity
        );
        if (!world.isClient()){
                if (!list.isEmpty()) {
                    if (user.getStackInHand(hand).getDamage() != 0){
                        AreaEffectCloudEntity areaEffectCloudEntity = (AreaEffectCloudEntity)list.get(0);
                        areaEffectCloudEntity.setRadius(areaEffectCloudEntity.getRadius() - 0.5F);
                        user.getStackInHand(hand).setDamage(user.getStackInHand(hand).getDamage()-RollNumber4()-20);
                    }
                }
        }

        ItemStack itemStack = user.getStackInHand(hand);
        return super.use(world, user, hand);
    }

    int timer = 0;

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient()){
            timer++;
            if (stack.getDamage() != 0){
                if(timer >= 200){
                    stack.setDamage(stack.getDamage()-1);
                    timer = 0;
                }
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player) {
        super.onCraft(stack, world, player);
        stack.setDamage(10000);
    }

    private boolean BlockIsGrassBlock(BlockState blockState){
        return blockState.isOf(Blocks.GRASS_BLOCK);
    }
    private void UseOnGrassBlock(PlayerEntity player, World world, BlockPos blockPos){
       BlockState blockState1 = Blocks.DIRT.getDefaultState();
        world.setBlockState(blockPos,blockState1);
    }

    private boolean BlockIsWitherRose(BlockState blockState){
        return blockState.isOf(Blocks.WITHER_ROSE);
    }
    private void UseOnWitherRose(PlayerEntity player, World world, BlockPos blockPos){
        world.breakBlock(blockPos,false);
    }

    private boolean BlockIsFlowers(BlockState blockState){
        return blockState.isIn(ModTags.Blocks.FLOWERS_LIST);
    }
    private void UseOnFlowers(PlayerEntity player, World world, BlockPos blockPos){
        world.breakBlock(blockPos,false);
    }

    private boolean BlockIsGrass(BlockState blockState){
        return blockState.isIn(ModTags.Blocks.GRASS_LIST);
    }
    private void UseOnGrass(PlayerEntity player, World world, BlockPos blockPos){
        world.breakBlock(blockPos,false);
    }

    private boolean BlockIsSaplings(BlockState blockState){
        return blockState.isIn(ModTags.Blocks.SAPLINGS_LIST);
    }
    private void UseOnSaplings(PlayerEntity player, World world, BlockPos blockPos){
        BlockState blockState2 = Blocks.DEAD_BUSH.getDefaultState();
        world.setBlockState(blockPos,blockState2);
    }

    private boolean BlockIsRedStone(BlockState blockState){
        return blockState.isOf(Blocks.REDSTONE_ORE);
    }
    private void UseOnRedStone(PlayerEntity player, World world, BlockPos blockPos){
        BlockState blockState3 = Blocks.STONE.getDefaultState();
        world.setBlockState(blockPos,blockState3);
    }

    private boolean BlockIsDeepSlateRedStone(BlockState blockState){
        return blockState.isOf(Blocks.DEEPSLATE_REDSTONE_ORE);
    }
    private void UseOnDeepSlateRedStone(PlayerEntity player, World world, BlockPos blockPos){
        BlockState blockState4 = Blocks.DEEPSLATE.getDefaultState();
        world.setBlockState(blockPos,blockState4);
    }

    private static int RollNumber1(){
        return Random.createLocal().nextInt(9);
    }
    private static int RollNumber2(){
        return Random.createLocal().nextInt(6);
    }
    private static int RollNumber3(){
        return Random.createLocal().nextInt(31);
    }
    private static int RollNumber4(){
        return Random.createLocal().nextInt(81);
    }
}
