package com.rubin.cse.items.SpawnEggs;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class CreeperSpawnItem {

    public static ItemStack creeperspawn;

    public static void init() {
        createCreeperspawn();
    }

    private static void createCreeperspawn() {
        ItemStack item = new ItemStack(Material.CREEPER_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aCreeper");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable Creeper spawn egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Creeper!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        creeperspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("creeperspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.GUNPOWDER);
        Bukkit.getServer().addRecipe(sr);


    }
}