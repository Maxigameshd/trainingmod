package net.maxigames.araflo.item;

import net.maxigames.araflo.ArafloBlades;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ArafloBlades.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TEST_TAB = CREATIVE_MODE_TABS.register("test_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TOPAZ.get()))
                    .title(Component.translatable("creativetab.test_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.TOPAZ.get());
                        pOutput.accept(ModItems.TOPAZ_SWORD.get());




                    })
                    .build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
