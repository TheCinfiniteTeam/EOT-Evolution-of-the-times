package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.item;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.EvolutionofTheTimes;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.creativetabs.EOT_CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ItemGravel extends Item implements ItemHandler.IHasModel {
    private static final String name = "gravel";
    public ItemGravel(){
        this.setRegistryName(name);
        this.setTranslationKey(EvolutionofTheTimes.MOD_ID+"."+name);
        this.setCreativeTab(EOT_CreativeTabs.original);
        ItemHandler.items.add(this);
    }
    @Override
    public void registerModel(){
        EvolutionofTheTimes.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
