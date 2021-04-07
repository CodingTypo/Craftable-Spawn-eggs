package com.rubin.cse.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class SalmonSpawnItem {

    public static ItemStack salmonspawn;

    public static void init() {
        createCowspawn();
    }

    private static void createCowspawn() {
        ItemStack item = new ItemStack(Material.SALMON_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bSalmon");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable Salmon spawn egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Salmon!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        salmonspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("salmonspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.SALMON);
        Bukkit.getServer().addRecipe(sr);


    }
}