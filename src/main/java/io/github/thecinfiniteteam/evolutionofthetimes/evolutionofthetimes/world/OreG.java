package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.world;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.block.BlockHandler;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class OreG {
    @SubscribeEvent
    public static void onOreGen(OreGenEvent.Pre event) {
        World world = event.getWorld();
        BlockPos OrePos = event.getPos();
        //world.addBlockEvent(OrePos, BlockHandler.blockCoreFramework,00001,00001);
    }
}
