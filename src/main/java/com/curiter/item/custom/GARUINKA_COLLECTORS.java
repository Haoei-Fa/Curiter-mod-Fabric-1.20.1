package com.curiter.item.custom;

import com.curiter.block.ModBlocks;
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
            if (context.getStack().getDamage() != 0) {
                //对草方块使用
                if (BlockIsGrassBlock(BlockState)){
                    UseOnGrassBlock(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-1, context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
                //对凋零玫瑰使用
                else if (BlockIsWitherRose(BlockState)){
                    UseOnWitherRose(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-20-RollNumber3(), context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
                //对花卉使用
                else if (BlockIsFlowers(BlockState)){
                    UseOnFlowers(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-2-RollNumber1(), context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));

                }
                //对草使用
                else if (BlockIsGrass(BlockState)){
                    UseOnGrass(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-2, context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
                //对盛开的杜鹃花丛使用
                else if (BlockIsFloweringAzalea(BlockState)){
                    UseOnFloweringAzalea(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-2-RollNumber1(), context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
                //对树苗使用
                else if (BlockIsSaplings(BlockState)){
                    UseOnSaplings(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-5-RollNumber2(), context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
                //对红石矿使用
                else if (BlockIsRedStone(BlockState)){
                    UseOnRedStone(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-20-RollNumber3(), context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
                //对深层红石矿使用
                else if (BlockIsDeepSlateRedStone(BlockState)){
                    UseOnDeepSlateRedStone(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-20-RollNumber3(), context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
                //对盛开的杜鹃树叶使用
                else if (BlockIsFloweringAzaleaLeave(BlockState)){
                    UseOnFloweringAzaleaLeave(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-2-RollNumber1(), context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
                //对树叶使用
                else if (BlockIsLeaves(BlockState)){
                    UseOnLeaves(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-1, context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
                //对刷怪笼使用
                else if (BlockIsSpawner(BlockState)){
                    UseOnSpawner(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-500-RollNumber5(), context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
                //对蘑菇类方块使用
                else if (BlockIsMushroom(BlockState)){
                    UseOnMushroom(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-2-RollNumber1(), context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
                //对菌光体使用
                else if (BlockIsShroomLight(BlockState)){
                    UseOnShroomLight(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-2-RollNumber6(), context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
                //对泥土变种使用
                else if (BlockIsDirt(BlockState)){
                    UseOnDirt(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-2, context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
                //对其他植物使用
                else if (BlockIsOtherPlants(BlockState)){
                    UseOnOtherPlants(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-2-RollNumber7(), context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
                //对幽匿方块使用
                else if (BlockIsSculkBlocks(BlockState)){
                    UseOnSculkBlocks(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-2-RollNumber7(), context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
                //对下界岩变种使用
                else if (BlockIsNetherRacks(BlockState)){
                    UseOnNetherRacks(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-2, context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
                //对萤石使用
                else if (BlockIsGlowStone(BlockState)){
                    UseOnGlowStone(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-5-RollNumber8(), context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
                //对紫水晶使用
                else if (BlockIsAmethystCluster(BlockState)){
                    UseOnAmethystCluster(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-20-RollNumber3(), context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
                //对格林卡富集矿使用
                else if (BlockIsGaruinkaMineral(BlockState)){
                    UseOnGaruinkaMineral(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-500-RollNumber3(), context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                }
                //对深层格林卡富集矿使用
                else if (BlockIsDeepslateGaruinkaMineral(BlockState)){
                    UseOnDeepslateGaruinkaMineral(player, context.getWorld(), context.getBlockPos());
                    context.getStack().damage(-500-RollNumber3(), context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
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
                    //对龙息使用
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

    //计时器
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
       BlockState blockState = Blocks.DIRT.getDefaultState();
        world.setBlockState(blockPos, blockState);
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
        BlockState blockState = Blocks.DEAD_BUSH.getDefaultState();
        world.setBlockState(blockPos, blockState);
    }

    private boolean BlockIsRedStone(BlockState blockState){
        return blockState.isOf(Blocks.REDSTONE_ORE);
    }
    private void UseOnRedStone(PlayerEntity player, World world, BlockPos blockPos){
        BlockState blockState = Blocks.STONE.getDefaultState();
        world.setBlockState(blockPos, blockState);
    }

    private boolean BlockIsDeepSlateRedStone(BlockState blockState){
        return blockState.isOf(Blocks.DEEPSLATE_REDSTONE_ORE);
    }
    private void UseOnDeepSlateRedStone(PlayerEntity player, World world, BlockPos blockPos){
        BlockState blockState = Blocks.DEEPSLATE.getDefaultState();
        world.setBlockState(blockPos, blockState);
    }

    private boolean BlockIsLeaves(BlockState blockState){
        return blockState.isIn(ModTags.Blocks.LEAVES_LIST);
    }
    private void UseOnLeaves(PlayerEntity player, World world, BlockPos blockPos){
        world.breakBlock(blockPos,false);
    }

    private boolean BlockIsFloweringAzalea(BlockState blockState){
        return blockState.isOf(Blocks.FLOWERING_AZALEA);
    }
    private void UseOnFloweringAzalea(PlayerEntity player, World world, BlockPos blockPos){
        BlockState blockState = Blocks.AZALEA.getDefaultState();
        world.setBlockState(blockPos,blockState);
    }

    private boolean BlockIsFloweringAzaleaLeave(BlockState blockState){
        return blockState.isOf(Blocks.FLOWERING_AZALEA_LEAVES);
    }
    private void UseOnFloweringAzaleaLeave(PlayerEntity player, World world, BlockPos blockPos){
        BlockState blockState = Blocks.AZALEA_LEAVES.getDefaultState();
        world.setBlockState(blockPos,blockState);
    }

    private boolean BlockIsSpawner(BlockState blockState){
        return blockState.isOf(Blocks.SPAWNER);
    }
    private void UseOnSpawner(PlayerEntity player, World world, BlockPos blockPos){
        world.breakBlock(blockPos,false);
    }

    private boolean BlockIsMushroom(BlockState blockState){
        return blockState.isIn(ModTags.Blocks.MUSHROOMS_LIST);
    }
    private void UseOnMushroom(PlayerEntity player, World world, BlockPos blockPos){
        world.breakBlock(blockPos,false);
    }

    private boolean BlockIsShroomLight(BlockState blockState){
        return blockState.isOf(Blocks.SHROOMLIGHT);
    }
    private void UseOnShroomLight(PlayerEntity player, World world, BlockPos blockPos) {
        world.breakBlock(blockPos, false);
    }

    private boolean BlockIsDirt(BlockState blockState){
        return blockState.isIn(ModTags.Blocks.DIRT_LIST);
    }
    private void UseOnDirt(PlayerEntity player, World world, BlockPos blockPos){
        BlockState blockState = Blocks.DIRT.getDefaultState();
        world.setBlockState(blockPos,blockState);
    }

    private boolean BlockIsOtherPlants(BlockState blockState){
        return blockState.isIn(ModTags.Blocks.OTHER_PLANTS_LIST);
    }
    private void UseOnOtherPlants(PlayerEntity player, World world, BlockPos blockPos){
        world.breakBlock(blockPos,false);
    }

    private boolean BlockIsSculkBlocks(BlockState blockState){
        return blockState.isIn(ModTags.Blocks.SCULK_BLOCKS_LIST);
    }
    private void UseOnSculkBlocks(PlayerEntity player, World world, BlockPos blockPos){
        world.breakBlock(blockPos,false);
    }

    private boolean BlockIsNetherRacks(BlockState blockState){
        return blockState.isIn(ModTags.Blocks.NETHER_RACKS_LIST);
    }
    private void UseOnNetherRacks(PlayerEntity player, World world, BlockPos blockPos){
        BlockState blockState = Blocks.NETHERRACK.getDefaultState();
        world.setBlockState(blockPos,blockState);
    }

    private boolean BlockIsGlowStone(BlockState blockState){
        return blockState.isOf(Blocks.GLOWSTONE);
    }
    private void UseOnGlowStone(PlayerEntity player, World world, BlockPos blockPos) {
        world.breakBlock(blockPos, false);
    }

    private boolean BlockIsAmethystCluster(BlockState blockState){
        return blockState.isOf(Blocks.AMETHYST_CLUSTER);
    }
    private void UseOnAmethystCluster(PlayerEntity player, World world, BlockPos blockPos) {
        world.breakBlock(blockPos, false);
    }

    private boolean BlockIsGaruinkaMineral(BlockState blockState){
        return blockState.isOf(ModBlocks.GARUINKA_MINERAL);
    }
    private void UseOnGaruinkaMineral(PlayerEntity player, World world, BlockPos blockPos) {
        BlockState blockState = Blocks.STONE.getDefaultState();
        world.setBlockState(blockPos, blockState);
    }
    private boolean BlockIsDeepslateGaruinkaMineral(BlockState blockState){
        return blockState.isOf(ModBlocks.DEEPSLATE_GARUINKA_MINERAL);
    }
    private void UseOnDeepslateGaruinkaMineral(PlayerEntity player, World world, BlockPos blockPos) {
        BlockState blockState = Blocks.DEEPSLATE.getDefaultState();
        world.setBlockState(blockPos, blockState);
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
    private static int RollNumber5(){
        return Random.createLocal().nextInt(501);
    }
    private static int RollNumber6() {
        return Random.createLocal().nextInt(19);
    }
    private static int RollNumber7() {
        return Random.createLocal().nextInt(4);
    }
    private static int RollNumber8() {
        return Random.createLocal().nextInt(16);
    }
    private static int RollNumber9() {
        return Random.createLocal().nextInt(1501);
    }
}
