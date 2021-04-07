package com.rubin.cse.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class WitchSpawnItem {

    public static ItemStack witchspawn;

    public static void init() {
        createWitchspawn();
    }

    private static void createWitchspawn() {
        ItemStack item = new ItemStack(Material.WITCH_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§5Witch");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable Witch spawn egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Witch!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        witchspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("witchspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.GLOWSTONE_DUST);
        Bukkit.getServer().addRecipe(sr);
    }
}