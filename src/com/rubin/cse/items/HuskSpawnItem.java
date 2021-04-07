package com.rubin.cse.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class HuskSpawnItem {

    public static ItemStack huskspawn;

    public static void init() {
        createHuskspawn();
    }

    private static void createHuskspawn() {
        ItemStack item = new ItemStack(Material.HUSK_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Husk");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable Husk spawn egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Husk!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        huskspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("huskspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.SAND);
        Bukkit.getServer().addRecipe(sr);


    }
}