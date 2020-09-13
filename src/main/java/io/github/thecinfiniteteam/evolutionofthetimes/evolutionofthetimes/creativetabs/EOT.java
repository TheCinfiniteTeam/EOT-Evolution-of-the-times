package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.creativetabs;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.EvolutionofTheTimes;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.block.BlockHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class EOT extends CreativeTabs {
    public EOT(){
        super(EvolutionofTheTimes.MOD_ID+"."+"eot");
    }
    public ItemStack createIcon(){
        return new ItemStack(BlockHandler.blockCoreFramework);
    }
}
