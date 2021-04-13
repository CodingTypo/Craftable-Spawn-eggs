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

public class WitherSkeletonSpawnItem {

    public static ItemStack witherskeletonspawn;

    public static void init() {
        createWitherSkeletonspawn();
    }

    private static void createWitherSkeletonspawn() {
        ItemStack item = new ItemStack(Material.WITHER_SKELETON_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§0Wither Skeleton");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable Wither Skeleton spawn egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Wither Skeleton!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        witherskeletonspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("witherskeletonspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.WITHER_SKELETON_SKULL);
        Bukkit.getServer().addRecipe(sr);


    }
}