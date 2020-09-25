package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.block;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.EvolutionofTheTimes;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.creativetabs.EOT_CreativeTabs;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.item.ItemHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;

public class BlockCoreFramework extends Block implements ItemHandler.IHasModel {
    private static final String name ="core_framework";
    public BlockCoreFramework(){
        super(Material.IRON);
        this.setCreativeTab(EOT_CreativeTabs.industry);
        this.setTranslationKey(EvolutionofTheTimes.MOD_ID+"."+name);
        this.setHarvestLevel("pickaxe",1);
        this.setHardness(1f);
        this.setRegistryName(name);
        BlockHandler.blocks.add(this);
        ItemHandler.items.add(new ItemBlock(this).setRegistryName(name));
    }
    @Override
    public void registerModel(){
        EvolutionofTheTimes.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
