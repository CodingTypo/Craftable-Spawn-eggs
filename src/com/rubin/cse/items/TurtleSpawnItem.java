package com.rubin.cse.items;

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

public class TurtleSpawnItem {

    public static ItemStack turtlespawn;

    public static void init() {
        createTurtlespawn();
    }

    private static void createTurtlespawn() {
        ItemStack item = new ItemStack(Material.TURTLE_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§3spawn Turtle");
        List<String> lore = new ArrayList<>();
        lore.add("§1Craftable turtle egg");
        lore.add("§1this spawn egg summons:");
        lore.add("§1Turtle!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        turtlespawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("turtlespawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.SCUTE);
        Bukkit.getServer().addRecipe(sr);


    }
}