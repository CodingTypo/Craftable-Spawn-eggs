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
                if (event.getItem().getItemMeta().equals( BatSpawnItem.batspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new bat");
                }
                if (event.getItem().getItemMeta().equals( BeeSpawnItem.beespawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new bee!");
                }
                if (event.getItem().getItemMeta().equals( BlazeSpawnItem.blazespawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new blaze!");
                }
                if (event.getItem().getItemMeta().equals( CatSpawnItem.catspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Cat!");
                }
                if (event.getItem().getItemMeta().equals( CaveSpiderSpawnItem.cavespiderspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new CaveSpider!");
                }
                if (event.getItem().getItemMeta().equals( ChickenSpawnItem.chickenspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Chicken!");
                }
                if (event.getItem().getItemMeta().equals( CodSpawnItem.codspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new cod!");
                }
                if (event.getItem().getItemMeta().equals(CowSpawnItem.cowspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer ();
                    player.sendMessage ( "§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new cow!" );
                }
                if (event.getItem().getItemMeta().equals(CreeperSpawnItem.creeperspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new creeper!");
                }
                if (event.getItem().getItemMeta().equals(DolphinSpawnItem.dolphinspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new dolphin!");
                }
                if (event.getItem().getItemMeta().equals(DonkeySpawnItem.donkeyspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Donkey!");
                }
                if (event.getItem().getItemMeta().equals(DrownedSpawnItem.drownedspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new drowned!");
                }
                if (event.getItem().getItemMeta().equals( ElderGuardianSpawnItem.elder_guardianspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new elder_guardian!");
                }
                if (event.getItem().getItemMeta().equals(EndermanSpawnItem.endermanspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Enderman!");
                }
                if (event.getItem().getItemMeta().equals(EndermiteSpawnItem.endermitespawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Endermite!");
                }
                if (event.getItem().getItemMeta().equals(EvokerSpawnItem.evokerspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Evoker!");
                }
                if (event.getItem().getItemMeta().equals(FoxSpawnItem.foxspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new fox!");
                }
                if (event.getItem().getItemMeta().equals(GhastSpawnItem.ghastspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new ghast!");
                }
                if (event.getItem().getItemMeta().equals(GuardianSpawnItem.guardianspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new guardian!");
                }
                if (event.getItem().getItemMeta().equals(HoglinSpawnItem.hoglinspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new hoglin!");
                }
                if (event.getItem().getItemMeta().equals(HorseSpawnItem.horsespawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Horse!");
                }
                if (event.getItem().getItemMeta().equals(HuskSpawnItem.huskspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new husk!");
                }
                if (event.getItem().getItemMeta().equals(LlamaSpawnItem.llamaspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new llama!");
                }
                if (event.getItem().getItemMeta().equals(MagmaCubeSpawnItem.magmacubespawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new magma cube!");
                }
                if (event.getItem().getItemMeta().equals(MooshroomSpawnItem.mooshroomspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Mooshroom!");
                }
                if (event.getItem().getItemMeta().equals( MuleSpawnItem.mulespawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new mule");
                }
                if (event.getItem().getItemMeta().equals( OcelotSpawnItems.ocelotspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new ocelot!");
                }
                if (event.getItem().getItemMeta().equals(PandaSpawnItem.pandaspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new panda!");
                }
                if (event.getItem().getItemMeta().equals(ParrotSpawnItem.parrotspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Parrot!");
                }
                if (event.getItem().getItemMeta().equals(PhantomSpawnItem.phantomspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Phantom!");
                }
                if (event.getItem().getItemMeta().equals(PiglinSpawnItem.piglinspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new piglin!");
                }
                if (event.getItem().getItemMeta().equals(PigSpawnItem.pigspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new pig!");
                }
                if (event.getItem().getItemMeta().equals(PillagerSpawnItem.pillagerspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Pillager!");
                }
                if (event.getItem().getItemMeta().equals(PolarbearSpawnItem.polarbearspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new polarbear!");
                }
                if (event.getItem().getItemMeta().equals(PufferfishSpawnItem.pufferfishspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Pufferfish!");
                }
                if (event.getItem().getItemMeta().equals( RabbitSpawnItem.rabbitspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new rabbit!");
                }
                if (event.getItem().getItemMeta().equals(RavagerSpawnItem.ravagerspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Ravager!");
                }
                if (event.getItem().getItemMeta().equals( SalmonSpawnItem.salmonspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Salmon!");
                }
                if (event.getItem().getItemMeta().equals(SheepSpawnItem.sheepspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Sheep!");
                }
                if (event.getItem().getItemMeta().equals(ShulkerSpawnItem.shulkerspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new shulker!");
                }
                if (event.getItem().getItemMeta().equals( SilverFishSpawnItem.silverfishspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new silverfish!");
                }
                if (event.getItem().getItemMeta().equals(SkeletonhorseSpawnItem.skeletonhorsespawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new skeletonhorse!");
                }
                if (event.getItem().getItemMeta().equals(SkeletonSpawnItem.skeletonspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new skeleton!");
                }
                if (event.getItem().getItemMeta().equals(SlimeSpawnItem.slimespawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new slime!");
                }
                if (event.getItem().getItemMeta().equals(SpiderSpawnItem.spiderspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new spider!");
                }
                if (event.getItem().getItemMeta().equals(SquidSpawnItem.squidspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Squid!");
                }
                if (event.getItem().getItemMeta().equals(StraySpawnItem.strayspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new stray!");
                }
                if (event.getItem().getItemMeta().equals(TropicalFishSpawnItem.tropicalfishspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new TropicalFish!");
                }
                if (event.getItem().getItemMeta().equals(TurtleSpawnItem.turtlespawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Turtle!");
                }
                if (event.getItem().getItemMeta().equals(VexSpawnItem.vexspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Vex!");
                }
                if (event.getItem().getItemMeta().equals(VillagerSpawnItem.villagerspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Villager!");
                }
                if (event.getItem().getItemMeta().equals(VindicatorSpawnItem.vindicatorspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Vindicator!");
                }
                if (event.getItem().getItemMeta().equals(WitchSpawnItem.witchspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new witch!");
                }
                if (event.getItem().getItemMeta().equals(WitherSkeletonSpawnItem.witherskeletonspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new witherskeleton!");
                }
                if (event.getItem().getItemMeta().equals(WolfSpawnItem.wolfspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new wolf!");
                }
                if (event.getItem().getItemMeta().equals(ZombiePigmanSpawnItem.zombiepigmanspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Zombie Pigman!");
                }
                if (event.getItem().getItemMeta().equals(ZombieSpawnItem.zombiespawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new zombie!");
                }
                if (event.getItem().getItemMeta().equals(ZombieVillagerSpawnItem.zombievillagerspawn.getItemMeta())){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new zombie villager!");
                }
            }
        }
    }
}
