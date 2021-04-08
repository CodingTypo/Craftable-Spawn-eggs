package com.rubin.cse.commands;

import com.rubin.cse.CseMain;
import com.rubin.cse.GUI.CseToggleGUI;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class CseToggleCommand implements CommandExecutor {




    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "This command can only be used by players!");
            return  true;
        }
        if (cmd.getName ().equalsIgnoreCase ( "csetoggle" ))
            if (!sender.hasPermission ( "csetoggle" )) {
                sender.sendMessage ( ChatColor.RED + "(!) You are not permitted to do this!" );
                return true;
            }

        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("csetoggle")) {
            CseToggleGUI gui =  new CseToggleGUI();
            player.openInventory(gui.getInventory());
            player.sendMessage(ChatColor.YELLOW + "(!) You opened the /csetoggle menu!");
        }
        return true;
    }
}
