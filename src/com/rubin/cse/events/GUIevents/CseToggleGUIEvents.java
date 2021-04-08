package com.rubin.cse.events.GUIevents;

import com.rubin.cse.CseMain;
import com.rubin.cse.GUI.CseGiveGUI;
import com.rubin.cse.GUI.CseToggleGUI;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.configuration.file.FileConfiguration;
import sun.security.provider.ConfigFile;

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
                    //plaats hier nog een message
                    plugin.getConfig().set("enabled_spawn_eggs.bat.enabled", Boolean.valueOf(true));
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 5) {
                    //plaats hier nog een message
                    plugin.getConfig().set("enabled_spawn_eggs.bat.enabled", Boolean.valueOf(false));
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 13) {
                    //plaats hier nog een message
                    plugin.getConfig().set("enabled_spawn_eggs.bee.enabled", Boolean.valueOf(true));
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 14) {
                    //plaats hier nog een message
                    plugin.getConfig().set("enabled_spawn_eggs.bee.enabled", Boolean.valueOf(false));
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 22) {
                    //plaats hier nog een message
                    plugin.getConfig().set("enabled_spawn_eggs.chicken.enabled", Boolean.valueOf(true));
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 23) {
                    //plaats hier nog een message
                    plugin.getConfig().set("enabled_spawn_eggs.chicken.enabled", Boolean.valueOf(false));
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 31) {
                    //plaats hier nog een message
                    plugin.getConfig().set("enabled_spawn_eggs.cat.enabled", Boolean.valueOf(true));
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 32) {
                    //plaats hier nog een message
                    plugin.getConfig().set("enabled_spawn_eggs.cat.enabled", Boolean.valueOf(false));
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 40) {
                    //plaats hier nog een message
                    plugin.getConfig().set("enabled_spawn_eggs.cave_spider.enabled", Boolean.valueOf(true));
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 41) {
                    //plaats hier nog een message
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
