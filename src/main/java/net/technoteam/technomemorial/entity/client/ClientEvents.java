package net.technoteam.technomemorial.entity.client;

import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.technoteam.technomemorial.TechnoMemorialMod;
import net.technoteam.technomemorial.entity.ModEntityTypes;
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = TechnoMemorialMod.MOD_ID)
public class ClientEvents {

    @SubscribeEvent
    public static void registerEntityRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityTypes.TECHNO.get(), TechnoRenderer::new);
    }
}
