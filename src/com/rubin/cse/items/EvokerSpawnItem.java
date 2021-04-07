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

public class EvokerSpawnItem {

    public static ItemStack evokerspawn;

    public static void init() {
        createEvokerspawn();
    }

    private static void createEvokerspawn() {
        ItemStack item = new ItemStack(Material.EVOKER_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§7Evoker");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable evoker egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Evoker!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        evokerspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("evokerspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.TOTEM_OF_UNDYING);
        Bukkit.getServer().addRecipe(sr);


    }
}