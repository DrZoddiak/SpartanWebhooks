package net.ecoporium.spartan.model.violation

import net.ecoporium.spartan.api.config.generic.key.ConfigKey
import net.ecoporium.spartan.config.SpartanConfigKeys

enum class Violation(val fancyName: String, val key: ConfigKey<Boolean>) {

    EXPLOITS("Exploits", SpartanConfigKeys.exploits),
    ENTITY_MOVE("EntityMove", SpartanConfigKeys.entityMove),
    NO_SWING("NoSwing", SpartanConfigKeys.noSwing),
    IRREGULAR_MOVEMENTS("IrregularMovements", SpartanConfigKeys.irregularMovements),
    CLIP("Clip", SpartanConfigKeys.clip),
    IMPOSSIBLE_ACTIONS("ImpossibleActions", SpartanConfigKeys.impossibleActions),
    ITEM_DROPS("ItemDrops", SpartanConfigKeys.itemDrops),
    AUTO_RESPAWN("AutoRespawn", SpartanConfigKeys.autoRespawn),
    INVENTORY_CLICKS("InventoryClicks", SpartanConfigKeys.inventoryClicks),
    SPRINT("Sprint", SpartanConfigKeys.sprint),
    JESUS("Jesus", SpartanConfigKeys.jesus),
    NO_SLOWDOWN("NoSlowdown", SpartanConfigKeys.noSlowdown),
    CRITICALS("Criticals", SpartanConfigKeys.criticals),
    GHOST_HAND("GhostHand", SpartanConfigKeys.ghostHand),
    BLOCK_REACH("BlockReach", SpartanConfigKeys.blockReach),
    ELYTRA_MOVE("ElytraMove", SpartanConfigKeys.elytraMove),
    FAST_BOW("FastBow", SpartanConfigKeys.fastBow),
    FAST_CLICKS("FastClicks", SpartanConfigKeys.fastClicks),
    FAST_HEAL("FastHeal", SpartanConfigKeys.fastHeal),
    IMPOSSIBLE_INVENTORY("ImpossibleInventory", SpartanConfigKeys.impossibleInventory),
    HIT_REACH("HitReach", SpartanConfigKeys.hitReach),
    FAST_BREAK("FastBreak", SpartanConfigKeys.fastBreak),
    SPEED("Speed", SpartanConfigKeys.speed),
    FAST_PLACE("FastPlace", SpartanConfigKeys.fastPlace),
    MORE_PACKETS("MorePackets", SpartanConfigKeys.morePackets),
    NO_FALL("NoFall", SpartanConfigKeys.noFall),
    FAST_EAT("FastEat", SpartanConfigKeys.fastEat),
    VELOCITY("Velocity", SpartanConfigKeys.velocity),
    KILL_AURA("KillAura", SpartanConfigKeys.killAura),
    FOUND_COAL("Found Coal", SpartanConfigKeys.foundCoal),
    FOUND_COPPER("Found Copper", SpartanConfigKeys.foundCopper),
    FOUND_IRON("Found Iron", SpartanConfigKeys.foundIron),
    FOUND_LAPIS("Found Lapis", SpartanConfigKeys.foundLapis),
    FOUND_REDSTONE("Found Redstone", SpartanConfigKeys.foundRedstone),
    FOUND_GOLD("Found Gold", SpartanConfigKeys.foundGold),
    FOUND_EMERALD("Found Emerald", SpartanConfigKeys.foundEmerald),
    FOUND_DIAMOND("Found Diamond", SpartanConfigKeys.foundDiamond),
    FOUND_NETHER_QUARTZ("Found Nether Quartz", SpartanConfigKeys.foundNetherQuartz),
    FOUND_ANCIENT_DEBRIS("Found Ancient Debris", SpartanConfigKeys.foundAncientDebris)

}