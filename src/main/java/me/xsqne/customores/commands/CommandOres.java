package me.xsqne.customores.commands;

import me.xsqne.customores.items.ItemManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class CommandOres implements Listener, CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player) {
               Player player = (Player) sender;

               if(args[0].equalsIgnoreCase("silver")) {
                   player.getInventory().addItem(ItemManager.silver);
                   return true;
               }

               if(args[0].equalsIgnoreCase("bronze")) {
                   player.getInventory().addItem(ItemManager.bronze);
                   return true;
               }

               if(args[0].equalsIgnoreCase("cshard")) {
                   player.getInventory().addItem(ItemManager.cshard);
                   return true;
               }

          } else {
              sender.sendMessage("You need to be a player to execute this command!");
              return true;
          }
        return true;
    }
}
