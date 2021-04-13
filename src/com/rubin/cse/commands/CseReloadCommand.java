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
            sender.sendMessage("§b§8[§a§lCraftable Spawn eggs§8] §4[§c§lError§4] >> §cThis command can only be used by players!");
            return  true;
        }
        if (cmd.getName ().equalsIgnoreCase ( "csereload" ))
            if (!sender.hasPermission ( "csereload" )) {
                sender.sendMessage ( "§b§8[§a§lCraftable Spawn eggs§8] §4[§c§lError§4] >> §cYou are not permitted to use this command!" );
                return true;
            }

        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("csereload"))
         if(sender.hasPermission ( "csereload" )){


            plugin.reloadConfig();
            player.sendMessage("§b§8[§a§lCraftable Spawn eggs§8] §8[§6§lConfig§8] §6>> §eConfig has been reloaded!");
        }

        return true;
    }
}
