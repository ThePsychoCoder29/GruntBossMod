package net.mrmisc.mymod.entity.client;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.mrmisc.mymod.MyMod;

public class ModModelLayers {
    public static final ModelLayerLocation GRUNT_LAYER = new ModelLayerLocation(
            new ResourceLocation(MyMod.MOD_ID, "grunt_layer"), "main");

    public static final ModelLayerLocation ROCK_LAYER = new ModelLayerLocation(
            new ResourceLocation(MyMod.MOD_ID, "rock_layer"), "main");

}
