package com.rubin.cse.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class SpiderSpawnItem {

    public static ItemStack spiderspawn;

    public static void init() {
        createSpiderspawn();
    }

    private static void createSpiderspawn() {
        ItemStack item = new ItemStack(Material.SPIDER_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8Spider");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable Spider spawn egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Spider!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        spiderspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("spiderspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.SPIDER_EYE);
        Bukkit.getServer().addRecipe(sr);


    }
}