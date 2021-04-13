package com.rubin.cse.items.SpawnEggs;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class GuardianSpawnItem {

    public static ItemStack guardianspawn;

    public static void init() {
        createGuardianspawn();
    }

    private static void createGuardianspawn() {
        ItemStack item = new ItemStack(Material.GUARDIAN_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§3Guardian");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable Guardian spawn egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Guardian!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        guardianspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("guardianspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.PRISMARINE_SHARD);
        Bukkit.getServer().addRecipe(sr);


    }
}