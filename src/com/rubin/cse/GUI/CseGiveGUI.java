package com.rubin.cse.GUI;

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

public class CseGiveGUI implements InventoryHolder {

    private  Inventory inv;

    public CseGiveGUI() {
        inv = Bukkit.createInventory(this, 36, "CseGive");//54 max size
        init();
    }

    private void init()  {
        ItemStack item;

        // left
        for (int i = 0; i < 4; i++) {
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
        {item = (ArrowRightItem.arrowright);
            inv.setItem(5, item); }

        // spawn eggs
        for (int i = 9; i <9; i++);{

            item = CreateItem("§7§lCow Spawn Egg",Material.COW_SPAWN_EGG, Collections.singletonList("§7give yourself a cow_spawn_egg"));
            inv.setItem(9, item); }

        for (int i = 10; i <10; i++);{
            item = CreateItem("§7§lSheep Spawn Egg",Material.SHEEP_SPAWN_EGG, Collections.singletonList("§7give yourself a sheep_spawn_egg"));
            inv.setItem(10, item); }

        for (int i = 11; i <11; i++);{
            item = CreateItem("§7§lPig Spawn Egg",Material.PIG_SPAWN_EGG, Collections.singletonList("§7give yourself a pig_spawn_egg"));
            inv.setItem(11, item); }

        for (int i = 12; i <12; i++);{
            item = CreateItem("§7§lFox Spawn Egg",Material.FOX_SPAWN_EGG, Collections.singletonList("§7give yourself a fox_spawn_egg"));
            inv.setItem(12, item); }

        for (int i = 13; i <13; i++);{
            item = CreateItem("§7§lBat Spawn Egg",Material.BAT_SPAWN_EGG, Collections.singletonList("§7give yourself a bat_spawn_egg"));
            inv.setItem(13, item); }

        for (int i = 14; i <14; i++);{
            item = CreateItem("§7§lChicken Spawn Egg",Material.CHICKEN_SPAWN_EGG, Collections.singletonList("§7give yourself a chicken_spawn_egg"));
            inv.setItem(14, item); }

        for (int i = 15; i <15; i++);{
            item = CreateItem("§7§lCod Spawn Egg",Material.COD_SPAWN_EGG, Collections.singletonList("§7give yourself a cod_spawn_egg"));
            inv.setItem(15, item); }

        for (int i = 16; i <16; i++);{
            item = CreateItem("§7§lOcelot Spawn Egg",Material.OCELOT_SPAWN_EGG, Collections.singletonList("§7give yourself a Ocelot_spawn_egg"));
            inv.setItem(16, item); }

        for (int i = 17; i <17; i++);{
            item = CreateItem("§7§lRabbit Spawn Egg",Material.RABBIT_SPAWN_EGG, Collections.singletonList("§7give yourself a Rabbit_spawn_egg"));
            inv.setItem(17, item); }

        for (int i = 18; i <18; i++);{
            item = CreateItem("§7§lSalmon Spawn Egg",Material.SALMON_SPAWN_EGG, Collections.singletonList("§7give yourself a Salmon_spawn_egg"));
            inv.setItem(18, item); }

        for (int i = 19; i <19; i++);{
            item = CreateItem("§7§lMule Spawn Egg",Material.MULE_SPAWN_EGG, Collections.singletonList("§7give yourself a Mule_spawn_egg"));
            inv.setItem(19, item); }

        for (int i = 20; i <20; i++);{
            item = CreateItem("§7§lSkeletonHorse Spawn Egg",Material.SKELETON_HORSE_SPAWN_EGG, Collections.singletonList("§7give yourself a Skeleton_horse_spawn_egg"));
            inv.setItem(20, item); }

        for (int i = 21; i <21; i++);{
            item = CreateItem("§7§lDolphin Spawn Egg",Material.DOLPHIN_SPAWN_EGG, Collections.singletonList("§7give yourself a dolphin_spawn_egg"));
            inv.setItem(21, item); }

        for (int i = 22; i <22; i++);{
            item = CreateItem("§7§lPolar Bear Spawn Egg",Material.POLAR_BEAR_SPAWN_EGG, Collections.singletonList("§7give yourself a Polar_Bear_spawn_egg"));
            inv.setItem(22, item); }

        for (int i = 23; i <23; i++);{
            item = CreateItem("§7§lLlama Spawn Egg",Material.LLAMA_SPAWN_EGG, Collections.singletonList("§7give yourself a Llama_spawn_egg"));
            inv.setItem(23, item); }

        for (int i = 24; i <24; i++);{
            item = CreateItem("§7§lPanda Spawn Egg",Material.PANDA_SPAWN_EGG, Collections.singletonList("§7give yourself a Panda_spawn_egg"));
            inv.setItem(24, item); }

        for (int i = 25; i <25; i++);{
            item = CreateItem("§7§lVillager Spawn Egg",Material.VILLAGER_SPAWN_EGG, Collections.singletonList("§7give yourself a Villager_spawn_egg"));
            inv.setItem(25, item); }

        for (int i = 26; i <26; i++);{
            item = CreateItem("§7§lTurtle Spawn Egg",Material.TURTLE_SPAWN_EGG, Collections.singletonList("§7give yourself a Turtle_spawn_egg"));
            inv.setItem(26, item); }

        for (int i = 27; i <27; i++);{
            item = CreateItem("§7§lTropical Fish Spawn Egg",Material.TROPICAL_FISH_SPAWN_EGG, Collections.singletonList("§7give yourself a Tropical_Fish_spawn_egg"));
            inv.setItem(27, item); }

        for (int i = 28; i <28; i++);{
            item = CreateItem("§7§lSquid Spawn Egg",Material.SQUID_SPAWN_EGG, Collections.singletonList("§7give yourself a Squid_spawn_egg"));
            inv.setItem(28, item); }

        for (int i = 29; i <29; i++);{
            item = CreateItem("§7§lPufferfish Spawn Egg",Material.PUFFERFISH_SPAWN_EGG, Collections.singletonList("§7give yourself a Pufferfish_spawn_egg"));
            inv.setItem(29, item); }

        for (int i = 30; i <30; i++);{
            item = CreateItem("§7§lParrot Spawn Egg",Material.PARROT_SPAWN_EGG, Collections.singletonList("§7give yourself a Parrot_spawn_egg"));
            inv.setItem(30, item); }

        for (int i = 31; i <31; i++);{
            item = CreateItem("§7§lMooshroom Spawn Egg",Material.MOOSHROOM_SPAWN_EGG, Collections.singletonList("§7give yourself a Mooshroom_spawn_egg"));
            inv.setItem(31, item); }

        for (int i = 32; i <32; i++);{
            item = CreateItem("§7§lHorse Spawn Egg",Material.HORSE_SPAWN_EGG, Collections.singletonList("§7give yourself a Horse_spawn_egg"));
            inv.setItem(32, item); }

        for (int i = 33; i <33; i++);{
            item = CreateItem("§7§lDonkey Spawn Egg",Material.DONKEY_SPAWN_EGG, Collections.singletonList("§7give yourself a Donkey_spawn_egg"));
            inv.setItem(33, item); }

        for (int i = 34; i <34; i++);{
            item = CreateItem("§7§lCat Spawn Egg",Material.CAT_SPAWN_EGG, Collections.singletonList("§7give yourself a Cat_spawn_egg"));
            inv.setItem(34, item); }

        for (int i = 35; i <35; i++);{
            item = CreateItem("§7§lWolf Spawn Egg",Material.WOLF_SPAWN_EGG, Collections.singletonList("§7give yourself a Wolf_spawn_egg"));
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
