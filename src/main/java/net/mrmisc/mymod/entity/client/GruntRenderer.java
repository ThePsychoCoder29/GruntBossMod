package net.mrmisc.mymod.entity.client;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.mrmisc.mymod.MyMod;
import net.mrmisc.mymod.entity.custom.GruntEntity;
import net.mrmisc.mymod.entity.projectile.Rock;
import net.mrmisc.mymod.entity.projectile.RockModel;

public class GruntRenderer extends MobRenderer<GruntEntity, GruntModel<GruntEntity>> {


    public GruntRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new GruntModel<>(pContext.bakeLayer(ModModelLayers.GRUNT_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(GruntEntity pEntity) {
        return new ResourceLocation(MyMod.MOD_ID, "textures/entity/grunt.png");
    }
}
