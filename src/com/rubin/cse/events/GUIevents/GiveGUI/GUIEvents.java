package com.rubin.cse.events.GUIevents.GiveGUI;

import com.rubin.cse.GUI.GiveGUI.CseGiveGUI;
import com.rubin.cse.GUI.GiveGUI.CseGiveGUI2;
import com.rubin.cse.items.SpawnEggs.*;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GUIEvents implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getClickedInventory() == null) {
            return;
        }
        if (e.getClickedInventory().getHolder() instanceof CseGiveGUI) {
            e.setCancelled(true);
            if (e.isLeftClick()) {
                Player player = (Player) e.getWhoClicked();
                if (e.getCurrentItem() == null) {
                    return;
                }
                if (e.getCurrentItem().getType() == Material.COW_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Cow_Spawn_egg");
                    player.getInventory().addItem(CowSpawnItem.cowspawn);
                }
                else if (e.getCurrentItem().getType() == Material.SHEEP_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Sheep_Spawn_Egg");
                    player.getInventory().addItem( SheepSpawnItem.sheepspawn);
                }
                else if (e.getCurrentItem().getType() == Material.PIG_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Pig_Spawn_Egg");
                    player.getInventory().addItem(PigSpawnItem.pigspawn);
                }
                else if (e.getCurrentItem().getType() == Material.FOX_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Fox_Spawn_Egg");
                    player.getInventory().addItem(FoxSpawnItem.foxspawn);
                }
                else if (e.getCurrentItem().getType() == Material.BAT_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Bat_Spawn_Egg");
                    player.getInventory().addItem(BatSpawnItem.batspawn);
                }
                else if (e.getCurrentItem().getType() == Material.CHICKEN_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Chicken_Spawn_Egg");
                    player.getInventory().addItem(ChickenSpawnItem.chickenspawn);
                }
                else if (e.getCurrentItem().getType() == Material.COD_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Cod_Spawn_Egg");
                    player.getInventory().addItem( CodSpawnItem.codspawn);
                }
                else if (e.getCurrentItem().getType() == Material.OCELOT_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Ocelot_Spawn_Egg");
                    player.getInventory().addItem(OcelotSpawnItems.ocelotspawn);
                }
                else if (e.getCurrentItem().getType() == Material.RABBIT_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Rabbit_Spawn_Egg");
                    player.getInventory().addItem(RabbitSpawnItem.rabbitspawn);
                }
                else if (e.getCurrentItem().getType() == Material.SALMON_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Salmon_Spawn_Egg");
                    player.getInventory().addItem(SalmonSpawnItem.salmonspawn);
                }
                else if (e.getCurrentItem().getType() == Material.MULE_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Mule_Spawn_Egg");
                    player.getInventory().addItem(MuleSpawnItem.mulespawn);
                }
                else if (e.getCurrentItem().getType() == Material.SKELETON_HORSE_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Skeleton_horse_Spawn_Egg");
                    player.getInventory().addItem(SkeletonhorseSpawnItem.skeletonhorsespawn);
                }
                else if (e.getCurrentItem().getType() == Material.DOLPHIN_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Dolphin_Spawn_Egg");
                    player.getInventory().addItem(DolphinSpawnItem.dolphinspawn);
                }
                else if (e.getCurrentItem().getType() == Material.POLAR_BEAR_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Polar_Bear_Spawn_Egg");
                    player.getInventory().addItem(PolarbearSpawnItem.polarbearspawn);
                }
                else if (e.getCurrentItem().getType() == Material.LLAMA_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Llama_Spawn_Egg");
                    player.getInventory().addItem(LlamaSpawnItem.llamaspawn);
                }
                else if (e.getCurrentItem().getType() == Material.PANDA_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Panda_Spawn_Egg");
                    player.getInventory().addItem(PandaSpawnItem.pandaspawn);
                }
                else if (e.getCurrentItem().getType() == Material.VILLAGER_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Villager_Spawn_Egg");
                    player.getInventory().addItem(VillagerSpawnItem.villagerspawn);
                }
                else if (e.getCurrentItem().getType() == Material.TURTLE_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Turtle_Spawn_Egg");
                    player.getInventory().addItem(TurtleSpawnItem.turtlespawn);
                }
                else if (e.getCurrentItem().getType() == Material.TROPICAL_FISH_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Tropical_Fish_Spawn_Egg");
                    player.getInventory().addItem(TropicalFishSpawnItem.tropicalfishspawn);
                }
                else if (e.getCurrentItem().getType() == Material.SQUID_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Squid_Spawn_Egg");
                    player.getInventory().addItem( SquidSpawnItem.squidspawn);
                }
                else if (e.getCurrentItem().getType() == Material.PUFFERFISH_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Pufferfish_Spawn_Egg");
                    player.getInventory().addItem( PufferfishSpawnItem.pufferfishspawn);
                }
                else if (e.getCurrentItem().getType() == Material.PARROT_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Parrot_Spawn_Egg");
                    player.getInventory().addItem(ParrotSpawnItem.parrotspawn);
                }
                else if (e.getCurrentItem().getType() == Material.MOOSHROOM_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Mooshroom_Spawn_Egg");
                    player.getInventory().addItem(MooshroomSpawnItem.mooshroomspawn);
                }
                else if (e.getCurrentItem().getType() == Material.HORSE_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Horse_Spawn_Egg");
                    player.getInventory().addItem(HorseSpawnItem.horsespawn);
                }
                else if (e.getCurrentItem().getType() == Material.DONKEY_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Donkey_Spawn_Egg");
                    player.getInventory().addItem( DonkeySpawnItem.donkeyspawn);
                }
                else if (e.getCurrentItem().getType() == Material.CAT_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Cat_Spawn_Egg");
                    player.getInventory().addItem(CatSpawnItem.catspawn);
                }
                else if (e.getCurrentItem().getType() == Material.WOLF_SPAWN_EGG) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou gave yourself 1 Wolf_Spawn_Egg");
                    player.getInventory().addItem( WolfSpawnItem.wolfspawn);
                }

                else if (e.getSlot() == 4) {
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bYou closed the /csegive menu");
                    player.closeInventory ();
                }
                CseGiveGUI2 gui2 =  new CseGiveGUI2 ();
                if (e.getSlot() == 5) {
                    player.closeInventory();
                    player.openInventory (gui2.getInventory());
                }
            }
        }
    }
}
