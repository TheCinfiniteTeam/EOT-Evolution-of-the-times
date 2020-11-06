package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

    @Override
    public void preinit(FMLPreInitializationEvent event){
        super.preinit(event);
    }

    @Override
    public void init(FMLInitializationEvent event){
        super.init(event);
    }

    @Override
    public void postinit(FMLPostInitializationEvent event){
        super.postinit(event);
    }

    @Override
    public void registerItemRenderer(Item item, int meta, String id){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }
    /*
    @Mod.InstanceFactory
    public static EvolutionofTheTimes getInstance()
    {
        return INSTANCE;
    }
    */

}
