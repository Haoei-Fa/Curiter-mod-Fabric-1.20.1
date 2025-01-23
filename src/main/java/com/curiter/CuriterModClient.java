package com.curiter;

import com.curiter.screen.GaruinkaExtractorsScreen;
import com.curiter.screen.MillScreen;
import com.curiter.screen.PetriDishScreen;
import com.curiter.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class CuriterModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.GARUINKA_EXTRACTORS_SCREEN_HANDLER, GaruinkaExtractorsScreen::new);
        HandledScreens.register(ModScreenHandlers.MILL_SCREEN_HANDLER, MillScreen::new);
        HandledScreens.register(ModScreenHandlers.PETRI_DISH_SCREEN_HANDLER, PetriDishScreen::new);
    }
}
