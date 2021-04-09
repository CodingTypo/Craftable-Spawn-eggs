package com.rubin.cse.GUI;

import com.rubin.cse.items.ArrowLeftItem;
import com.rubin.cse.items.ArrowRightItem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CseGiveGUI3 implements InventoryHolder {
    private Inventory inv;

    public CseGiveGUI3() {
        inv = Bukkit.createInventory(this, 36, "CseGive");//54 max size
        init();
    }

    private void init()  {
        ItemStack item;

        // left
        for (int i = 0; i < 3; i++) {
            item = CreateItem("§7§l/csegive", Material.GRAY_STAINED_GLASS_PANE, Collections.singletonList("§7Make a Choice"));
            inv.setItem(i, item);
        }
        //center
        List<String> lore = new ArrayList<> ();
        lore.add("§4Exit ths menu");
        item = CreateItem("§4Exit", Material.BARRIER, lore);
        inv.setItem(4, item);

        // right
        for (int i = 6; i < 9; i++) {
            item = CreateItem("§7§l/csegive", Material.GRAY_STAINED_GLASS_PANE, Collections.singletonList("§7Make a Choice"));
            inv.setItem(i, item);
        }

        //next,previous page
        {item = ( ArrowLeftItem.arrowleft);
            inv.setItem(3, item); }

        {item = ( ArrowRightItem.arrowright);
            inv.setItem(5, item); }

        // spawn eggs
        for (int i = 9; i <9; i++);{
            item = CreateItem("§7§lBlaze Spawn Egg",Material.BLAZE_SPAWN_EGG, Collections.singletonList("§7give yourself a Blaze_spawn_egg"));
            inv.setItem(9, item);
        }
    }
    private  ItemStack CreateItem(String name,Material mat,List<String> lore) {
        ItemStack item = new ItemStack(mat, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    @Override
    public Inventory getInventory() {
        return inv;
    }

}
