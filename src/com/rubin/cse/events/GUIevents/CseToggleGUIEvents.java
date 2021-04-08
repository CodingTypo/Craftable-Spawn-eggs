package com.rubin.cse.events.GUIevents;

import com.rubin.cse.CseMain;
import com.rubin.cse.GUI.CseGiveGUI;
import com.rubin.cse.GUI.CseToggleGUI;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

public class CseToggleGUIEvents implements Listener {

    CseMain plugin;

    public CseToggleGUIEvents(CseMain instance){
        plugin = instance;
    }

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getClickedInventory() == null) {
            return;
        }
        if (e.getClickedInventory().getHolder() instanceof CseToggleGUI) {
            e.setCancelled(true);
            if (e.isLeftClick()) {
                Player player = (Player) e.getWhoClicked();
                if (e.getCurrentItem() == null) {
                    return;
                }

                else if (e.getSlot() == 18) {
                    player.sendMessage(ChatColor.AQUA + "You closed the /csetoggle menu");
                    player.closeInventory ();
                }

                if (e.getSlot() == 4) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §8Toggeld bat:§2true");
                    plugin.getConfig().set("enabled_spawn_eggs.bat.enabled", Boolean.valueOf(true));
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 5) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §8Toggeld bat:§4false");
                    plugin.getConfig().set("enabled_spawn_eggs.bat.enabled", Boolean.valueOf(false));
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 13) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §8Toggeld bee:§2true");
                    plugin.getConfig().set("enabled_spawn_eggs.bee.enabled", Boolean.valueOf(true));
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 14) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §8Toggeld bee:§4false");
                    plugin.getConfig().set("enabled_spawn_eggs.bee.enabled", Boolean.valueOf(false));
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 22) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §8Toggeld chicken:§2true");
                    plugin.getConfig().set("enabled_spawn_eggs.chicken.enabled", Boolean.valueOf(true));
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 23) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §8Toggeld chicken:§4false");
                    plugin.getConfig().set("enabled_spawn_eggs.chicken.enabled", Boolean.valueOf(false));
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 31) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §8Toggeld cat:§2true");
                    plugin.getConfig().set("enabled_spawn_eggs.cat.enabled", Boolean.valueOf(true));
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 32) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §8Toggeld cat:§4false");
                    plugin.getConfig().set("enabled_spawn_eggs.cat.enabled", Boolean.valueOf(false));
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 40) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §8Toggeld cave spider:§2true");
                    plugin.getConfig().set("enabled_spawn_eggs.cave_spider.enabled", Boolean.valueOf(true));
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 41) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §8Toggeled cave spider:§4false");
                    plugin.getConfig().set("enabled_spawn_eggs.cave_spider.enabled", Boolean.valueOf(false));
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }


                CseGiveGUI gui =  new CseGiveGUI();
                if (e.getSlot() == 9) {
                    player.closeInventory();
                    player.openInventory (gui.getInventory());
                }
                else if (e.getSlot() == 27) {
                    player.closeInventory ();
                }

            }
        }
    }
}
