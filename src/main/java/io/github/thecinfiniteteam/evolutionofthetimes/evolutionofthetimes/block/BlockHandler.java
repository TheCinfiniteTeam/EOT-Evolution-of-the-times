package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.block;

import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

public class BlockHandler {
    public static final List<Block> blocks = new ArrayList<Block>();

    public static final Block blockSmallStone = new BlockSmallStone();
    public static final Block blockTumbleweed = new BlockTumbleweed();

    public static final Block blockTerminal = new BlockTerminal();
    public static final Block blockEnderChunkLoader = new BlockEnderChunkLoader();
    public static final Block blockCoreFramework= new BlockCoreFramework();
}
