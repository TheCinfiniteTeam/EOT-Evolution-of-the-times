package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PlayerINV {
    public static ItemStack getPlayerInv(EntityPlayer playerIn){
        return playerIn.inventory.getItemStack();
    }
    public static ItemStack getPlayerCItemStack(EntityPlayer playerIn){
        return playerIn.inventory.getCurrentItem();
    }
}
