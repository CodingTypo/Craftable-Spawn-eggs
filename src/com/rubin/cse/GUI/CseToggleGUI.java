package com.rubin.cse.GUI;

import com.rubin.cse.CseMain;
import com.rubin.cse.items.*;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CseToggleGUI implements InventoryHolder {



    private  Inventory inv;

    public CseToggleGUI() {
        inv = Bukkit.createInventory(this, 45, "CseToggle");//54 max size
        init();
    }



    private void init()  {
        ItemStack item;

        //layout bar
        {item = CreateItem("§7§l/csetoggle", Material.GRAY_STAINED_GLASS_PANE, Collections.singletonList("§7Toggle recipe's true or false"));
        inv.setItem(0, item); }

        {item = CreateItem("§7§l/csetoggle", Material.GRAY_STAINED_GLASS_PANE, Collections.singletonList("§7Toggle recipe's true or false"));
            inv.setItem(36, item); }

            //layout bar #2
        {item = CreateItem("§7§lSpawn Egg:", Material.BLACK_STAINED_GLASS_PANE, Collections.singletonList("§7Spawn Egg which you can toggle"));
            inv.setItem(1, item); }

        {item = CreateItem("§7§lSpawn Egg:", Material.BLACK_STAINED_GLASS_PANE, Collections.singletonList("§7Spawn Egg which you can toggle"));
            inv.setItem(10, item); }

        {item = CreateItem("§7§lSpawn Egg:", Material.BLACK_STAINED_GLASS_PANE, Collections.singletonList("§7Spawn Egg which you can toggle"));
            inv.setItem(19, item); }

        {item = CreateItem("§7§lSpawn Egg:", Material.BLACK_STAINED_GLASS_PANE, Collections.singletonList("§7Spawn Egg which you can toggle"));
            inv.setItem(28, item); }

        {item = CreateItem("§7§lSpawn Egg:", Material.BLACK_STAINED_GLASS_PANE, Collections.singletonList("§7Spawn Egg which you can toggle"));
            inv.setItem(37, item); }

            //layout bar #3
        {item = CreateItem("§7§lToggle:", Material.BLACK_STAINED_GLASS_PANE, Collections.singletonList("§7Toggle the Spawn Egg true or false"));
            inv.setItem(3, item); }

        {item = CreateItem("§7§lToggle:", Material.BLACK_STAINED_GLASS_PANE, Collections.singletonList("§7Toggle the Spawn Egg true or false"));
            inv.setItem(12, item); }

        {item = CreateItem("§7§lToggle:", Material.BLACK_STAINED_GLASS_PANE, Collections.singletonList("§7Toggle the Spawn Egg true or false"));
            inv.setItem(21, item); }

        {item = CreateItem("§7§lToggle:", Material.BLACK_STAINED_GLASS_PANE, Collections.singletonList("§7Toggle the Spawn Egg true or false"));
            inv.setItem(30, item); }

        {item = CreateItem("§7§lToggle:", Material.BLACK_STAINED_GLASS_PANE, Collections.singletonList("§7Toggle the Spawn Egg true or false"));
            inv.setItem(39, item); }

            //spawn eggs
        {item = (BatSpawnItem.batspawn);
            inv.setItem(2, item); }

        {item = (BeeSpawnItem.beespawn);
            inv.setItem(11, item); }

        {item = (ChickenSpawnItem.chickenspawn);
            inv.setItem(20, item); }

        {item = (CatSpawnItem.catspawn);
            inv.setItem(29, item); }

        {item = (CaveSpiderSpawnItem.cavespiderspawn);
            inv.setItem(38, item); }

            //Toggle true
        {item = (ToggleTrueItem.toggletrue);
            inv.setItem(4, item); }

        {item = (ToggleTrueItem.toggletrue);
            inv.setItem(13, item); }

        {item = (ToggleTrueItem.toggletrue);
            inv.setItem(22, item); }

        {item = (ToggleTrueItem.toggletrue);
            inv.setItem(31, item); }

        {item = (ToggleTrueItem.toggletrue);
            inv.setItem(40, item); }

            //Toggle false
        {item = (ToggleFalseItem.togglefalse);
            inv.setItem(5, item); }

        {item = (ToggleFalseItem.togglefalse);
            inv.setItem(14, item); }

        {item = (ToggleFalseItem.togglefalse);
            inv.setItem(23, item); }

        {item = (ToggleFalseItem.togglefalse);
            inv.setItem(32, item); }

        {item = (ToggleFalseItem.togglefalse);
            inv.setItem(41, item); }

            //layout bar #4
        {item = CreateItem("§7§lCurrent State:", Material.BLACK_STAINED_GLASS_PANE, Collections.singletonList("§7The Current state of the Spawn Egg:"));
            inv.setItem(6, item); }

        {item = CreateItem("§7§lCurrent State:", Material.BLACK_STAINED_GLASS_PANE, Collections.singletonList("§7The Current state of the Spawn Egg:"));
            inv.setItem(15, item); }

        {item = CreateItem("§7§lCurrent State:", Material.BLACK_STAINED_GLASS_PANE, Collections.singletonList("§7The Current state of the Spawn Egg:"));
            inv.setItem(24, item); }

        {item = CreateItem("§7§lCurrent State:", Material.BLACK_STAINED_GLASS_PANE, Collections.singletonList("§7The Current state of the Spawn Egg:"));
            inv.setItem(33, item); }

        {item = CreateItem("§7§lCurrent State:", Material.BLACK_STAINED_GLASS_PANE, Collections.singletonList("§7The Current state of the Spawn Egg:"));
            inv.setItem(42, item); }

            //layout bar #5
        {item = CreateItem("§7§l/csetoggle", Material.GRAY_STAINED_GLASS_PANE, Collections.singletonList("§7toggle recipe's true or false"));
            inv.setItem(8, item); }

        {item = CreateItem("§7§l/csetoggle", Material.GRAY_STAINED_GLASS_PANE, Collections.singletonList("§7toggle recipe's true or false"));
            inv.setItem(17, item); }

        {item = CreateItem("§7§l/csetoggle", Material.GRAY_STAINED_GLASS_PANE, Collections.singletonList("§7toggle recipe's true or false"));
            inv.setItem(26, item); }

        {item = CreateItem("§7§l/csetoggle", Material.GRAY_STAINED_GLASS_PANE, Collections.singletonList("§7toggle recipe's true or false"));
            inv.setItem(35, item); }

        {item = CreateItem("§7§l/csetoggle", Material.GRAY_STAINED_GLASS_PANE, Collections.singletonList("§7toggle recipe's true or false"));
            inv.setItem(44, item); }


        //center layout bar
        List<String> lore = new ArrayList<>();
        lore.add("§4Exit ths menu");
        item = CreateItem("§4Exit", Material.BARRIER, lore);
        inv.setItem(18, item);

        //next,previous page
        {item = (PreviousPageItem.previouspage);
            inv.setItem(9, item); }

        {item = (NextPageItem.nextpage);
            inv.setItem(27, item); }

    }
    private  ItemStack CreateItem(String name, Material mat, List<String> lore) {
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