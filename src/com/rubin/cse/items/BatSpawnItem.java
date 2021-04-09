package com.rubin.cse.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class BatSpawnItem {

    public static ItemStack batspawn;

    public static void init(){
        createBatspawn();
    }

    private static void createBatspawn() {
        ItemStack item = new ItemStack(Material.BAT_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§0Bat");
        List<String> lore = new ArrayList<>();
        lore.add("§8Craftable Bat spawn egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Bat!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        batspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("batspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.BLACK_DYE);
        Bukkit.getServer().addRecipe(sr);


    }
}