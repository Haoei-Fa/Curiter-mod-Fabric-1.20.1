package com.curiter.item.custom;

import com.curiter.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GARUINKA_DETECTORS extends Item {
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos pos = context.getBlockPos();
        PlayerEntity player = context.getPlayer();
        World world = context.getWorld();

        if (!world.isClient()) {
            boolean foundBlock = false;
            context.getStack().damage(1, context.getPlayer(), PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
                //模糊搜索
                for (int i = -100; i <= 100; i++) {
                    for (int j = -7; j <= 7; j++) {
                        for (int k = -7; k <= 7; k++) {
                            BlockPos pos1 = pos.down(i).south(j).west(k);
                            BlockState blockState = world.getBlockState(pos1);
                            if (FoundGaruinkaMinerals(blockState)) {
                                outputMessage(pos1.down().north().east(),player,blockState.getBlock());
                                foundBlock = true;
                            }
                        }
                    }
                }
                if (!foundBlock) {
                player.sendMessage(Text.of("§4附近没有高浓度的格林卡"));
            }
        }

        return super.useOnBlock(context);
    }
    int x,y,z;
    private void outputMessage(BlockPos pos1, PlayerEntity player, Block block) {
        x = pos1.getX()-1;
        y = pos1.getY()+1;
        z = pos1.getZ()+1;
        player.sendMessage(Text.of("§b在坐标" +  "(" + x + "," + y + "," + z + ")处发现了高浓度的格林卡"),false);
    }

    private boolean FoundGaruinkaMinerals(BlockState blockState) {
        if (blockState.isIn(ModTags.Blocks.GARUINKA_MINERALS) || blockState.isOf(Blocks.SPAWNER)){
            return true;
        }
        else {
            return false;
        }
    }

    public GARUINKA_DETECTORS(Settings settings) {
        super(settings);
    }
}
