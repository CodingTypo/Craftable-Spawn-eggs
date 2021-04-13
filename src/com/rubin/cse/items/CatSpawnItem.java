package com.rubin.cse.items;

import com.rubin.cse.CseMain;
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

public class CatSpawnItem {

    private static CseMain plugin;


    public CatSpawnItem(CseMain instance){
        plugin = instance;
    }

    public static ItemStack catspawn;

    public static void init() {
        createCatspawn();
    }

    private static void createCatspawn() {
        ItemStack item = new ItemStack(Material.CAT_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fCat");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable cat egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Cat!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        catspawn = item;

        //Shaped recipe
        if (plugin.getConfig().getBoolean("enabled_spawn_eggs.cat.enabled")) {
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("catspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.RED_BED);
        Bukkit.getServer().addRecipe(sr);}


    }
}