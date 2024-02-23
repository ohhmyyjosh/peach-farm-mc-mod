package com.peach.peachfarm.worldgen.tree;

import com.peach.peachfarm.PeachFarm;
import com.peach.peachfarm.worldgen.tree.custom.PeachFoliagePlacer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModFoliagePlacers {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACERS =
            DeferredRegister.create(Registries.FOLIAGE_PLACER_TYPE, PeachFarm.MOD_ID);

    public static final RegistryObject<FoliagePlacerType<PeachFoliagePlacer>> PEACH_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("peach_foliage_placer", () -> new FoliagePlacerType<>(PeachFoliagePlacer.CODEC));

    public static void register(IEventBus eventBus) {
        FOLIAGE_PLACERS.register(eventBus);
    }
}