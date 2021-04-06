package com.rubin.cse.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class GhastSpawnItem {

    public static ItemStack ghastspawn;

    public static void init() {
        createGhastspawn();
    }

    private static void createGhastspawn() {
        ItemStack item = new ItemStack(Material.GHAST_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§3Spawn Ghast");
        List<String> lore = new ArrayList<>();
        lore.add("§1Craftable Ghast spawn egg");
        lore.add("§1this spawn egg summons:");
        lore.add("§1Ghast!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        ghastspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("ghastspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.GHAST_TEAR);
        Bukkit.getServer().addRecipe(sr);


    }
}