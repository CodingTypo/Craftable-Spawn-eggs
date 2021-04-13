package com.rubin.cse.items.SpawnEggs;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class PigSpawnItem {

    public static ItemStack pigspawn;

    public static void init() {
        createpigspawn();
    }

    private static void createpigspawn() {
        ItemStack item = new ItemStack(Material.PIG_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§dpig");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable pig spawn egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7pig!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        pigspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("pigspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.PORKCHOP);
        Bukkit.getServer().addRecipe(sr);


    }
}