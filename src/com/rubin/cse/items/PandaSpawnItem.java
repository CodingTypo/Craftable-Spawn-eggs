package com.rubin.cse.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class PandaSpawnItem {

    public static ItemStack pandaspawn;

    public static void init() {
        createPandaspawn();
    }

    private static void createPandaspawn() {
        ItemStack item = new ItemStack(Material.PANDA_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§3Spawn Panda");
        List<String> lore = new ArrayList<>();
        lore.add("§1Craftable Panda spawn egg");
        lore.add("§1this spawn egg summons:");
        lore.add("§1Panda!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        pandaspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("pandaspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.BAMBOO);
        Bukkit.getServer().addRecipe(sr);


    }
}