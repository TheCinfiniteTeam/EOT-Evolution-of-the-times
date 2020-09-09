package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.block;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.EvolutionofTheTimes;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class BlockTerminal extends Block {
    private static final String name = "terminal";
    public BlockTerminal(){
        super(Material.IRON);
        this.setRegistryName(name);
        this.setTranslationKey(EvolutionofTheTimes.MOD_ID+"."+name);
        this.setHarvestLevel("pickaxe",2);
        this.setLightLevel(0.15f);
        this.setHardness(1.0f);
        this.setDefaultState(this.getBlockState().getBaseState().withProperty(FACING_BLOCK_SWITCH, EnumFacing.SOUTH));
        BlockHandler.blocks.add(this);
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
}
