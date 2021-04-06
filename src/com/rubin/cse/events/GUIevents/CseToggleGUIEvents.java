package com.rubin.cse.events.GUIevents;

import com.rubin.cse.GUI.CseGiveGUI;
import com.rubin.cse.GUI.CseToggleGUI;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class CseToggleGUIEvents implements Listener {

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
