package net.mrmisc.mymod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrmisc.mymod.MyMod;
import net.mrmisc.mymod.entity.custom.GruntEntity;
import net.mrmisc.mymod.entity.projectile.Rock;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MyMod.MOD_ID);

    public static final RegistryObject<EntityType<Rock>> ROCK = ENTITY_TYPES.register("rock", () -> EntityType.Builder.<Rock>of(Rock::new, MobCategory.MISC).sized(0.75F, 0.75F).build(MyMod.MOD_ID + ":rock"));
    public static final RegistryObject<EntityType<GruntEntity>> GRUNT = ENTITY_TYPES.register("grunt", () -> EntityType.Builder.<GruntEntity>of(GruntEntity::new, MobCategory.MONSTER).sized(1.5f, 5f).build(MyMod.MOD_ID + "monster"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}

