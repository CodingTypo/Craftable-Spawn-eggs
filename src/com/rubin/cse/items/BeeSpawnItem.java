package com.rubin.cse.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class BeeSpawnItem {

    public static ItemStack beespawn;

    public static void init() {
        createBeespawn();
    }

    private static void createBeespawn() {
        ItemStack item = new ItemStack(Material.BEE_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§3Spawn Bee");
        List<String> lore = new ArrayList<>();
        lore.add("§1Craftable Bee spawn egg");
        lore.add("§1this spawn egg summons:");
        lore.add("§1Bee!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        beespawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("beespawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.POPPY);
        Bukkit.getServer().addRecipe(sr);


    }
}