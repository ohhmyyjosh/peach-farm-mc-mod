package com.peach.peachfarm.datagen;

import com.peach.peachfarm.PeachFarm;
import com.peach.peachfarm.block.ModBlocks;
import com.peach.peachfarm.item.ModItems;
import com.peach.peachfarm.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, PeachFarm.MOD_ID);
    }

    @Override
    protected void start() {
        add("peach_from_peach_leaves", new AddItemModifier(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.PEACH_LEAVES.get()).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.PEACH.get()));
    }
}
