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

public class EndermanSpawnItem {

    public static ItemStack endermanspawn;

    public static void init() {
        createEndermanspawn();
    }

    private static void createEndermanspawn() {
        ItemStack item = new ItemStack(Material.ENDERMAN_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§0Enderman");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable enderman egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Enderman!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        endermanspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("endermanspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.ENDER_PEARL);
        Bukkit.getServer().addRecipe(sr);


    }
}