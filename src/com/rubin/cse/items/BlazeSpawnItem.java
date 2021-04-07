package com.rubin.cse.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class BlazeSpawnItem {

    public static ItemStack blazespawn;

    public static void init() {
        createBlazespawn();
    }

    private static void createBlazespawn() {
        ItemStack item = new ItemStack(Material.BLAZE_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Blaze");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable Blaze spawn egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Blaze!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        blazespawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("blazespawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.BLAZE_ROD);
        Bukkit.getServer().addRecipe(sr);
    }
}