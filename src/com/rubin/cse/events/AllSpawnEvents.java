package com.rubin.cse.events;

import com.rubin.cse.items.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;

public class AllSpawnEvents implements Listener {

    @EventHandler
    public static void onRightClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getItem() != null) {
                return;
            }
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),BatSpawnItem.batspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new bat");
            }}
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),BeeSpawnItem.beespawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new bee!");
            }}
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),BlazeSpawnItem.blazespawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new blaze!");
            }}
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),CatSpawnItem.catspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Cat!");
            }}
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),CaveSpiderSpawnItem.cavespiderspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new CaveSpider!");
            }}
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),ChickenSpawnItem.chickenspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Chicken!");
            }}
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),CodSpawnItem.codspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new cod!");
            }}
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),CowSpawnItem.cowspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer ();
                    player.sendMessage ( "§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new cow!" );
            }}
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),CreeperSpawnItem.creeperspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new creeper!");
            }}
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),DolphinSpawnItem.dolphinspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new dolphin!");
            }}
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),DonkeySpawnItem.donkeyspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Donkey!");
            }}
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),DrownedSpawnItem.drownedspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new drowned!");
            }}
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),ElderGuardianSpawnItem.elder_guardianspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new elder_guardian!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),EndermanSpawnItem.endermanspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Enderman!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),EndermiteSpawnItem.endermitespawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Endermite!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),EvokerSpawnItem.evokerspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Evoker!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),FoxSpawnItem.foxspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new fox!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),GhastSpawnItem.ghastspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new ghast!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),GuardianSpawnItem.guardianspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new guardian!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),HoglinSpawnItem.hoglinspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new hoglin!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),HorseSpawnItem.horsespawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Horse!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),HuskSpawnItem.huskspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new husk!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),LlamaSpawnItem.llamaspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new llama!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),MagmaCubeSpawnItem.magmacubespawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new magma cube!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),MooshroomSpawnItem.mooshroomspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Mooshroom!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),MuleSpawnItem.mulespawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new mule");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),OcelotSpawnItems.ocelotspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new ocelot!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),PandaSpawnItem.pandaspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new panda!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),ParrotSpawnItem.parrotspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Parrot!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),PhantomSpawnItem.phantomspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Phantom!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),PiglinSpawnItem.piglinspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new piglin!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),PigSpawnItem.pigspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new pig!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),PillagerSpawnItem.pillagerspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Pillager!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),PolarbearSpawnItem.polarbearspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new polarbear!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),PufferfishSpawnItem.pufferfishspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Pufferfish!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),RabbitSpawnItem.rabbitspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new rabbit!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),RavagerSpawnItem.ravagerspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Ravager!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),SalmonSpawnItem.salmonspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Salmon!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),SheepSpawnItem.sheepspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Sheep!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),ShulkerSpawnItem.shulkerspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new shulker!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),SilverFishSpawnItem.silverfishspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new silverfish!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),SkeletonhorseSpawnItem.skeletonhorsespawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new skeletonhorse!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),SkeletonSpawnItem.skeletonspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new skeleton!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),SlimeSpawnItem.slimespawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new slime!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),SpiderSpawnItem.spiderspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new spider!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),SquidSpawnItem.squidspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Squid!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),StraySpawnItem.strayspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new stray!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),TropicalFishSpawnItem.tropicalfishspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new TropicalFish!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),TurtleSpawnItem.turtlespawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Turtle!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),VexSpawnItem.vexspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Vex!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),VillagerSpawnItem.villagerspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Villager!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),VindicatorSpawnItem.vindicatorspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Vindicator!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),WitchSpawnItem.witchspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new witch!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),WitherSkeletonSpawnItem.witherskeletonspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new witherskeleton!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),WolfSpawnItem.wolfspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new wolf!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),ZombiePigmanSpawnItem.zombiepigmanspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new Zombie Pigman!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),ZombieSpawnItem.zombiespawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new zombie!");
            }}
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Objects.equals ( event.getItem ().getItemMeta (),ZombieVillagerSpawnItem.zombievillagerspawn.getItemMeta () )){
                    event.setCancelled(false);
                    Player player = event.getPlayer();
                    player.sendMessage("§8[§a§lCraftable Spawn eggs§8] §2>> §bSpawned new zombie villager!");
            }
        }
    }
}
}