package com.rubin.cse.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class OcelotSpawnItems {

    public static ItemStack ocelotspawn;

    public static void init() {
        createOcelotspawn();
    }

    private static void createOcelotspawn() {
        ItemStack item = new ItemStack(Material.OCELOT_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§3Spawn Ocelot");
        List<String> lore = new ArrayList<>();
        lore.add("§1Craftable Ocelot spawn egg");
        lore.add("§1this spawn egg summons:");
        lore.add("§1Ocelot!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        ocelotspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("ocelotspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.STRING);
        Bukkit.getServer().addRecipe(sr);


    }
}