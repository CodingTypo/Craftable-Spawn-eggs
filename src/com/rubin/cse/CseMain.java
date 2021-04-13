package com.rubin.cse;

import com.rubin.cse.GUI.CseToggleGUI;
import com.rubin.cse.commands.*;
import com.rubin.cse.events.*;
import com.rubin.cse.events.GUIevents.CseToggleGUIEvents;
import com.rubin.cse.events.GUIevents.GUIEvents;
import com.rubin.cse.events.GUIevents.GUIEvents2;
import com.rubin.cse.events.GUIevents.GUIEvents3;
import com.rubin.cse.items.*;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public class CseMain extends JavaPlugin implements Listener {

    public BatSpawnItem BatSpawnItem = new BatSpawnItem(this);
    public BeeSpawnItem BeeSpawnItem = new BeeSpawnItem(this);
    public ChickenSpawnItem ChickenSpawnItem = new ChickenSpawnItem(this);
    public CatSpawnItem CatSpawnItem = new CatSpawnItem(this);
    public CaveSpiderSpawnItem CaveSpiderSpawnItem = new CaveSpiderSpawnItem(this);
    public CseToggleGUI CseToggleGUI = new CseToggleGUI(this);

    @Override
    public void onEnable() {
        getServer ().getConsoleSender ().sendMessage ("§b§8[§a§lCraftable Spawn eggs§8] §2>> plugin is enabled!" );
        getCommand ( "csegive" ).setExecutor ( new CseGiveCommand (this) );
        getCommand ( "csetoggle" ).setExecutor ( new CseToggleCommand (this) );
        getCommand ( "csereload" ).setExecutor ( new CseReloadCommand (this) );
        loadconfig();
        SheepSpawnItem.init ();
        CowSpawnItem.init ();
        PigSpawnItem.init ();
        FoxSpawnItem.init ();
        BatSpawnItem.init ();
        ChickenSpawnItem.init ();
        CodSpawnItem.init ();
        OcelotSpawnItems.init ();
        RabbitSpawnItem.init ();
        SalmonSpawnItem.init ();
        MuleSpawnItem.init ();
        SkeletonhorseSpawnItem.init ();
        DolphinSpawnItem.init ();
        PolarbearSpawnItem.init ();
        LlamaSpawnItem.init ();
        PandaSpawnItem.init ();
        MooshroomSpawnItem.init ();
        SquidSpawnItem.init ();
        TropicalFishSpawnItem.init ();
        TurtleSpawnItem.init ();
        VillagerSpawnItem.init ();
        PufferfishSpawnItem.init ();
        DonkeySpawnItem.init ();
        HorseSpawnItem.init ();
        CatSpawnItem.init ();
        ParrotSpawnItem.init ();
        WolfSpawnItem.init ();
        ArrowLeftItem.init ();
        ArrowRightItem.init ();
        BeeSpawnItem.init ();
        SpiderSpawnItem.init ();
        GuardianSpawnItem.init ();
        ElderGuardianSpawnItem.init ();
        ShulkerSpawnItem.init ();
        HuskSpawnItem.init ();
        StraySpawnItem.init ();
        CaveSpiderSpawnItem.init ();
        EndermanSpawnItem.init ();
        ZombiePigmanSpawnItem.init ();
        PhantomSpawnItem.init ();
        EvokerSpawnItem.init ();
        VindicatorSpawnItem.init ();
        PillagerSpawnItem.init ();
        RavagerSpawnItem.init ();
        VexSpawnItem.init ();
        EndermiteSpawnItem.init ();
        ZombieVillagerSpawnItem.init ();
        ZombieSpawnItem.init ();
        WitherSkeletonSpawnItem.init ();
        SlimeSpawnItem.init ();
        SkeletonSpawnItem.init ();
        DrownedSpawnItem.init ();
        WitchSpawnItem.init ();
        HoglinSpawnItem.init ();
        PiglinSpawnItem.init ();
        ToggleTrueItem.init ();
        ToggleFalseItem.init ();
        NextPageItem.init ();
        PreviousPageItem.init ();
        CreeperSpawnItem.init();
        BlazeSpawnItem.init();
        getServer ().getPluginManager ().registerEvents ( new AllSpawnEvents (),this );
        getServer ().getPluginManager ().registerEvents ( new GUIEvents (),this );
        getServer ().getPluginManager ().registerEvents ( new GUIEvents2 (),this );
        getServer ().getPluginManager ().registerEvents ( new GUIEvents3(),this );
        getServer ().getPluginManager ().registerEvents ( new CseToggleGUIEvents(this),this );
        getServer ().getPluginManager ().registerEvents ( this,this );
    }

    @Override
    public void onDisable() {
        getServer ().getConsoleSender ().sendMessage ("§b§8[§a§lCraftable Spawn eggs§8] §c>> plugin is disabled!" );
    }


    //config load fuction
    public void loadconfig(){

        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
        this.reloadConfig();


    }
    }


