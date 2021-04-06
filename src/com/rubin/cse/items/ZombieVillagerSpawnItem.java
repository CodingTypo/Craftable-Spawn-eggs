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

public class ZombieVillagerSpawnItem {

    public static ItemStack zombievillagerspawn;

    public static void init() {
        createZombieVillagerspawn();
    }

    private static void createZombieVillagerspawn() {
        ItemStack item = new ItemStack(Material.ZOMBIE_VILLAGER_SPAWN_EGG, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§3Spawn Zombie Villager");
        List<String> lore = new ArrayList<>();
        lore.add("§1Craftable Zombie Villager spawn egg");
        lore.add("§1this spawn egg summons:");
        lore.add("§1Zombie Villager!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        zombievillagerspawn = item;

        //Shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("zombievillagerspawn"), item);
        sr.shape("BBB", "BSB", "BBB");
        sr.setIngredient('B', Material.DIAMOND);
        sr.setIngredient('S', Material.GOLDEN_APPLE);
        Bukkit.getServer().addRecipe(sr);


    }
}