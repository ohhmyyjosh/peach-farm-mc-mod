package com.peach.peachfarm.datagen;

import com.peach.peachfarm.PeachFarm;
import net.minecraft.data.PackOutput;

import com.peach.peachfarm.block.ModBlocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, PeachFarm.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        logBlock(((RotatedPillarBlock) ModBlocks.PEACH_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.PEACH_WOOD.get()), blockTexture(ModBlocks.PEACH_LOG.get()), blockTexture(ModBlocks.PEACH_LOG.get()));

        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PEACH_LOG.get()), blockTexture(ModBlocks.STRIPPED_PEACH_LOG.get()),
                new ResourceLocation(PeachFarm.MOD_ID, "block/stripped_peach_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PEACH_WOOD.get()), blockTexture(ModBlocks.STRIPPED_PEACH_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_PEACH_LOG.get()));

        blockItem(ModBlocks.PEACH_LOG);
        blockItem(ModBlocks.PEACH_WOOD);
        blockItem(ModBlocks.STRIPPED_PEACH_LOG);
        blockItem(ModBlocks.STRIPPED_PEACH_WOOD);

        blockWithItem(ModBlocks.PEACH_PLANKS);

        leavesBlock(ModBlocks.PEACH_LEAVES);

        saplingBlock(ModBlocks.PEACH_SAPLING);
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(PeachFarm.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
