package com.peach.peachfarm.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties PEACH =
            new FoodProperties.Builder()
                    .nutrition(2).fast()
                    .saturationMod(0.2f)
                    .build();

    public static final FoodProperties PEACH_COBBLER =
            new FoodProperties.Builder()
                    .nutrition(6)
                    .saturationMod(0.6f)
                    .build();

    public static final FoodProperties PEACH_JUICE =
            new FoodProperties.Builder()
                    .nutrition(4)
                    .saturationMod(0.4f)
                    .alwaysEat()
                    .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 1), 1.0f)
                    .build();

    public static final FoodProperties PEACH_PIE =
            new FoodProperties.Builder()
                    .nutrition(8)
                    .saturationMod(0.8f)
                    .build();

}
