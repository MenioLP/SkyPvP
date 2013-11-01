package main;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class SkyPvP extends JavaPlugin {

	@Override
	public void onDisable() {
		System.out.println("[SkyPvP] das Plugin wurde Deaktiviert!");
	}

	@Override
	public void onEnable() {
		System.out.println("[SkyPvP] das Plugin wurde Deaktiviert!");
		
		this.getCommand("skypvp").setExecutor(new SkyPvPCommands());
		
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(new DeathListener(), this);
	}
	
}
