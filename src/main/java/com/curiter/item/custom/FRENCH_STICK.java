package com.curiter.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class FRENCH_STICK extends Item {

    private static final int MAX_USE_TIME = 32;

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return ItemUsage.consumeHeldItem(world, user, hand);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient()) {
            ((PlayerEntity)user).getHungerManager().add(4, 1.0F);
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600, 1));
            stack.damage(34, user, PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
        }
        return super.finishUsing(stack, world, user);
    }

    int Attack;

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        Attack = 3+(19+stack.getMaxDamage()-stack.getDamage())/20;
        target.damage(target.getDamageSources().mobAttack(attacker),Attack);
        stack.damage(1, attacker, PlayerEntity -> PlayerEntity.sendToolBreakStatus(PlayerEntity.getActiveHand()));
        return super.postHit(stack, target, attacker);
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 32;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.EAT;
    }

    public FRENCH_STICK(Settings settings) {
        super(settings);
    }
}
