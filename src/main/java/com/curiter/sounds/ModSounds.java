package com.curiter.sounds;

import com.curiter.CuriterMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent THE_PARADOX_OF_THEOREM_SEVEN = registerSoundEvents("the_paradox_of_theorem_seven");
    public static final SoundEvent CANDY_STAR_PARADISE = registerSoundEvents("candy_star_paradise");
    public static final SoundEvent BLACK_BLOOD = registerSoundEvents("black_blood");
    public static final SoundEvent ANCIENT_CASTLE_UNDER_THE_BLOOD_MOON = registerSoundEvents("ancient_castle_under_the_blood_moon");
    public static final SoundEvent EVANESCENT_STAR = registerSoundEvents("evanescent_star");
    public static final SoundEvent CRASHED_STAR = registerSoundEvents("crashed_star");
    public static final SoundEvent SLEEPING_ATLANTIS = registerSoundEvents("sleeping_atlantis");
    public static final SoundEvent DIMENSION_CABINET = registerSoundEvents("dimension_cabinet");
    public static final SoundEvent THE_CURITER = registerSoundEvents("the_curiter");
    public static final SoundEvent GRAVITATIONAL_EQUILIBRIUM = registerSoundEvents("gravitational_equilibrium");
    public static final SoundEvent BLOOD_FALSEHOOD = registerSoundEvents("blood_falsehood");
    public static final SoundEvent GOD_GHOSTS_AND_DAO_SYMBOL = registerSoundEvents("god_ghosts_and_dao_symbol");
    public static final SoundEvent GLITCH_ART = registerSoundEvents("glitch_art");
    public static final SoundEvent THE_SUKATUO = registerSoundEvents("the_sukatuo");

    public static SoundEvent registerSoundEvents(String name){
        Identifier identifier = new Identifier(CuriterMod.MOD_ID,name);
        return Registry.register(Registries.SOUND_EVENT,identifier,SoundEvent.of(identifier));
    }
    public static void registerSounds(){}
}
