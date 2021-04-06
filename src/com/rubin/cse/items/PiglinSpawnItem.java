package com.rubin.cse.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class PiglinSpawnItem {

    public static ItemStack piglinspawn;

    public static void init() {
        createPiglinspawn();
    }

    private static void createPiglinspawn() {
        ItemStack item = new ItemStack(Material.PIGLIN_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§3Spawn Piglin");
        List<String> lore = new ArrayList<>();
        lore.add("§1Craftable Piglin spawn egg");
        lore.add("§1this spawn egg summons:");
        lore.add("§1Piglin!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        piglinspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("piglinspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.GOLD_NUGGET);
        Bukkit.getServer().addRecipe(sr);


    }
}