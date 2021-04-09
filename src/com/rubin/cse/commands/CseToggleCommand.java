package com.rubin.cse.commands;

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
            sender.sendMessage("§b§8[§a§lCraftable Spawn eggs§8] §4[§c§lError§4] >> §cThis command can only be used by players!");
            return  true;
        }
        if (cmd.getName ().equalsIgnoreCase ( "csetoggle" ))
            if (!sender.hasPermission ( "csetoggle" )) {
                sender.sendMessage ("§b§8[§a§lCraftable Spawn eggs§8] §4[§c§lError§4] >> §cYou are not permitted to use this command!" );
                return true;
            }

        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("csetoggle")) {
            CseToggleGUI gui =  new CseToggleGUI();
            player.openInventory(gui.getInventory());
            player.sendMessage(ChatColor.YELLOW + "§b§8[§a§lCraftable Spawn eggs§8] §2>> §eYou opened the /csetoggle menu!");
        }
        return true;
    }
}
