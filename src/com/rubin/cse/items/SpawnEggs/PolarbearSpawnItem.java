package com.rubin.cse.items.SpawnEggs;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class PolarbearSpawnItem {

    public static ItemStack polarbearspawn;

    public static void init() {
        createPolarbearspawn();
    }

    private static void createPolarbearspawn() {
        ItemStack item = new ItemStack(Material.POLAR_BEAR_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fPolarbear");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable Polarbear spawn egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Polarbear!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        polarbearspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("polarbearspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.SNOWBALL);
        Bukkit.getServer().addRecipe(sr);


    }
}