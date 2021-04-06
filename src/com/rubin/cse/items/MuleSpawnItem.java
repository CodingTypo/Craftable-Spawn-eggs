package com.rubin.cse.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class MuleSpawnItem {

    public static ItemStack mulespawn;

    public static void init() {
        createmulespawn();
    }

    private static void createmulespawn() {
        ItemStack item = new ItemStack(Material.MULE_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§3Spawn Mule");
        List<String> lore = new ArrayList<>();
        lore.add("§1Craftable mule spawn egg");
        lore.add("§1this spawn egg summons:");
        lore.add("§1Mule!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        mulespawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("mulespawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.GOLDEN_CARROT);
        Bukkit.getServer().addRecipe(sr);


    }
}