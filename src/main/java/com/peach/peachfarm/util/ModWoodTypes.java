package com.peach.peachfarm.util;

import com.peach.peachfarm.PeachFarm;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {

    public static final WoodType PEACH = WoodType.register(new WoodType(PeachFarm.MOD_ID + ":peach", BlockSetType.OAK));

}
