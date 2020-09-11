package me.xsqne.customores.commands;

import me.xsqne.customores.items.ItemManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandGive implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;

            if(args[0].equalsIgnoreCase("soulscythe")) {
                player.getInventory().addItem(ItemManager.soulScythe);
                return true;
            }
        }
        return true;
    }
}
