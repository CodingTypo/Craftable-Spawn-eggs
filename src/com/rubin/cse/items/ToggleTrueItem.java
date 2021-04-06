package com.rubin.cse.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ToggleTrueItem {
    public static ItemStack toggletrue;

    public static void init() {
        createtoggletrue();
    }

    private static void createtoggletrue() {
        ItemStack item = new ItemStack ( Material.LIME_STAINED_GLASS_PANE,1);
        ItemMeta meta = item.getItemMeta ();
        meta.setDisplayName ( "§2Toggle True" );
        List<String> lore = new ArrayList<> ();
        lore.add ( "§aToggle The Spawn egg True" );
        meta.setLore ( lore );
        meta.addItemFlags ( ItemFlag.HIDE_ENCHANTS );
        meta.addItemFlags ( ItemFlag.HIDE_UNBREAKABLE );
        item.setItemMeta ( meta );
        toggletrue = item;
    }
}
