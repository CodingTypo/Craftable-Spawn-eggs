package com.rubin.cse.items.SpawnEggs;

import com.rubin.cse.CseMain;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ChickenSpawnItem {

    private static CseMain plugin;


    public ChickenSpawnItem(CseMain instance){
        plugin = instance;
    }

    public static ItemStack chickenspawn;

    public static void init() {
        createChickenspawn();
    }

    private static void createChickenspawn() {
        ItemStack item = new ItemStack(Material.CHICKEN_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fChicken");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable Chicken spawn egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Chicken!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        chickenspawn = item;

        //Shaped recipe
        if (plugin.getConfig().getBoolean("enabled_spawn_eggs.chicken.enabled")) {
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("chickenspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.CHICKEN);
        Bukkit.getServer().addRecipe(sr);
        }


    }
}