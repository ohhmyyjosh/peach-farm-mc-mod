package com.peach.peachfarm.item;

import com.peach.peachfarm.PeachFarm;
import com.peach.peachfarm.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PeachFarm.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PEACH_TAB = CREATIVE_MODE_TABS.register("peach_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PEACH.get()))
                    .title(Component.translatable("Peach Farm"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.PEACH.get());
                        pOutput.accept(ModItems.PEACH_COBBLER.get());
                        pOutput.accept(ModItems.PEACH_JUICE.get());
                        pOutput.accept(ModItems.PEACH_PIE.get());

                        pOutput.accept(ModBlocks.PEACH_LOG.get());
                        pOutput.accept(ModBlocks.PEACH_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_PEACH_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_PEACH_WOOD.get());

                        pOutput.accept(ModBlocks.PEACH_PLANKS.get());
                        pOutput.accept(ModItems.PEACH_SIGN.get());
                        pOutput.accept(ModItems.PEACH_HANGING_SIGN.get());

                        pOutput.accept(ModItems.PEACH_BOAT.get());
                        pOutput.accept(ModItems.PEACH_CHEST_BOAT.get());

                        pOutput.accept(ModBlocks.PEACH_LEAVES.get());

                        pOutput.accept(ModBlocks.PEACH_SAPLING.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }


}
