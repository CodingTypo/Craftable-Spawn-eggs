package com.rubin.cse.items.SpawnEggs;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ElderGuardianSpawnItem {

    public static ItemStack elder_guardianspawn;

    public static void init() {
        createElder_Guardianspawn();
    }

    private static void createElder_Guardianspawn() {
        ItemStack item = new ItemStack(Material.ELDER_GUARDIAN_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fElder_Guardian");
        List<String> lore = new ArrayList<>();
        lore.add("§7Craftable Elder_Guardian spawn egg");
        lore.add("§7this spawn egg summons:");
        lore.add("§7Elder_Guardian!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        elder_guardianspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("elder_guardianspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.PRISMARINE_CRYSTALS);
        Bukkit.getServer().addRecipe(sr);


    }
}