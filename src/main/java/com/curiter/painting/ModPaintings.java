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

    private static PaintingVariant registerPainting(String name,PaintingVariant paintingVariant){
        return Registry.register(Registries.PAINTING_VARIANT,new Identifier(CuriterMod.MOD_ID,name),paintingVariant);
    }

    public static void resisterPaintings(){
        CuriterMod.LOGGER.info("Registering Paintings for" + CuriterMod.MOD_ID);
    }
}