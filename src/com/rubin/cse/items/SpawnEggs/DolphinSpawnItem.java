package com.rubin.cse.items.SpawnEggs;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class DolphinSpawnItem {

    public static ItemStack dolphinspawn;

    public static void init() {
        createDolphinspawn();
    }

    private static void createDolphinspawn() {
        ItemStack item = new ItemStack(Material.DOLPHIN_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§3Dolphin");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable Dolphin spawn egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Dolphin!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        dolphinspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("dolphinspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.WATER_BUCKET);
        Bukkit.getServer().addRecipe(sr);


    }
}