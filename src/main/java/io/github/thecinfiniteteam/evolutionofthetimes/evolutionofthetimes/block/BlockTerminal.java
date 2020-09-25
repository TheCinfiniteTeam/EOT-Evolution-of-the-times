package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.block;

import com.google.common.base.Ticker;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.EvolutionofTheTimes;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.creativetabs.EOT_CreativeTabs;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.item.ItemHandler;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.config.config;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.sound.Sound;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
public class BlockTerminal extends Block implements ItemHandler.IHasModel {
    private static final String name = "terminal";
    public BlockTerminal(){
        super(Material.IRON);
        this.setRegistryName(name);
        this.setTranslationKey(EvolutionofTheTimes.MOD_ID+"."+name);
        this.setHarvestLevel("pickaxe",2);
        this.setLightLevel(0f);
        this.setHardness(1.0f);
        this.setDefaultState(this.getBlockState().getBaseState().withProperty(FACING_BLOCK_SWITCH, EnumFacing.SOUTH));//.withProperty(RUN_BLOCK_SWITCH,false));
        this.setSoundType(Sound.machine_sound);
        this.setCreativeTab(EOT_CreativeTabs.industry);
        BlockHandler.blocks.add(this);
        ItemHandler.items.add(new ItemBlock(this).setRegistryName(name));
    }
    public static final PropertyDirection FACING_BLOCK_SWITCH = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
    //public static final PropertyBool RUN_BLOCK_SWITCH = PropertyBool.create("run");
    @Override
    public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
        return true;
    }
    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack){
        float x = (float) placer.getLookVec().x;
        float z = (float) placer.getLookVec().z;
        EnumFacing facing = EnumFacing.getFacingFromVector(x, 0.0f, z).getOpposite();
        worldIn.setBlockState(pos, this.blockState.getBaseState().withProperty(FACING_BLOCK_SWITCH, facing));//.withProperty(RUN_BLOCK_SWITCH,false));
    }
    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, FACING_BLOCK_SWITCH);//,RUN_BLOCK_SWITCH);
    }
    @Override
    public int  getMetaFromState(IBlockState state){
        int facing = state.getValue(FACING_BLOCK_SWITCH).getHorizontalIndex();
        //int run = state.getValue(RUN_BLOCK_SWITCH) ? 0b0100 : 0;
        return facing ;//| run;
    }
    @Override
    public void registerModel(){
        EvolutionofTheTimes.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add("- \u00A76\u7EC8\u7AEF?");
        tooltip.add("- \u00A79\u53EF\u4EE5\u7528\u6765\u5728Mc\u91CC\u73A9Mc\u91CC\u73A9Mc\u91CC\u73A9...(\u7981\u6B62\u5957\u5A03)");
        tooltip.add("                              ------By chenjj100419");
    }
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        int block_x = pos.getX();
        int block_y = pos.getY();
        int block_z = pos.getZ();
        playerIn.sendStatusMessage(new TextComponentTranslation("title."+EvolutionofTheTimes.MOD_ID+"."+name+".click.msg.name"), true);
        //worldIn.setBlockState(pos, this.blockState.getBaseState().withProperty(RUN_BLOCK_SWITCH,true));
        //this.setLightLevel(0.5f);
        //System.out.println("Click "+name);
        //this.setLightLevel(0);
        return true;
    }
    @Override
    public boolean hasTileEntity(IBlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TerminalEntity();
    }
    protected boolean canSilkHarvest()
    {
        return true;
    }
    public final class TerminalEntity extends TileEntity /*implements ITickable*/ {
        private int progress;
        private int rf;
        private Boolean run;
        //private String command;

        public int getProgress(){ return this.progress; }
        public int getRf(){ return this.rf; }
        public Boolean getRun(){ return this.run; }
        //public String getCommand(){ return this.command; }
        /*
        @Override
        public void update() {
            if (!run == false){

            }else if (!run == true){

            }
            if (rf < 1) {
                run = !run;
            }else if (rf > 0 & rf <= config.terminal_rf_storage_capacity){
                run = true;
            }
        }*/
    }
}

