package com.rubin.cse.commands;

import com.rubin.cse.CseMain;
import com.rubin.cse.GUI.ToggleGUI.CseToggleGUI;
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
            sender.sendMessage("§b§8[§a§lCraftable Spawn eggs§8] §4[§c§lError§4] >> §cThis Command is disabled, contact a server administrator to enable this command in the config");
            return  true;
        }
        if (!(sender instanceof Player)) {
            sender.sendMessage("§b§8[§a§lCraftable Spawn eggs§8] §4[§c§lError§4] >> §cThis command can only be used by players!");
            return  true;
        }
        if (cmd.getName ().equalsIgnoreCase ( "csetoggle" ))
            if (!sender.hasPermission ( "csetoggle" )) {
                sender.sendMessage ( "§b§8[§a§lCraftable Spawn eggs§8] §4[§c§lError§4] >> §cYou are not permitted to use this command!" );
                return true;
            }

        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("csetoggle")) {
            CseToggleGUI gui =  new CseToggleGUI();
            player.openInventory(gui.getInventory());
            player.sendMessage("§b§8[§a§lCraftable Spawn eggs§8] §a>> §eYou opened the /csetoggle menu!");
        }
        return true;
    }
}
