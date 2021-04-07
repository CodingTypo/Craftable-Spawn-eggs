package com.rubin.cse.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class MagmaCubeSpawnItem {

    public static ItemStack magmacubespawn;

    public static void init() {
        createMagmacubespawn();
    }

    private static void createMagmacubespawn() {
        ItemStack item = new ItemStack(Material.MAGMA_CUBE_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Magmacube");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable Magmacube spawn egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Magmacube!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        magmacubespawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("magmacubespawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.MAGMA_CREAM);
        Bukkit.getServer().addRecipe(sr);


    }
}