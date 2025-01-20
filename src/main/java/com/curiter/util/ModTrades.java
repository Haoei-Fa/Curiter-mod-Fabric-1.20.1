package com.curiter.util;

import com.curiter.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;

public class ModTrades {
    public static void registerTrades(){
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(ModItems.YEAST, 5),
                            5, 0, 0.0f
                    ));
        });
    }
}
