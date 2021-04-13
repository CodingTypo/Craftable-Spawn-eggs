package com.rubin.cse.items.SpawnEggs;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class SheepSpawnItem {

    public static ItemStack sheepspawn;

    public static void init() {
        createSheepspawn();
    }

    private static void createSheepspawn() {
        ItemStack item = new ItemStack(Material.SHEEP_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fSheep");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable sheep egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Sheep!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        sheepspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("sheepspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.MUTTON);
        Bukkit.getServer().addRecipe(sr);


    }
}