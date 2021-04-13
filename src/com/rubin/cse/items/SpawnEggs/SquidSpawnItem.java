package com.rubin.cse.items.SpawnEggs;

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

public class SquidSpawnItem {

    public static ItemStack squidspawn;

    public static void init() {
        createSquidspawn();
    }

    private static void createSquidspawn() {
        ItemStack item = new ItemStack(Material.SQUID_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8Squid");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable squid egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Squid!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        squidspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("squidspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.INK_SAC);
        Bukkit.getServer().addRecipe(sr);


    }
}