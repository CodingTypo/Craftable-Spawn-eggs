package com.rubin.cse.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ShulkerSpawnItem {

    public static ItemStack shulkerspawn;

    public static void init() {
        createShulkerspawn();
    }

    private static void createShulkerspawn() {
        ItemStack item = new ItemStack(Material.SHULKER_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§5Shulker");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable Shulker spawn egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Shulker!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        shulkerspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("shulkerspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.SHULKER_SHELL);
        Bukkit.getServer().addRecipe(sr);


    }
}