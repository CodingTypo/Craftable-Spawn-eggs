package com.rubin.cse.GUI;

import com.rubin.cse.items.ArrowLeftItem;
import com.rubin.cse.items.ArrowRightItem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CseGiveGUI2 implements InventoryHolder {

    private  Inventory inv;

    public CseGiveGUI2() {
        inv = Bukkit.createInventory(this, 36, "CseGive");//54 max size
        init();
    }

    private void init()  {
        ItemStack item;

        // left
        for (int i = 0; i < 3; i++) {
            item = CreateItem("§7§l/csegive", Material.GRAY_STAINED_GLASS_PANE, Collections.singletonList("§7Make a Choice"));
            inv.setItem(i, item);
        }
        //center
        List<String> lore = new ArrayList<>();
        lore.add("§4Exit ths menu");
        item = CreateItem("§4Exit", Material.BARRIER, lore);
        inv.setItem(4, item);

        // right
        for (int i = 6; i < 9; i++) {
            item = CreateItem("§7§l/csegive", Material.GRAY_STAINED_GLASS_PANE, Collections.singletonList("§7Make a Choice"));
            inv.setItem(i, item);
        }

        //next,previous page
        {item = (ArrowLeftItem.arrowleft);
            inv.setItem(3, item); }

        {item = (ArrowRightItem.arrowright);
            inv.setItem(5, item); }

        // spawn eggs
        for (int i = 9; i <9; i++);{
            item = CreateItem("§7§lBee Spawn Egg",Material.BEE_SPAWN_EGG, Collections.singletonList("§7give yourself a Bee_spawn_egg"));
            inv.setItem(9, item); }

        for (int i = 10; i <10; i++);{
            item = CreateItem("§7§lSpider Spawn Egg",Material.SPIDER_SPAWN_EGG, Collections.singletonList("§7give yourself a Spider_spawn_egg"));
            inv.setItem(10, item); }

        for (int i = 11; i <11; i++);{
            item = CreateItem("§7§lGuardian Spawn Egg",Material.GUARDIAN_SPAWN_EGG, Collections.singletonList("§7give yourself a Guardian_spawn_egg"));
            inv.setItem(11, item); }

        for (int i = 12; i <12; i++);{
            item = CreateItem("§7§lElder Guardian Spawn Egg",Material.ELDER_GUARDIAN_SPAWN_EGG, Collections.singletonList("§7give yourself a Elder_Guardian_spawn_egg"));
            inv.setItem(12, item); }

        for (int i = 13; i <13; i++);{
            item = CreateItem("§7§lShulker Spawn Egg",Material.SHULKER_SPAWN_EGG, Collections.singletonList("§7give yourself a Shulker_spawn_egg"));
            inv.setItem(13, item); }

        for (int i = 14; i <14; i++);{
            item = CreateItem("§7§lHusk Spawn Egg",Material.HUSK_SPAWN_EGG, Collections.singletonList("§7give yourself a Husk_spawn_egg"));
            inv.setItem(14, item); }

        for (int i = 15; i <15; i++);{
            item = CreateItem("§7§lStray Spawn Egg",Material.STRAY_SPAWN_EGG, Collections.singletonList("§7give yourself a Stray_spawn_egg"));
            inv.setItem(15, item); }

        for (int i = 16; i <16; i++);{
            item = CreateItem("§7§lCave Spider Spawn Egg",Material.CAVE_SPIDER_SPAWN_EGG, Collections.singletonList("§7give yourself a Cave_Spider_spawn_egg"));
            inv.setItem(16, item); }

        for (int i = 17; i <17; i++);{
            item = CreateItem("§7§lEnderman Spawn Egg",Material.ENDERMAN_SPAWN_EGG, Collections.singletonList("§7give yourself a Enderman_spawn_egg"));
            inv.setItem(17, item); }

        for (int i = 18; i <18; i++);{
            item = CreateItem("§7§lZombified Piglin Spawn Egg",Material.ZOMBIFIED_PIGLIN_SPAWN_EGG, Collections.singletonList("§7give yourself a Zombified_Piglin_spawn_egg"));
            inv.setItem(18, item); }

        for (int i = 19; i <19; i++);{
            item = CreateItem("§7§lPhantom Spawn Egg",Material.PHANTOM_SPAWN_EGG, Collections.singletonList("§7give yourself a Phantom_spawn_egg"));
            inv.setItem(19, item); }

        for (int i = 20; i <20; i++);{
            item = CreateItem("§7§lEvokerSpawn Egg",Material.EVOKER_SPAWN_EGG, Collections.singletonList("§7give yourself a Evoker_spawn_egg"));
            inv.setItem(20, item); }

        for (int i = 21; i <21; i++);{
            item = CreateItem("§7§lVindicator Spawn Egg",Material.VINDICATOR_SPAWN_EGG, Collections.singletonList("§7give yourself a Vindicator_spawn_egg"));
            inv.setItem(21, item); }

        for (int i = 22; i <22; i++);{
            item = CreateItem("§7§lPillager Spawn Egg",Material.PILLAGER_SPAWN_EGG, Collections.singletonList("§7give yourself a Pillager_spawn_egg"));
            inv.setItem(22, item); }

        for (int i = 23; i <23; i++);{
            item = CreateItem("§7§lRavager Spawn Egg",Material.RAVAGER_SPAWN_EGG, Collections.singletonList("§7give yourself a Ravager_spawn_egg"));
            inv.setItem(23, item); }

        for (int i = 24; i <24; i++);{
            item = CreateItem("§7§lVex Spawn Egg",Material.VEX_SPAWN_EGG, Collections.singletonList("§7give yourself a Vex_spawn_egg"));
            inv.setItem(24, item); }

        for (int i = 25; i <25; i++);{
            item = CreateItem("§7§lEndermite Spawn Egg",Material.ENDERMITE_SPAWN_EGG, Collections.singletonList("§7give yourself a Endermite_spawn_egg"));
            inv.setItem(25, item); }

        for (int i = 26; i <26; i++);{
            item = CreateItem("§7§lZombie Villager Spawn Egg",Material.ZOMBIE_VILLAGER_SPAWN_EGG, Collections.singletonList("§7give yourself a Zombie_Villager_spawn_egg"));
            inv.setItem(26, item); }

        for (int i = 27; i <27; i++);{
            item = CreateItem("§7§lZombie Spawn Egg",Material.ZOMBIE_SPAWN_EGG, Collections.singletonList("§7give yourself a Zombie_spawn_egg"));
            inv.setItem(27, item); }

        for (int i = 28; i <28; i++);{
            item = CreateItem("§7§lWither Skeleton Spawn Egg",Material.WITHER_SKELETON_SPAWN_EGG, Collections.singletonList("§7give yourself a Wither_Skeleton_spawn_egg"));
            inv.setItem(28, item); }

        for (int i = 29; i <29; i++);{
            item = CreateItem("§7§lSlime Spawn Egg",Material.SLIME_SPAWN_EGG, Collections.singletonList("§7give yourself a Slime_spawn_egg"));
            inv.setItem(29, item); }

        for (int i = 30; i <30; i++);{
            item = CreateItem("§7§lSkeleton Spawn Egg",Material.SKELETON_SPAWN_EGG, Collections.singletonList("§7give yourself a Skeleton_spawn_egg"));
            inv.setItem(30, item); }

        for (int i = 31; i <31; i++);{
            item = CreateItem("§7§lDrowned Spawn Egg",Material.DROWNED_SPAWN_EGG, Collections.singletonList("§7give yourself a Drowned_spawn_egg"));
            inv.setItem(31, item); }

        for (int i = 32; i <32; i++);{
            item = CreateItem("§7§lWitch Spawn Egg",Material.WITCH_SPAWN_EGG, Collections.singletonList("§7give yourself a Witch_spawn_egg"));
            inv.setItem(32, item); }

        for (int i = 33; i <33; i++);{
            item = CreateItem("§7§lHoglin Spawn Egg",Material.HOGLIN_SPAWN_EGG, Collections.singletonList("§7give yourself a Hoglin_spawn_egg"));
            inv.setItem(33, item); }

        for (int i = 34; i <34; i++);{
            item = CreateItem("§7§lPiglin Spawn Egg",Material.PIGLIN_SPAWN_EGG, Collections.singletonList("§7give yourself a Piglin_spawn_egg"));
            inv.setItem(34, item); }

        for (int i = 35; i <35; i++);{
            item = CreateItem("§7§lCreeper Spawn Egg",Material.CREEPER_SPAWN_EGG, Collections.singletonList("§7give yourself a Creeper_spawn_egg"));
            inv.setItem(35, item); }


    }
    private  ItemStack CreateItem(String name, Material mat, List<String> lore) {
        ItemStack item = new ItemStack(mat, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    @Override
    public Inventory getInventory() {
        return inv;
    }
}
