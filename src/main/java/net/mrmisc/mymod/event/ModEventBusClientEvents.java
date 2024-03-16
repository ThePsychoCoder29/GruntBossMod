package net.mrmisc.mymod.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.mrmisc.mymod.MyMod;
import net.mrmisc.mymod.entity.client.GruntModel;
import net.mrmisc.mymod.entity.client.ModModelLayers;
import net.mrmisc.mymod.entity.projectile.RockModel;
import net.mrmisc.mymod.entity.projectile.RockRenderer;

@Mod.EventBusSubscriber(modid = MyMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {

    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.GRUNT_LAYER, GruntModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.ROCK_LAYER, RockRenderer::createBodyLayer);
    }


}

