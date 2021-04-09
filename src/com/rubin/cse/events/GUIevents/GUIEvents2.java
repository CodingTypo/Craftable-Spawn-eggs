package com.rubin.cse.events.GUIevents;

import com.rubin.cse.GUI.CseGiveGUI;
import com.rubin.cse.GUI.CseGiveGUI2;
import com.rubin.cse.GUI.CseGiveGUI3;
import com.rubin.cse.items.*;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GUIEvents2 implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getClickedInventory() == null) {
            return;
        }
        if (e.getClickedInventory().getHolder() instanceof CseGiveGUI2) {
            e.setCancelled(true);
            if (e.isLeftClick()) {
                Player player = (Player) e.getWhoClicked();
                if (e.getCurrentItem() == null) {
                    return;
                }
                if (e.getCurrentItem().getType() == Material.BEE_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>>  §bYou gave yourself 1 Bee_Spawn_egg");
                    player.getInventory().addItem(BeeSpawnItem.beespawn);
                }
                if (e.getCurrentItem().getType() == Material.SPIDER_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Spider_Spawn_egg");
                    player.getInventory().addItem(SpiderSpawnItem.spiderspawn);
                }
                if (e.getCurrentItem().getType() == Material.GUARDIAN_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Guardian_Spawn_egg");
                    player.getInventory().addItem(GuardianSpawnItem.guardianspawn);
                }
                if (e.getCurrentItem().getType() == Material.ELDER_GUARDIAN_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Elder_Guardian_Spawn_egg");
                    player.getInventory().addItem(ElderGuardianSpawnItem.elder_guardianspawn);
                }
                if (e.getCurrentItem().getType() == Material.SHULKER_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Shulker_Spawn_egg");
                    player.getInventory().addItem(ShulkerSpawnItem.shulkerspawn);
                }
                if (e.getCurrentItem().getType() == Material.HUSK_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Husk_Spawn_egg");
                    player.getInventory().addItem(HuskSpawnItem.huskspawn);
                }
                if (e.getCurrentItem().getType() == Material.STRAY_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Stray_Spawn_egg");
                    player.getInventory().addItem(StraySpawnItem.strayspawn);
                }
                if (e.getCurrentItem().getType() == Material.CAVE_SPIDER_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Cave_Spider_Spawn_egg");
                    player.getInventory().addItem(CaveSpiderSpawnItem.cavespiderspawn);
                }
                if (e.getCurrentItem().getType() == Material.ENDERMAN_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Enderman_Spawn_egg");
                    player.getInventory().addItem(EndermanSpawnItem.endermanspawn);
                }
                if (e.getCurrentItem().getType() == Material.ZOMBIFIED_PIGLIN_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Zombified_piglin_Spawn_egg");
                    player.getInventory().addItem(ZombiePigmanSpawnItem.zombiepigmanspawn);
                }
                if (e.getCurrentItem().getType() == Material.PHANTOM_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Phantom_Spawn_egg");
                    player.getInventory().addItem(PhantomSpawnItem.phantomspawn);
                }
                if (e.getCurrentItem().getType() == Material.EVOKER_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Evoker_Spawn_egg");
                    player.getInventory().addItem(EvokerSpawnItem.evokerspawn);
                }
                if (e.getCurrentItem().getType() == Material.VINDICATOR_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Vindicator_Spawn_egg");
                    player.getInventory().addItem(VindicatorSpawnItem.vindicatorspawn);
                }
                if (e.getCurrentItem().getType() == Material.PILLAGER_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Pillager_Spawn_egg");
                    player.getInventory().addItem(PillagerSpawnItem.pillagerspawn);
                }
                if (e.getCurrentItem().getType() == Material.RAVAGER_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Ravager_Spawn_egg");
                    player.getInventory().addItem(RavagerSpawnItem.ravagerspawn);
                }
                if (e.getCurrentItem().getType() == Material.VEX_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Vex_Spawn_egg");
                    player.getInventory().addItem(VexSpawnItem.vexspawn);
                }
                if (e.getCurrentItem().getType() == Material.ENDERMITE_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Endermite_Spawn_egg");
                    player.getInventory().addItem(EndermiteSpawnItem.endermitespawn);
                }
                if (e.getCurrentItem().getType() == Material.ZOMBIE_VILLAGER_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Zombie_Villager_Spawn_egg");
                    player.getInventory().addItem(ZombieVillagerSpawnItem.zombievillagerspawn);
                }
                if (e.getCurrentItem().getType() == Material.ZOMBIE_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Zombie_Spawn_egg");
                    player.getInventory().addItem(ZombieSpawnItem.zombiespawn);
                }
                if (e.getCurrentItem().getType() == Material.WITHER_SKELETON_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Wither_Skeleton_Spawn_egg");
                    player.getInventory().addItem(WitherSkeletonSpawnItem.witherskeletonspawn);
                }
                if (e.getCurrentItem().getType() == Material.SLIME_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Slime_Spawn_egg");
                    player.getInventory().addItem(SlimeSpawnItem.slimespawn);
                }
                if (e.getCurrentItem().getType() == Material.SKELETON_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Skeleton_Spawn_egg");
                    player.getInventory().addItem(SkeletonSpawnItem.skeletonspawn);
                }
                if (e.getCurrentItem().getType() == Material.DROWNED_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Drowned_Spawn_egg");
                    player.getInventory().addItem(DrownedSpawnItem.drownedspawn);
                }
                if (e.getCurrentItem().getType() == Material.WITCH_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Witch_Spawn_egg");
                    player.getInventory().addItem(WitchSpawnItem.witchspawn);
                }
                if (e.getCurrentItem().getType() == Material.HOGLIN_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Hoglin_Spawn_egg");
                    player.getInventory().addItem(HoglinSpawnItem.hoglinspawn);
                }
                if (e.getCurrentItem().getType() == Material.PIGLIN_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Piglin_Spawn_egg");
                    player.getInventory().addItem(PiglinSpawnItem.piglinspawn);
                }
                if (e.getCurrentItem().getType() == Material.CREEPER_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Creeper_Spawn_egg");
                    player.getInventory().addItem(CreeperSpawnItem.creeperspawn);
                }


                else if (e.getSlot() == 4) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou closed the /csegive menu");
                    player.closeInventory ();
                }
                CseGiveGUI gui =  new CseGiveGUI();
                if (e.getSlot() == 3) {
                    player.closeInventory();
                    player.openInventory (gui.getInventory());
                } else if (e.getSlot() == 5) {
                    CseGiveGUI3 gui3 =  new CseGiveGUI3 ();
                    player.closeInventory ();
                    player.openInventory (gui3.getInventory ());
                }
            }
        }
    }
}
