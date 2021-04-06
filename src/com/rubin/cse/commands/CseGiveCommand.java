package com.rubin.cse.commands;

import com.rubin.cse.GUI.CseGiveGUI;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CseGiveCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "This command can only be used by players!");
            return  true;
        }
        if (cmd.getName ().equalsIgnoreCase ( "csegive" ))
            if (!sender.hasPermission ( "csegive2" )) {
                sender.sendMessage ( ChatColor.RED + "(!) You are not permitted to do this!" );
                return true;
            }

        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("csegive"))
         if(sender.hasPermission ( "csegive2" )){
            CseGiveGUI gui =  new CseGiveGUI();
            player.openInventory(gui.getInventory());
            player.sendMessage(ChatColor.YELLOW + "(!) You opened the /csegive menu!");
        }

        return true;
    }
}
