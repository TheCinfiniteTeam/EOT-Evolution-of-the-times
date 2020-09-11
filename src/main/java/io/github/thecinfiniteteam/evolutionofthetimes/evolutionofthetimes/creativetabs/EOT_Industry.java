package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.creativetabs;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.EvolutionofTheTimes;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.block.BlockHandler;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.block.BlockTerminal;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EOT_Industry extends CreativeTabs {
    public EOT_Industry(){
        super(EvolutionofTheTimes.MOD_ID+".industry");
        //this.setBackgroundImageName("eot_in_tems.png");
    }
    public ItemStack createIcon(){
        return new ItemStack(BlockHandler.blockTerminal);
    }

}
