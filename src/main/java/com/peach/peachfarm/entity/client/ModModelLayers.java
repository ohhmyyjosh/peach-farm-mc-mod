package com.peach.peachfarm.entity.client;

import com.peach.peachfarm.PeachFarm;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {
    public static final ModelLayerLocation PEACH_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(PeachFarm.MOD_ID, "boat/peach"), "main");
    public static final ModelLayerLocation PEACH_CHEST_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(PeachFarm.MOD_ID, "chest_boat/peach"), "main");


}
