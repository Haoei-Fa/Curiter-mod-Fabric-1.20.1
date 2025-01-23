package com.curiter.screen;


import com.curiter.CuriterMod;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class PetriDishScreen extends HandledScreen<PetriDishScreenHandler> {
    private static final Identifier TEXTURE = new Identifier(CuriterMod.MOD_ID,"textures/gui/petri_dish_gui.png");

    public PetriDishScreen(PetriDishScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
        titleX = (backgroundWidth  - textRenderer.getWidth(title)) / 2;
        playerInventoryTitleY = this.backgroundHeight - 94;
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1f,1f,1f,1f);
        RenderSystem.setShaderTexture(0,TEXTURE);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;

        context.drawTexture(TEXTURE,x,y,0,0,backgroundWidth,backgroundHeight);

        renderProgress(context, x, y);
    }

    private void renderProgress(DrawContext context, int x, int y) {
        if (handler.isCrafting()){
            context.drawTexture(TEXTURE,x + 75, y + 54, 176,0,handler.getScaledProgress(),4);
        }
        if (handler.haveFood()){
            context.drawTexture(TEXTURE,x + 54, y + 30, 180,4,4,32-handler.getScaledProgressFood());
        }
        if (handler.haveWater()){
            context.drawTexture(TEXTURE,x + 46, y + 30, 176,4,4,32-handler.getScaledProgressWater());
        }
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context,mouseX,mouseY);
    }
}
