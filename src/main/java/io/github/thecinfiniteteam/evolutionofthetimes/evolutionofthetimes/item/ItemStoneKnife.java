package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.item;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.EvolutionofTheTimes;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.creativetabs.EOT_CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.model.ModelLoader;

public class ItemStoneKnife extends ItemSword implements ItemHandler.IHasModel {
    private static final String name = "stone_knife";
    public ItemStoneKnife(){
        super(ToolMaterial.STONE);
        this.setCreativeTab(EOT_CreativeTabs.original);
        this.setMaxStackSize(1);
        this.setTranslationKey(EvolutionofTheTimes.MOD_ID+"."+name);
        this.setRegistryName(name);
        ItemHandler.items.add(this);
    }
    @Override
    public void registerModel(){
        this.registerItemRenderer(this, 0, "inventory");
    }
    public void registerItemRenderer(Item item, int meta, String id){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }
}
