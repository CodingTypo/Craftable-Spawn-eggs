package com.rubin.cse.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class NextPageItem {
    public static ItemStack nextpage;

    public static void init() {
        createnextpage();
    }

    private static void createnextpage() {
        ItemStack item = new ItemStack ( Material.BLUE_STAINED_GLASS_PANE,1);
        ItemMeta meta = item.getItemMeta ();
        meta.setDisplayName ( "§bNext page" );
        List<String> lore = new ArrayList<> ();
        lore.add ( "§3Open the Next page" );
        meta.setLore ( lore );
        meta.addItemFlags ( ItemFlag.HIDE_ENCHANTS );
        meta.addItemFlags ( ItemFlag.HIDE_UNBREAKABLE );
        item.setItemMeta ( meta );
        nextpage = item;
    }
}
