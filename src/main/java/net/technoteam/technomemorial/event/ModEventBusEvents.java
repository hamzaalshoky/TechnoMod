package net.technoteam.technomemorial.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.technoteam.technomemorial.TechnoMemorialMod;
import net.technoteam.technomemorial.entity.ModEntityTypes;
import net.technoteam.technomemorial.entity.custom.TechnoEntity;

@Mod.EventBusSubscriber(modid = TechnoMemorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.TECHNO.get(), TechnoEntity.setAttributes());
    }
}
