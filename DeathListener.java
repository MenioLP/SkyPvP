package main;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener {

	
	@EventHandler
	public void onPlayerDeathEvent(PlayerDeathEvent e){
		e.setDeathMessage("");
	}
}
