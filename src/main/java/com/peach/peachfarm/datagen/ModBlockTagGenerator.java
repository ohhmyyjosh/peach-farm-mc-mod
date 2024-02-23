package com.peach.peachfarm.datagen;

import com.peach.peachfarm.PeachFarm;
import com.peach.peachfarm.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, PeachFarm.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.PEACH_LOG.get())
                .add(ModBlocks.PEACH_WOOD.get())
                .add(ModBlocks.STRIPPED_PEACH_LOG.get())
                .add(ModBlocks.STRIPPED_PEACH_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.PEACH_PLANKS.get());

        this.tag(BlockTags.LEAVES)
                .add(ModBlocks.PEACH_LEAVES.get());

        this.tag(BlockTags.SAPLINGS)
                .add(ModBlocks.PEACH_SAPLING.get());

        this.tag(BlockTags.LOGS)
                .add(ModBlocks.PEACH_LOG.get())
                .add(ModBlocks.PEACH_WOOD.get())
                .add(ModBlocks.STRIPPED_PEACH_LOG.get())
                .add(ModBlocks.STRIPPED_PEACH_WOOD.get());

    }
}
