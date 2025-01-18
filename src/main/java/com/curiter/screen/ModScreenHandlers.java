package com.curiter.screen;

import com.curiter.CuriterMod;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<GaruinkaExtractorsScreenHandler> GARUINKA_EXTRACTORS_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER,new Identifier(CuriterMod.MOD_ID,"garuinka_extractors"),
                    new ExtendedScreenHandlerType<>(GaruinkaExtractorsScreenHandler::new));
    public static final ScreenHandlerType<MillScreenHandler> MILL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER,new Identifier(CuriterMod.MOD_ID,"mill"),
                    new ExtendedScreenHandlerType<>(MillScreenHandler::new));

    public static void registerScreenHandlers(){

    }
}
