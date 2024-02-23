package com.peach.peachfarm.item;

import com.peach.peachfarm.PeachFarm;
import com.peach.peachfarm.block.ModBlocks;
import com.peach.peachfarm.entity.custom.ModBoatEntity;
import com.peach.peachfarm.item.custom.ModBoatItem;
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

    public static final RegistryObject<Item> PEACH_SIGN = ITEMS.register("peach_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.PEACH_SIGN.get(), ModBlocks.PEACH_WALL_SIGN.get()));
    public static final RegistryObject<Item> PEACH_HANGING_SIGN = ITEMS.register("peach_hanging_sign",
            () -> new HangingSignItem(ModBlocks.PEACH_HANGING_SIGN.get(), ModBlocks.PEACH_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> PEACH_BOAT = ITEMS.register("peach_boat",
            () -> new ModBoatItem(false, ModBoatEntity.Type.PEACH, new Item.Properties()));
    public static final RegistryObject<Item> PEACH_CHEST_BOAT = ITEMS.register("peach_chest_boat",
            () -> new ModBoatItem(true, ModBoatEntity.Type.PEACH, new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
