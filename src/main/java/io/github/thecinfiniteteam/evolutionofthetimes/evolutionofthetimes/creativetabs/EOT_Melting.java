package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.creativetabs;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.EvolutionofTheTimes;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class EOT_Melting extends CreativeTabs {
    public EOT_Melting(){
        super(EvolutionofTheTimes.MOD_ID+".melting");
    }
    public ItemStack createIcon(){
        return new ItemStack(Items.LAVA_BUCKET);
    }
}
