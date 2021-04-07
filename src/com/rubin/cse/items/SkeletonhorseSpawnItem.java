package com.rubin.cse.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class SkeletonhorseSpawnItem {

    public static ItemStack skeletonhorsespawn;

    public static void init() {
        createskeletonhorsespawn();
    }

    private static void createskeletonhorsespawn() {
        ItemStack item = new ItemStack(Material.SKELETON_HORSE_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fSkeletonhorse");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable Skeletonhorse spawn egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Skeletonhorse!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        skeletonhorsespawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("skeletonhorsespawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.IRON_HELMET);
        Bukkit.getServer().addRecipe(sr);


    }
}
