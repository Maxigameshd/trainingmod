package net.maxigames.araflo.item;

import net.maxigames.araflo.ArafloBlades;
import net.maxigames.araflo.item.custom.CustomSwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ArafloBlades.MOD_ID);


    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<SwordItem> TOPAZ_SWORD = ITEMS.register("topaz_sword",
            () -> new CustomSwordItem(new Item.Properties().durability(1356)));







    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
