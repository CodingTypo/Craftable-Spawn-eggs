package com.rubin.cse.items.SpawnEggs;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class StraySpawnItem {

    public static ItemStack strayspawn;

    public static void init() {
        createStrayspawn();
    }

    private static void createStrayspawn() {
        ItemStack item = new ItemStack(Material.STRAY_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fStray");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable Stray spawn egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Stray!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        strayspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("strayspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.ARROW);
        Bukkit.getServer().addRecipe(sr);


    }
}