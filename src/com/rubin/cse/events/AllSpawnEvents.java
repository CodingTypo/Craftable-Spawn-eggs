package com.rubin.cse.events;

import com.rubin.cse.items.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class AllSpawnEvents implements Listener {

    @EventHandler
    public static void onRightClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getItem() != null) {
                return;
            }
            if (event.getItem().getItemMeta().equals( BatSpawnItem.batspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new bat");
            }else
                if (event.getItem().getItemMeta().equals( BeeSpawnItem.beespawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new bee!");
                }else
                if (event.getItem().getItemMeta().equals( BlazeSpawnItem.blazespawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new blaze!");
                }else
                if (event.getItem().getItemMeta().equals( CatSpawnItem.catspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Cat!");
                }else
                if (event.getItem().getItemMeta().equals( CaveSpiderSpawnItem.cavespiderspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new CaveSpider!");
                }else
                if (event.getItem().getItemMeta().equals( ChickenSpawnItem.chickenspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Chicken!");
                }else
                if (event.getItem().getItemMeta().equals( CodSpawnItem.codspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new cod!");
                }else
                if (event.getItem().getItemMeta().equals(CowSpawnItem.cowspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer ();
                    player.sendMessage ( "§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new cow!" );
                }else
                if (event.getItem().getItemMeta().equals(CreeperSpawnItem.creeperspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new creeper!");
                }else
                if (event.getItem().getItemMeta().equals(DolphinSpawnItem.dolphinspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new dolphin!");
                }else
                if (event.getItem().getItemMeta().equals(DonkeySpawnItem.donkeyspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Donkey!");
                }else
                if (event.getItem().getItemMeta().equals(DrownedSpawnItem.drownedspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new drowned!");
                }else
                if (event.getItem().getItemMeta().equals( ElderGuardianSpawnItem.elder_guardianspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new elder_guardian!");
                }else
                if (event.getItem().getItemMeta().equals(EndermanSpawnItem.endermanspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Enderman!");
                }else
                if (event.getItem().getItemMeta().equals(EndermiteSpawnItem.endermitespawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Endermite!");
                }else
                if (event.getItem().getItemMeta().equals(EvokerSpawnItem.evokerspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Evoker!");
                }else
                if (event.getItem().getItemMeta().equals(FoxSpawnItem.foxspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new fox!");
                }else
                if (event.getItem().getItemMeta().equals(GhastSpawnItem.ghastspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new ghast!");
                }else
                if (event.getItem().getItemMeta().equals(GuardianSpawnItem.guardianspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new guardian!");
                }else
                if (event.getItem().getItemMeta().equals(HoglinSpawnItem.hoglinspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new hoglin!");
                }else
                if (event.getItem().getItemMeta().equals(HorseSpawnItem.horsespawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Horse!");
                }else
                if (event.getItem().getItemMeta().equals(HuskSpawnItem.huskspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new husk!");
                }else
                if (event.getItem().getItemMeta().equals(LlamaSpawnItem.llamaspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new llama!");
                }else
                if (event.getItem().getItemMeta().equals(MagmaCubeSpawnItem.magmacubespawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new magma cube!");
                }else
                if (event.getItem().getItemMeta().equals(MooshroomSpawnItem.mooshroomspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Mooshroom!");
                }else
                if (event.getItem().getItemMeta().equals( MuleSpawnItem.mulespawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new mule");
                }else
                if (event.getItem().getItemMeta().equals( OcelotSpawnItems.ocelotspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new ocelot!");
                }else
                if (event.getItem().getItemMeta().equals(PandaSpawnItem.pandaspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new panda!");
                }else
                if (event.getItem().getItemMeta().equals(ParrotSpawnItem.parrotspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Parrot!");
                }else
                if (event.getItem().getItemMeta().equals(PhantomSpawnItem.phantomspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Phantom!");
                }else
                if (event.getItem().getItemMeta().equals(PiglinSpawnItem.piglinspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new piglin!");
                }else
                if (event.getItem().getItemMeta().equals(PigSpawnItem.pigspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new pig!");
                }else
                if (event.getItem().getItemMeta().equals(PillagerSpawnItem.pillagerspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Pillager!");
                }else
                if (event.getItem().getItemMeta().equals(PolarbearSpawnItem.polarbearspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new polarbear!");
                }else
                if (event.getItem().getItemMeta().equals(PufferfishSpawnItem.pufferfishspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Pufferfish!");
                }else
                if (event.getItem().getItemMeta().equals( RabbitSpawnItem.rabbitspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new rabbit!");
                }else
                if (event.getItem().getItemMeta().equals(RavagerSpawnItem.ravagerspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Ravager!");
                }else
                if (event.getItem().getItemMeta().equals( SalmonSpawnItem.salmonspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Salmon!");
                }else
                if (event.getItem().getItemMeta().equals(SheepSpawnItem.sheepspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Sheep!");
                }else
                if (event.getItem().getItemMeta().equals(ShulkerSpawnItem.shulkerspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new shulker!");
                }else
                if (event.getItem().getItemMeta().equals( SilverFishSpawnItem.silverfishspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new silverfish!");
                }else
                if (event.getItem().getItemMeta().equals(SkeletonhorseSpawnItem.skeletonhorsespawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new skeletonhorse!");
                }else
                if (event.getItem().getItemMeta().equals(SkeletonSpawnItem.skeletonspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new skeleton!");
                }else
                if (event.getItem().getItemMeta().equals(SlimeSpawnItem.slimespawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new slime!");
                }else
                if (event.getItem().getItemMeta().equals(SpiderSpawnItem.spiderspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new spider!");
                }else
                if (event.getItem().getItemMeta().equals(SquidSpawnItem.squidspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Squid!");
                }else
                if (event.getItem().getItemMeta().equals(StraySpawnItem.strayspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new stray!");
                }else
                if (event.getItem().getItemMeta().equals(TropicalFishSpawnItem.tropicalfishspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new TropicalFish!");
                }else
                if (event.getItem().getItemMeta().equals(TurtleSpawnItem.turtlespawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Turtle!");
                }else
                if (event.getItem().getItemMeta().equals(VexSpawnItem.vexspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Vex!");
                }else
                if (event.getItem().getItemMeta().equals(VillagerSpawnItem.villagerspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Villager!");
                }else
                if (event.getItem().getItemMeta().equals(VindicatorSpawnItem.vindicatorspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Vindicator!");
                }else
                if (event.getItem().getItemMeta().equals(WitchSpawnItem.witchspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new witch!");
                }else
                if (event.getItem().getItemMeta().equals(WitherSkeletonSpawnItem.witherskeletonspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new witherskeleton!");
                }else
                if (event.getItem().getItemMeta().equals(WolfSpawnItem.wolfspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new wolf!");
                }else
                if (event.getItem().getItemMeta().equals(ZombiePigmanSpawnItem.zombiepigmanspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Zombie Pigman!");
                }else
                if (event.getItem().getItemMeta().equals(ZombieSpawnItem.zombiespawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new zombie!");
                }else
                if (event.getItem().getItemMeta().equals(ZombieVillagerSpawnItem.zombievillagerspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new zombie villager!");
                }
        }
    }
}