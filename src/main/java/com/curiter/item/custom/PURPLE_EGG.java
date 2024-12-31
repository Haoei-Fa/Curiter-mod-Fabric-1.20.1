package com.curiter.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class PURPLE_EGG extends Item {
    public PURPLE_EGG(Settings settings) {
        super(settings);
    }

    int haste_amplifier,strength_amplifier,poison_amplifier,resistance_amplifier;

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient()) {
            if (RollNumber14() == 0) {
                world.createExplosion(user, user.getX(), user.getY(), user.getZ(), 5, false, World.ExplosionSourceType.TNT);
                user.sendMessage(Text.of("§4好吃到爆！"));
                user.kill();
            } else {
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 0));
                if (RollNumber100() <= 33) {
                    for (haste_amplifier = 0; haste_amplifier < 4; ) {
                        if (RollNumber100() <= 13) {
                            haste_amplifier++;
                        } else break;
                    }
                    user.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1200, haste_amplifier));
                }
                if (RollNumber100() <= 33) {
                    for (strength_amplifier = 0; strength_amplifier < 4; ) {
                        if (RollNumber100() <= 13) {
                            strength_amplifier++;
                        } else break;
                    }
                    user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, strength_amplifier));
                }
                if (RollNumber100() <= 33) {
                    for (poison_amplifier = 0; poison_amplifier < 4; ) {
                        if (RollNumber100() <= 13) {
                            poison_amplifier++;
                        } else break;
                    }
                    user.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 1200, poison_amplifier));
                }
                if (RollNumber100() <= 33) {
                    for (resistance_amplifier = 0; resistance_amplifier < 4; ) {
                        if (RollNumber100() <= 13) {
                            resistance_amplifier++;
                        } else break;
                    }
                    user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1200, resistance_amplifier));
                }
            }
        }
        return super.finishUsing(stack, world, user);
    }

    private static int RollNumber14(){
        return Random.createLocal().nextInt(14);
    }
    private static int RollNumber100(){
        return Random.createLocal().nextInt(100);
    }
}
