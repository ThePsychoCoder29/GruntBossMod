package net.mrmisc.mymod.entity.projectile;

import net.minecraft.client.model.Model;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Function;

@OnlyIn(Dist.CLIENT)
public abstract class RockModelBase extends Model{
    public RockModelBase() {
        super(RenderType::entityTranslucent);

    }
    public abstract void setupAnim(float p_170950_, float p_170951_, float p_170952_);
}

