package net.technoteam.technomemorial.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.technoteam.technomemorial.TechnoMemorialMod;
import net.technoteam.technomemorial.entity.custom.TechnoEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class TechnoModel extends AnimatedGeoModel<TechnoEntity> {
    @Override
    public ResourceLocation getModelLocation(TechnoEntity object) {
        return new ResourceLocation(TechnoMemorialMod.MOD_ID, "geo/techno.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(TechnoEntity object) {
        return new ResourceLocation(TechnoMemorialMod.MOD_ID, "textures/entity/techno/techno.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(TechnoEntity animatable) {
        return new ResourceLocation(TechnoMemorialMod.MOD_ID, "animations/techno.animation.json");
    }
}
