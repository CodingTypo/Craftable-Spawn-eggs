package com.rubin.cse.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class PreviousPageItem {
    public static ItemStack previouspage;

    public static void init() {
        createpreviouspage();
    }

    private static void createpreviouspage() {
        ItemStack item = new ItemStack ( Material.BLUE_STAINED_GLASS_PANE,1);
        ItemMeta meta = item.getItemMeta ();
        meta.setDisplayName ( "§bPrevious page" );
        List<String> lore = new ArrayList<> ();
        lore.add ( "§3Open the Previous page" );
        meta.setLore ( lore );
        meta.addItemFlags ( ItemFlag.HIDE_ENCHANTS );
        meta.addItemFlags ( ItemFlag.HIDE_UNBREAKABLE );
        item.setItemMeta ( meta );
        previouspage = item;
    }
}
