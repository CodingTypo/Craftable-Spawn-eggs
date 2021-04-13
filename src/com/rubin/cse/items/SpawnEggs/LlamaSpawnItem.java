package com.rubin.cse.items.SpawnEggs;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class LlamaSpawnItem {

    public static ItemStack llamaspawn;

    public static void init() {
        createLlamaspawn();
    }

    private static void createLlamaspawn() {
        ItemStack item = new ItemStack(Material.LLAMA_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fLlama");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable Llama spawn egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Llama!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        llamaspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("llamaspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.LEAD);
        Bukkit.getServer().addRecipe(sr);


    }
}