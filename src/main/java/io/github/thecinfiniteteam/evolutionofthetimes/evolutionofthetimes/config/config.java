package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.config;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.EvolutionofTheTimes;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = EvolutionofTheTimes.MOD_ID)
@Config.LangKey("config."+EvolutionofTheTimes.MOD_ID)
public class config {
    @Config.Comment("Hey I am Terminal RF storage capacity")
    @Config.LangKey("config."+EvolutionofTheTimes.MOD_ID+".terminal_rf_storage_capacity") // 供配置 GUI 界面使用的本地化键，参阅“可视化配置文件编辑界面”一节
    @Config.Name("Terminal")
    @Config.RangeInt(min = 1, max = 32767)
    @Config.RequiresMcRestart
    public static int terminal_rf_storage_capacity = 128;

    @Config.Comment("Hey I am Mod use energy units")
    @Config.LangKey("config."+EvolutionofTheTimes.MOD_ID+".mod_use_energy_units") // 供配置 GUI 界面使用的本地化键，参阅“可视化配置文件编辑界面”一节
    @Config.Name("Energy units")
    @Config.RequiresMcRestart
    public static String[] mod_use_energy_units = new String[] {"RF"} ;



}
