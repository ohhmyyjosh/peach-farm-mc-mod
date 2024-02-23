package com.peach.peachfarm.datagen;


import com.peach.peachfarm.block.ModBlocks;
import com.peach.peachfarm.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEACH_PLANKS.get(), 4)
                .requires(ModBlocks.PEACH_LOG.get())
                .unlockedBy("has_peach_log", has(ModBlocks.PEACH_LOG.get()))
                .save(recipeOutput, "peach_planks_from_log");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEACH_PLANKS.get(), 4)
                .requires(ModBlocks.PEACH_WOOD.get())
                .unlockedBy("has_peach_wood", has(ModBlocks.PEACH_WOOD.get()))
                .save(recipeOutput, "peach_planks_from_wood");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEACH_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_PEACH_LOG.get())
                .unlockedBy("has_stripped_peach_log", has(ModBlocks.STRIPPED_PEACH_LOG.get()))
                .save(recipeOutput, "peach_planks_from_stripped_log");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEACH_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_PEACH_WOOD.get())
                .unlockedBy("has_stripped_peach_wood", has(ModBlocks.STRIPPED_PEACH_WOOD.get()))
                .save(recipeOutput, "peach_planks_from_stripped_wood");


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.STICK, 4)
                .pattern("P")
                .pattern("P")
                .define('P', ModBlocks.PEACH_PLANKS.get())
                .unlockedBy("has_peach_planks", has(ModBlocks.PEACH_PLANKS.get()))
                .save(recipeOutput, "sticks_from_peach_planks");


        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.PEACH_COBBLER.get(), 2)
                .pattern("PPP")
                .pattern("PSP")
                .pattern("PBP")
                .define('P', ModItems.PEACH.get())
                .define('S', Items.SUGAR)
                .define('B', Items.BOWL)
                .unlockedBy("has_peach", has(ModItems.PEACH.get()))
                .save(recipeOutput, "peach_cobbler");

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.PEACH_PIE.get(), 1)
                .pattern("PPP")
                .pattern("PEP")
                .pattern("WWW")
                .define('P', ModItems.PEACH.get())
                .define('E', Items.EGG)
                .define('W', Items.WHEAT)
                .unlockedBy("has_peach", has(ModItems.PEACH.get()))
                .save(recipeOutput, "peach_pie");

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.PEACH_JUICE.get(), 1)
                .pattern("P")
                .pattern("G")
                .define('P', ModItems.PEACH.get())
                .define('G', Items.GLASS_BOTTLE)
                .unlockedBy("has_peach", has(ModItems.PEACH.get()))
                .save(recipeOutput, "peach_juice");



    }


}
