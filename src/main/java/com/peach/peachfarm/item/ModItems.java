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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
