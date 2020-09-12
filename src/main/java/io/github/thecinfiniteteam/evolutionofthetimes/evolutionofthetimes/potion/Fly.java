package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.potion;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;

public class Fly extends Potion {
    public Fly() {
        super(false, 117255119);
    }
    @Override
    public boolean hasStatusIcon() {
        return false;
    }

    @Override
    public void renderInventoryEffect(int x, int y, PotionEffect effect, Minecraft mc) {
        // 绘制逻辑，可直接交给 renderHUDEffect，此时 alpha = 1F
        this.renderHUDEffect(x, y, effect, mc, 1F);
    }

    @Override
    public void renderHUDEffect(int x, int y, PotionEffect effect, Minecraft mc, float alpha) {
        // 绘制逻辑
        //mc.getTextureManager().bindTexture(textureResourceLocation);
        // func_146110_a
        // x, y 为绘制的起点，u, v 为纹理的起点，w, h 为选取的纹理的宽和高，texW 和 texH 代表整张纹理的宽和高
        Gui.drawModalRectWithCustomSizedTexture(x, y, 16, 16, 16, 16, 16, 16);
    }
}
