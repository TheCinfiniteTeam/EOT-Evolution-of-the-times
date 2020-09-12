package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.item;

import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemHandler {
    public static final List<Item> items = new ArrayList<Item>();
    public static final Item itemEnderDragonSpawnEgg = new ItemEnderDragonSpawnEgg();
    public static final Item itemGravel = new ItemGravel();
    public interface IHasModel {
        public void registerModel();
    }
}
