package com.rubin.cse.items.SpawnEggs;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class DrownedSpawnItem {

    public static ItemStack drownedspawn;

    public static void init() {
        createDrownedspawn();
    }

    private static void createDrownedspawn() {
        ItemStack item = new ItemStack(Material.DROWNED_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§3Drowned");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable Drowned spawn egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Drowned!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        drownedspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("drownedspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.NAUTILUS_SHELL);
        Bukkit.getServer().addRecipe(sr);


    }
}