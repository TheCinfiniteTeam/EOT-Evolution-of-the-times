package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.item.base;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.EvolutionofTheTimes;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.creativetabs.EOT_CreativeTabs;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.item.ItemHandler;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.material.CXK;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class CXKBase extends Item implements ItemHandler.IHasModel {
    public CXKBase(String name){
        this.setTranslationKey(EvolutionofTheTimes.MOD_ID+"."+name);
        this.setMaxDamage(999999999);
        this.setDamage(new ItemStack(this),999999999);
        this.setRegistryName(name);
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
