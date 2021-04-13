package com.rubin.cse.items.SpawnEggs;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class RabbitSpawnItem {

    public static ItemStack rabbitspawn;

    public static void init() {
        createRabbitspawn();
    }

    private static void createRabbitspawn() {
        ItemStack item = new ItemStack(Material.RABBIT_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fRabbit");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable Rabbit spawn egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Rabbit!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        rabbitspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("rabbitspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.RABBIT);
        Bukkit.getServer().addRecipe(sr);


    }
}