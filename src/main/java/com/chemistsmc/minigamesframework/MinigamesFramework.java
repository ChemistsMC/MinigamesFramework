package com.chemistsmc.minigamesframework;

import org.bukkit.plugin.java.JavaPlugin;

public class MinigamesFramework extends JavaPlugin {

	@Override
	public void onEnable() {
		ConsoleLogger.setLogger(getLogger());
	}

	@Override
	public void onDisable() {
		//
	}
}
