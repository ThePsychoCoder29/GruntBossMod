package net.mrmisc.mymod.entity.projectile;

import net.minecraft.core.Holder;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.phys.EntityHitResult;
import net.mrmisc.mymod.entity.ModEntities;
import org.jetbrains.annotations.NotNull;

public class RockDamageSource extends DamageSource {

    public static final RockDamageSource ROCK_DAMAGE = new RockDamageSource();

    protected RockDamageSource() {
        super((Holder<DamageType>) ModEntities.ROCK.get()); // "rock" is the key to identify the damage source, you can change it if you want
        // Customize the behavior of the damage source// Treat as an explosion
    }

    public static boolean ROCK_DAMAGE_SOURCE(EntityHitResult pResult) {
        Entity entity = pResult.getEntity();
        return entity.hurt(RockDamageSource.ROCK_DAMAGE, 8.0F);

    }

    public @NotNull EntityType<Rock> getSource() {
        return ModEntities.ROCK.get(); // Return the entity responsible for the damage if applicable, otherwise return null
    }
}
