package com.curiter.painting;
import com.curiter.CuriterMod;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModPaintings {
    public static final PaintingVariant GREEN_MILK_CANDY = registerPainting("green_milk_candy",new PaintingVariant(32,32));
    public static final PaintingVariant FAFA = registerPainting("fafa",new PaintingVariant(16,16));
    public static final PaintingVariant HECHUWU = registerPainting("hechuwu",new PaintingVariant(16,16));
    public static final PaintingVariant ANCIENT_CASTLE_UNDER_THE_BLOOD_MOON_PAINTING = registerPainting("ancient_castle_under_the_blood_moon_painting",new PaintingVariant(64,48));
    public static final PaintingVariant SLEEPING_ATLANTIS_PAINTING = registerPainting("sleeping_atlantis_painting",new PaintingVariant(64,32));
    public static final PaintingVariant HECHUWU1 = registerPainting("hechuwu1",new PaintingVariant(16,16));
    public static final PaintingVariant CURITER = registerPainting("curiter",new PaintingVariant(16,16));
    public static final PaintingVariant CURITER_NEW = registerPainting("curiter_new",new PaintingVariant(16,16));
    public static final PaintingVariant SUNDAE = registerPainting("sundae",new PaintingVariant(16,16));
    public static final PaintingVariant CANDY_STAR_PARADISE_PAINTING = registerPainting("candy_star_paradise_painting",new PaintingVariant(48,48));

    private static PaintingVariant registerPainting(String name,PaintingVariant paintingVariant){
        return Registry.register(Registries.PAINTING_VARIANT,new Identifier(CuriterMod.MOD_ID,name),paintingVariant);
    }

    public static void resisterPaintings(){
        CuriterMod.LOGGER.info("Registering Paintings for" + CuriterMod.MOD_ID);
    }
}