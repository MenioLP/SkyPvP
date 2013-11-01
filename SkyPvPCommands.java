package main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SkyPvPCommands implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(args.length == 0){
			sender.sendMessage("§8§l[§9§lSkyPvP§8§l] §cBenutzung:");
			sender.sendMessage("§8§l[§9§lSkyPvP§8§l] §6/SkyPvP Help");
		} else if(args.length == 1){
			if(args[0].equalsIgnoreCase("help")){
				sender.sendMessage("§8<---§c§lSkyPvP Hilfeseite§8--->");
				sender.sendMessage("§5/SkyPvP §bJoin §8- §7Beitreten");
				sender.sendMessage("§5/SkyPvP §bLeave §8- §7Verlassen");
				sender.sendMessage("§5/SkyPvP §bList §8- §7Liste der Spieler");
				sender.sendMessage("§5/SkyPvP §bStats §8- §7Deine Statistiken");
				sender.sendMessage("§5/SkyPvP §bShop §8- §7Shop");
			} else {
				sender.sendMessage("§8§l[§9§lSkyPvP§8§l] §cdieser SkyPvP Befehl wurde nicht gefunden!");
			}
		}
		
		
		
		
		
		
		return true;
	}

}
