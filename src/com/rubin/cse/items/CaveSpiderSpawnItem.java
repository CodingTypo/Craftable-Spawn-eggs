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

public class CaveSpiderSpawnItem {

    public static ItemStack cavespiderspawn;

    public static void init() {
        createCaveSpiderspawn();
    }

    private static void createCaveSpiderspawn() {
        ItemStack item = new ItemStack(Material.CAVE_SPIDER_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§3spawn Cave Spider");
        List<String> lore = new ArrayList<>();
        lore.add("§1Craftable cave spider egg");
        lore.add("§1this spawn egg summons:");
        lore.add("§1Cave Spider!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        cavespiderspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("cavespiderspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.COBWEB);
        Bukkit.getServer().addRecipe(sr);


    }
}