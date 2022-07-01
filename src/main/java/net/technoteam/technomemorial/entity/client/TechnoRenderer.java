package net.technoteam.technomemorial.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.technoteam.technomemorial.entity.custom.TechnoEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class TechnoRenderer extends GeoEntityRenderer<TechnoEntity> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("animalistic:textures/entity/techno/techno.png");

    public TechnoRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new TechnoModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(TechnoEntity instance) {
        return TEXTURE;
    }


    @Override
    public RenderType getRenderType(TechnoEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
            stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
