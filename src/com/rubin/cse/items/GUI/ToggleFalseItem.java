package com.rubin.cse.items.GUI;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ToggleFalseItem {
    public static ItemStack togglefalse;

    public static void init() {
        createtogglefalse();
    }

    private static void createtogglefalse() {
        ItemStack item = new ItemStack ( Material.RED_STAINED_GLASS_PANE,1);
        ItemMeta meta = item.getItemMeta ();
        meta.setDisplayName ( "§4Toggle False" );
        List<String> lore = new ArrayList<> ();
        lore.add ( "§cToggle The Spawn egg False" );
        meta.setLore ( lore );
        meta.addItemFlags ( ItemFlag.HIDE_ENCHANTS );
        meta.addItemFlags ( ItemFlag.HIDE_UNBREAKABLE );
        item.setItemMeta ( meta );
        togglefalse = item;
    }
}
