package com.peach.peachfarm.datagen.loot;

import com.peach.peachfarm.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;


import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.dropSelf(ModBlocks.PEACH_LOG.get());
        this.dropSelf(ModBlocks.PEACH_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_PEACH_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_PEACH_WOOD.get());
        this.dropSelf(ModBlocks.PEACH_PLANKS.get());

        this.add(ModBlocks.PEACH_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.PEACH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.PEACH_SAPLING.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
