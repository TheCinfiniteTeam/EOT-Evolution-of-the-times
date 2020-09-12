package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.creativetabs;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.EvolutionofTheTimes;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.block.BlockHandler;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.item.ItemHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class EOT_Original extends CreativeTabs {
    public EOT_Original(){
        super(EvolutionofTheTimes.MOD_ID+".original");
    }
    public ItemStack createIcon(){
        return new ItemStack(ItemHandler.itemRoughStick);
    }
}
