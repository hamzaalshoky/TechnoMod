package net.technoteam.technomemorial.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.technoteam.technomemorial.TechnoMemorialMod;
import net.technoteam.technomemorial.entity.custom.TechnoEntity;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, TechnoMemorialMod.MOD_ID);

    public static final RegistryObject<EntityType<TechnoEntity>> TECHNO = ENTITY_TYPES.register("techno",
            () -> EntityType.Builder.of(TechnoEntity::new, MobCategory.CREATURE)
                    .sized(0.9f, 1.5f)
                    .build(new ResourceLocation(TechnoMemorialMod.MOD_ID, "techno").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
