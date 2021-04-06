package com.rubin.cse.events;

import com.rubin.cse.items.GhastSpawnItem;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class GhastSpawnEvents implements Listener {

    @EventHandler
    public static void onRightClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().equals(GhastSpawnItem.ghastspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new ghast!");
                }
            }
        }
    }
}

