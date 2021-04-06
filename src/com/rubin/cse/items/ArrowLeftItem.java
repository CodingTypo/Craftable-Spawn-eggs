package com.rubin.cse.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ArrowLeftItem {
    public static ItemStack arrowleft;

    public static void init() {
        createArrowleft();
    }

    private static void createArrowleft() {
        ItemStack item = new ItemStack ( Material.LIME_STAINED_GLASS_PANE,1);
        ItemMeta meta = item.getItemMeta ();
        meta.setDisplayName ( "§3Previous page" );
        List<String> lore = new ArrayList<> ();
        lore.add ( "§1Open the previous page" );
        meta.setLore ( lore );
        meta.addItemFlags ( ItemFlag.HIDE_ENCHANTS );
        meta.addItemFlags ( ItemFlag.HIDE_UNBREAKABLE );
        item.setItemMeta ( meta );
        arrowleft = item;
    }
}
