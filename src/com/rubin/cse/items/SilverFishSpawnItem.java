package com.rubin.cse.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class SilverFishSpawnItem {

    public static ItemStack silverfishspawn;

    public static void init() {
        createSilverfishspawn();
    }

    private static void createSilverfishspawn() {
        ItemStack item = new ItemStack(Material.SILVERFISH_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8Silverfish");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable Silverfish spawn egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Silverfish!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        silverfishspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("silverfishspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.LIGHT_GRAY_DYE);
        Bukkit.getServer().addRecipe(sr);


    }
}