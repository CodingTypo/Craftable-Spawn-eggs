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

public class ZombiePigmanSpawnItem {

    public static ItemStack zombiepigmanspawn;

    public static void init() {
        createZombiePigmanspawn();
    }

    private static void createZombiePigmanspawn() {
        ItemStack item = new ItemStack(Material.ZOMBIFIED_PIGLIN_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§dZombified Piglin");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable zombie pigman egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Zombie Pigman!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        zombiepigmanspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("zombiepigmanspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.GOLDEN_SWORD);
        Bukkit.getServer().addRecipe(sr);


    }
}