package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class terminalContainer extends Container {
    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return true;
        // 返回 false 的时候会给你关掉 GUI
    }
}
