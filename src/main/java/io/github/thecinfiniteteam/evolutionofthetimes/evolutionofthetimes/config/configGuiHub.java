package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.config;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.EvolutionofTheTimes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Collections;
import java.util.Set;

public class configGuiHub  implements IModGuiFactory {
    @Override
    public void initialize(Minecraft mc) {
    }

    @Override
    public boolean hasConfigGui() {
        return true;
    }

    @Override
    public GuiScreen createConfigGui(GuiScreen parent) {
        return new GuiConfig(parent, ConfigElement.from(config.class).getChildElements(), EvolutionofTheTimes.MOD_ID, false, false, EvolutionofTheTimes.MOD_NAME+" Config Gui", "时代进化 配置界面");
    }

    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
        return Collections.emptySet();
    }
    @Mod.EventBusSubscriber(modid = EvolutionofTheTimes.MOD_ID)
    public class ConfigSyncHandler {
        @SubscribeEvent
        public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(EvolutionofTheTimes.MOD_ID)) {
                ConfigManager.sync(EvolutionofTheTimes.MOD_ID, Config.Type.INSTANCE);
            }
        }
    }

}

