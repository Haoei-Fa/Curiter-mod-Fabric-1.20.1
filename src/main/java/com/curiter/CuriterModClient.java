package com.curiter;

import com.curiter.screen.GaruinkaExtractorsScreen;
import com.curiter.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class CuriterModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.GARUINKA_EXTRACTORS_SCREEN_HANDLER, GaruinkaExtractorsScreen::new);
    }
}
