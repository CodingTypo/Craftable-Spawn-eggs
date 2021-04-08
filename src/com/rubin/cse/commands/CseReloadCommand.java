package com.rubin.cse.commands;

import com.rubin.cse.CseMain;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CseReloadCommand implements CommandExecutor {

    CseMain plugin;

    public CseReloadCommand(CseMain instance){
        plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {


        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "This command can only be used by players!");
            return  true;
        }
        if (cmd.getName ().equalsIgnoreCase ( "csereload" ))
            if (!sender.hasPermission ( "csereload" )) {
                sender.sendMessage ( ChatColor.RED + "(!) You are not permitted to do this!" );
                return true;
            }

        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("csereload"))
         if(sender.hasPermission ( "csereload" )){

            player.sendMessage(ChatColor.YELLOW + "(!) reloading config");
            plugin.reloadConfig();
            player.sendMessage(ChatColor.YELLOW + "(!) config reloaded!");
        }

        return true;
    }
}
