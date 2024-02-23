package com.peach.peachfarm.item;

import com.peach.peachfarm.PeachFarm;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PeachFarm.MOD_ID);

    public static final RegistryObject<Item> PEACH = ITEMS.register("peach",
            () -> new Item(new Item.Properties().food(ModFoods.PEACH)));

    public static final RegistryObject<Item> PEACH_COBBLER = ITEMS.register("peach_cobbler",
            () -> new Item(new Item.Properties().food(ModFoods.PEACH_COBBLER)));

    public static final RegistryObject<Item> PEACH_JUICE = ITEMS.register("peach_juice",
            () -> new Item(new Item.Properties().food(ModFoods.PEACH_JUICE)));

    public static final RegistryObject<Item> PEACH_PIE = ITEMS.register("peach_pie",
            () -> new Item(new Item.Properties().food(ModFoods.PEACH_PIE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
