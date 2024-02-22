package com.peach.peachfarm.worldgen.tree;

import com.peach.peachfarm.PeachFarm;
import com.peach.peachfarm.worldgen.tree.custom.PeachTrunkPlacer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTrunkPlacerTypes {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACER =
            DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, PeachFarm.MOD_ID);

    public static final RegistryObject<TrunkPlacerType<PeachTrunkPlacer>> PEACH_TRUNK_PLACER =
            TRUNK_PLACER.register("peach_trunk_placer", () -> new TrunkPlacerType<>(PeachTrunkPlacer.CODEC));

    public static void register(IEventBus eventBus) {
        TRUNK_PLACER.register(eventBus);
    }
}
