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
        getServer ().getPluginManager ().registerEvents ( new AllSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new CowSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new SheepSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new PigSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new FoxSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new BatSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new ChickenSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new CodSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new OcelotSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new RabbitSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new SalmonSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new MuleSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new SkeletonhorseSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new DolphinSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new PolarbearSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new LlamaSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new PandaSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new MooshroomSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new SquidSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new TropicalFishSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new TurtleSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new VillagerSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new PufferfishpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new DonkeySpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new HorseSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new CatSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new ParrotSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new WolfSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new BeeSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new SpiderSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new GuardianSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new ElderGuardianSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new ShulkerSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new HuskSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new StraySpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new CaveSpiderSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new EndermanSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new ZombiePigmanSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new PhantomSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new EvokerSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new VindicatorSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new PillagerSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new RavagerSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new VexSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new EndermiteSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new ZombieVillagerSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new ZombieSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new WitherSkeletonSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new SlimeSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new SkeletonSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new DrownedSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new WitchSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new HoglinSpawnEvents (),this );
        //getServer ().getPluginManager ().registerEvents ( new PiglinSpawnEvents (),this );
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


