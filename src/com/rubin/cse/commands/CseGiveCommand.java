package com.rubin.cse.commands;

import com.rubin.cse.CseMain;
import com.rubin.cse.GUI.CseGiveGUI;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CseGiveCommand implements CommandExecutor {

    CseMain plugin;

    public CseGiveCommand(CseMain instance){
        plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {



        if (!plugin.getConfig().getBoolean("enabled_commands.givegui")) {
            sender.sendMessage("§b§8[§a§lCraftable Spawn eggs§8] §4[§c§lError§4] >> §cThis Command is disabled, contact a server administrator to enable this command in the config");
            return  true;
        }
        if (!(sender instanceof Player)) {
            sender.sendMessage("§b§8[§a§lCraftable Spawn eggs§8] §4[§c§lError§4] >> §cThis command can only be used by players!");
            return  true;
        }
        if (cmd.getName ().equalsIgnoreCase ( "csegive" ))
            if (!sender.hasPermission ( "csegive2" )) {
                sender.sendMessage ( "§b§8[§a§lCraftable Spawn eggs§8] §4[§c§lError§4] >> §cYou are not permitted to use this command!" );
                return true;
            }

        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("csegive"))
         if(sender.hasPermission ( "csegive2" )){
            CseGiveGUI gui =  new CseGiveGUI();
            player.openInventory(gui.getInventory());
            player.sendMessage("§b§8[§a§lCraftable Spawn eggs§8] §2>> §eYou opened the /csegive menu!");
        }

        return true;
    }
}
