package com.chemistsmc.minigamesframework;

import com.chemistsmc.minigamesframework.configuration.FrameworkSettings;
import com.chemistsmc.minigamesframework.configuration.Settings;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class MinigamesFramework extends JavaPlugin
{

    @Override
    public void onEnable()
    {
        Settings settings = Settings.create(new File(getDataFolder(), "config.yml"));

        ConsoleLogger.setLogger(getLogger());
        ConsoleLogger.setUseDebug(settings.getProperty(FrameworkSettings.USE_DEBUG));

        ConsoleLogger.debug("Minigames framework is enabled with debugging.");
    }

    @Override
    public void onDisable()
    {
        //
    }
}
