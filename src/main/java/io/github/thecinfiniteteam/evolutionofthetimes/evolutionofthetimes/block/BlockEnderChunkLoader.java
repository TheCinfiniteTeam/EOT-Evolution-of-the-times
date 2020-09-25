package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.block;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.EvolutionofTheTimes;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.creativetabs.EOT_CreativeTabs;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.item.ItemHandler;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.material.Materials;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockEnderChunkLoader extends Block implements ItemHandler.IHasModel {
    private static final String name = "ender_chunkloader";
    public BlockEnderChunkLoader(){
        super(Material.IRON);
        this.setLightLevel(0.2f);
        this.setRegistryName(name);
        this.setTranslationKey(EvolutionofTheTimes.MOD_ID+"."+name);
        this.setHarvestLevel("pickaxe",4);
        this.setHardness(2.5f);
        this.setCreativeTab(EOT_CreativeTabs.industry);
        BlockHandler.blocks.add(this);
        ItemHandler.items.add(new ItemBlock(this).setRegistryName(name));
    }
    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }
    public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) { return true; }
    public ItemStack getSilkTouchDrop(IBlockState state) { return ItemStack.EMPTY; }
    @Override
    public void registerModel(){
        EvolutionofTheTimes.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
