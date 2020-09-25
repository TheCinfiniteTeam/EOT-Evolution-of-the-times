package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.item;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.EvolutionofTheTimes;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.creativetabs.EOT_CreativeTabs;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.entity.EntityBasketBall;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.EntityMinecartTNT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ItemBasketBall extends Item implements ItemHandler.IHasModel {
    private static final String name = "basket_ball";
    public ItemBasketBall(){
        this.setTranslationKey(EvolutionofTheTimes.MOD_ID+"."+name);
        this.setCreativeTab(EOT_CreativeTabs.industry);
        this.setRegistryName(name);
        ItemHandler.items.add(this);
    }
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack item = playerIn.getHeldItem(handIn);
        worldIn.playSound(null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
        if (!worldIn.isRemote) {
            //EntitySnowball snowball = new EntitySnowball(worldIn, playerIn);
            //snowball.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
            //worldIn.spawnEntity(snowball);
            //EntityBasketBall basketBall = new EntityBasketBall(worldIn);
            //worldIn.spawnEntity(basketBall);
        }
        item.shrink(1);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
    }
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        ItemStack item = player.getHeldItem(hand);
        worldIn.playSound(null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
        if (!worldIn.isRemote) {
            //EntitySnowball snowball = new EntitySnowball(worldIn, player);
            //snowball.shoot(player, player.rotationPitch, player.rotationYaw, 0.0F, 1.5F, 1.0F);
            //worldIn.spawnEntity(snowball);
        }
        item.shrink(1);
        return EnumActionResult.SUCCESS;
    }
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add("\u00A76\u9E21\u4F60\u592A\u7F8E!~");
    }
    @Override
    public void registerModel(){
        EvolutionofTheTimes.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
