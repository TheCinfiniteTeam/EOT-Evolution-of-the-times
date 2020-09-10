package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.block;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.EvolutionofTheTimes;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.item.ItemHandler;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;

import javax.annotation.Nullable;
import java.util.List;

public class BlockTerminal extends Block implements ItemHandler.IHasModel {
    private static final String name = "terminal";
    public BlockTerminal(){
        super(Material.IRON);
        this.setRegistryName(name);
        this.setTranslationKey(EvolutionofTheTimes.MOD_ID+"."+name);
        this.setHarvestLevel("pickaxe",2);
        this.setLightLevel(0.15f);
        this.setHardness(1.0f);
        this.setDefaultState(this.getBlockState().getBaseState().withProperty(FACING_BLOCK_SWITCH, EnumFacing.SOUTH));
        this.setSoundType(SoundType.STONE);
        BlockHandler.blocks.add(this);
        ItemHandler.items.add(new ItemBlock(this).setRegistryName(name));
    }
    public static final PropertyDirection FACING_BLOCK_SWITCH = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
    @Override
    public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
        return true;
    }
    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack){
        float x = (float) placer.getLookVec().x;
        float z = (float) placer.getLookVec().z;
        EnumFacing facing = EnumFacing.getFacingFromVector(x, 0.0f, z).getOpposite();
        worldIn.setBlockState(pos, this.blockState.getBaseState().withProperty(FACING_BLOCK_SWITCH, facing));
    }
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, FACING_BLOCK_SWITCH);
    }
    @Override
    public int  getMetaFromState(IBlockState state){
        int facing = state.getValue(FACING_BLOCK_SWITCH).getHorizontalIndex();
        return facing;
    }
    @Override
    public void registerModel(){
        this.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
    public void registerItemRenderer(Item item, int meta, String id){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add("- \u00A76\u7EC8\u7AEF?");
        tooltip.add("- \u00A79\u53EF\u4EE5\u7528\u6765\u5728Mc\u91CC\u73A9Mc\u91CC\u73A9Mc\u91CC\u73A9...(\u7981\u6B62\u5957\u5A03)");
        tooltip.add("                              ------By chenjj100419");
    }

}
