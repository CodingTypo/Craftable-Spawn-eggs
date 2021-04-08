package com.rubin.cse.commands;

import com.rubin.cse.CseMain;
import com.rubin.cse.GUI.CseToggleGUI;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class CseToggleCommand implements CommandExecutor {

    CseMain plugin;

    public CseToggleCommand(CseMain instance){
        plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!plugin.getConfig().getBoolean("enabled_commands.toggle")) {
            sender.sendMessage(ChatColor.RED + "This command is disabled in the config file");
            return  true;
        }
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
