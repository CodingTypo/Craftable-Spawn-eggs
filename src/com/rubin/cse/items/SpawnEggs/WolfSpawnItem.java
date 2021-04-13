package com.rubin.cse.items.SpawnEggs;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class WolfSpawnItem {

    public static ItemStack wolfspawn;

    public static void init() {
        createWolfspawn();
    }

    private static void createWolfspawn() {
        ItemStack item = new ItemStack(Material.WOLF_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fWolf");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable Wolf spawn egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Wolf!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        wolfspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("wolfspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.BONE_MEAL);
        Bukkit.getServer().addRecipe(sr);


    }
}