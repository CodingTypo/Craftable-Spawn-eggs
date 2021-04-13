package com.rubin.cse.items.SpawnEggs;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class HoglinSpawnItem {

    public static ItemStack hoglinspawn;

    public static void init() {
        createHoglinspawn();
    }

    private static void createHoglinspawn() {
        ItemStack item = new ItemStack(Material.HOGLIN_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§dHoglin");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable Hoglin spawn egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Hoglin!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        hoglinspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("hoglinspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.COOKED_PORKCHOP);
        Bukkit.getServer().addRecipe(sr);


    }
}