package com.rubin.cse.events.GUIevents;

import com.rubin.cse.CseMain;
import com.rubin.cse.GUI.CseGiveGUI;
import com.rubin.cse.GUI.CseToggleGUI;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

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
                    player.closeInventory ();
                }

                if (e.getSlot() == 4) {
                    player.sendMessage("§b§8[§a§lCraftable Spawn eggs§8] §8[§6§lConfig§8] §6>> §eToggled crafting recipe bat to: §2§lTrue ");
                    plugin.getConfig().set("enabled_spawn_eggs.bat.enabled",Boolean.TRUE );
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 5) {
                    player.sendMessage("§b§8[§a§lCraftable Spawn eggs§8] §8[§6§lConfig§8] §6>> §eToggled crafting recipe bat to: §4§lFalse ");
                    plugin.getConfig().set("enabled_spawn_eggs.bat.enabled",Boolean.FALSE );
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 13) {
                    player.sendMessage("§b§8[§a§lCraftable Spawn eggs§8] §8[§6§lConfig§8] §6>> §eToggled crafting recipe bee to: §2§lTrue ");
                    plugin.getConfig().set("enabled_spawn_eggs.bee.enabled",Boolean.TRUE );
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 14) {
                    player.sendMessage("§b§8[§a§lCraftable Spawn eggs§8] §8[§6§lConfig§8] §6>> §eToggled crafting recipe bee to: §4§lFalse ");
                    plugin.getConfig().set("enabled_spawn_eggs.bee.enabled",Boolean.FALSE );
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 22) {
                    player.sendMessage("§b§8[§a§lCraftable Spawn eggs§8] §8[§6§lConfig§8] §6>> §eToggled crafting recipe chicken to: §2§lTrue ");
                    plugin.getConfig().set("enabled_spawn_eggs.chicken.enabled",Boolean.TRUE );
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 23) {
                    player.sendMessage("§b§8[§a§lCraftable Spawn eggs§8] §8[§6§lConfig§8] §6>> §eToggled crafting recipe chicken to: §4§lFalse ");
                    plugin.getConfig().set("enabled_spawn_eggs.chicken.enabled",Boolean.FALSE );
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 31) {
                    player.sendMessage("§b§8[§a§lCraftable Spawn eggs§8] §8[§6§lConfig§8] §6>> §eToggled crafting recipe cat to: §2§lTrue ");
                    plugin.getConfig().set("enabled_spawn_eggs.cat.enabled",Boolean.TRUE );
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 32) {
                    player.sendMessage("§b§8[§a§lCraftable Spawn eggs§8] §8[§6§lConfig§8] §6>> §eToggled crafting recipe cat to: §4§lFalse ");
                    plugin.getConfig().set("enabled_spawn_eggs.cat.enabled",Boolean.FALSE );
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 40) {
                    player.sendMessage("§b§8[§a§lCraftable Spawn eggs§8] §8[§6§lConfig§8] §6>> §eToggled crafting recipe cave spider to: §2§lTrue ");
                    plugin.getConfig().set("enabled_spawn_eggs.cave_spider.enabled",Boolean.TRUE );
                    plugin.saveConfig();
                    plugin.reloadConfig();
                }
                if (e.getSlot() == 41) {
                    player.sendMessage("§b§8[§a§lCraftable Spawn eggs§8] §8[§6§lConfig§8] §6>> §eToggled crafting recipe cave spider to: §4§lFalse ");
                    plugin.getConfig().set("enabled_spawn_eggs.cave_spider.enabled",Boolean.FALSE );
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
