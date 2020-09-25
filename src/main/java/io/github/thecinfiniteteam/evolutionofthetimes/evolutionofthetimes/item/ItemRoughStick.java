package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.item;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.EvolutionofTheTimes;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.creativetabs.EOT_CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ItemRoughStick extends Item implements ItemHandler.IHasModel {
    private static final String name = "rough_stick";
    public ItemRoughStick(){
        this.setMaxStackSize(16);
        this.setCreativeTab(EOT_CreativeTabs.original);
        this.setTranslationKey(EvolutionofTheTimes.MOD_ID+"."+name);
        this.setRegistryName(name);
        ItemHandler.items.add(this);
    }
    @Override
    public void registerModel(){
        EvolutionofTheTimes.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
