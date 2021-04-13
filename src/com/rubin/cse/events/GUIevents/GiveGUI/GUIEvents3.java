package com.rubin.cse.events.GUIevents.GiveGUI;

import com.rubin.cse.GUI.GiveGUI.CseGiveGUI2;
import com.rubin.cse.GUI.GiveGUI.CseGiveGUI3;
import com.rubin.cse.items.SpawnEggs.BlazeSpawnItem;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GUIEvents3 implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getClickedInventory() == null) {
            return;
        }
        if (e.getClickedInventory().getHolder() instanceof CseGiveGUI3) {
            e.setCancelled (true);
            if (e.isLeftClick ()) {
                Player player = (Player) e.getWhoClicked ();
                if (e.getCurrentItem () == null) {
                    return;
                }

                //spawn eggs
                if (e.getCurrentItem ().getType () == Material.BLAZE_SPAWN_EGG) {
                    player.sendMessage ( "§8[§a§lCraftable Spawn eggs§8] §2>>  §bYou gave yourself 1 Blaze_Spawn_egg" );
                    player.getInventory ().addItem ( BlazeSpawnItem.blazespawn );


                //navigation bar
                } else if (e.getSlot () == 4) {
                    Player player2= (Player) e.getWhoClicked ();
                    player2.sendMessage ( "§8[§a§lCraftable Spawn eggs§8] §2>> §bYou closed the /csegive menu" );
                    player2.closeInventory ();
                }
                CseGiveGUI2 gui = new CseGiveGUI2 ();
                if (e.getSlot () == 3) {
                    Player player3 = (Player) e.getWhoClicked ();
                    player3.closeInventory ();
                    player3.openInventory ( gui.getInventory () );
                } else if (e.getSlot () == 5) {
                    Player player4 = (Player) e.getWhoClicked ();
                    player4.closeInventory ();
                }
            }
        }
    }
}


