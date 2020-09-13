package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.item;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.EvolutionofTheTimes;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.creativetabs.EOT_CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;

import java.util.Objects;

public class ItemManual extends Item implements ItemHandler.IHasModel {
    private static final String name = "manual";
    //private OpenManualHandler manualHandler;
    public ItemManual(){
        this.setMaxStackSize(1);
        this.setCreativeTab(EOT_CreativeTabs.eot);
        this.setRegistryName(name);
        this.setTranslationKey(EvolutionofTheTimes.MOD_ID+"."+name);
        ItemHandler.items.add(this);
    }
    @Override
    public void registerModel(){
        this.registerItemRenderer(this, 0, "inventory");
    }
    public void registerItemRenderer(Item item, int meta, String id){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }
/*
    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand)
    {
        if (this.manualHandler == null || (hand == EnumHand.OFF_HAND && player.isSneaking()))
        {
            return defaultManualHandler(world, player, hand);
        }
        else
        {
            return this.manualHandler.tryOpenManual(world, player, hand);
        }
    }

    private static ActionResult<ItemStack> defaultManualHandler(World world, EntityPlayer player, EnumHand hand)
    {
        player.openGui(EvolutionofTheTimes.getInstance(), 0, world, hand.ordinal(), 0, 0);
        return new ActionResult<>(EnumActionResult.SUCCESS, player.getHeldItem(hand));
    }

    public final ItemManual setOpenManualHandler(OpenManualHandler handler)
    {
        this.manualHandler = Objects.requireNonNull(handler, "Manual handler cannot be null");
        return this;
    }

    public interface OpenManualHandler
    {
        ActionResult<ItemStack> tryOpenManual(World world, EntityPlayer player, EnumHand hand);
    }*/
}
