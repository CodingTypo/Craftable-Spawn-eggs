package com.rubin.cse.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class FoxSpawnItem {

    public static ItemStack foxspawn;

    public static void init() {
        createfoxspawn();
    }

    private static void createfoxspawn() {
        ItemStack item = new ItemStack(Material.FOX_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§3Spawn Fox");
        List<String> lore = new ArrayList<>();
        lore.add("§1Craftable fox spawn egg");
        lore.add("§1this spawn egg summons:");
        lore.add("§1Fox!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        foxspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("foxspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.SWEET_BERRIES);
        Bukkit.getServer().addRecipe(sr);


    }
}