package com.rubin.cse.items.GUI;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ArrowRightItem {
    public static ItemStack arrowright;

    public static void init() {
        createArrowright();
    }

    private static void createArrowright() {
        ItemStack item = new ItemStack ( Material.LIME_STAINED_GLASS_PANE,1);
        ItemMeta meta = item.getItemMeta ();
        meta.setDisplayName ( "§3Next page" );
        List<String> lore = new ArrayList<> ();
        lore.add ( "§1Open the next page" );
        meta.setLore ( lore );
        meta.addItemFlags ( ItemFlag.HIDE_ENCHANTS );
        meta.addItemFlags ( ItemFlag.HIDE_UNBREAKABLE );
        item.setItemMeta ( meta );
        arrowright = item;
    }
}
