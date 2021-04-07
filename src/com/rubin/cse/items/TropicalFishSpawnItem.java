package com.rubin.cse.items;

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

public class TropicalFishSpawnItem {

    public static ItemStack tropicalfishspawn;

    public static void init() {
        createTropicalFishspawn();
    }

    private static void createTropicalFishspawn() {
        ItemStack item = new ItemStack(Material.TROPICAL_FISH_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eTropicalFish");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable tropical fish egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Tropical Fish!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        tropicalfishspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("tropicalfishspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.TROPICAL_FISH);
        Bukkit.getServer().addRecipe(sr);


    }
}