package net.ecoporium.spartan.model.violation

import me.vagdedes.spartan.api.API
import me.vagdedes.spartan.system.Enums

enum class Violation(val fancyName: String) {

    EXPLOITS(API.getConfiguredCheckName(Enums.HackType.Exploits)),
    ENTITY_MOVE(API.getConfiguredCheckName(Enums.HackType.EntityMove)),
    NO_SWING(API.getConfiguredCheckName(Enums.HackType.NoSwing)),
    IRREGULAR_MOVEMENTS(API.getConfiguredCheckName(Enums.HackType.IrregularMovements)),
    CLIP(API.getConfiguredCheckName(Enums.HackType.Clip)),
    IMPOSSIBLE_ACTIONS(API.getConfiguredCheckName(Enums.HackType.ImpossibleActions)),
    ITEM_DROPS(API.getConfiguredCheckName(Enums.HackType.ItemDrops)),
    AUTO_RESPAWN(API.getConfiguredCheckName(Enums.HackType.AutoRespawn)),
    INVENTORY_CLICKS(API.getConfiguredCheckName(Enums.HackType.InventoryClicks)),
    SPRINT(API.getConfiguredCheckName(Enums.HackType.Sprint)),
    JESUS(API.getConfiguredCheckName(Enums.HackType.Jesus)),
    NO_SLOWDOWN(API.getConfiguredCheckName(Enums.HackType.NoSlowdown)),
    CRITICALS(API.getConfiguredCheckName(Enums.HackType.Criticals)),
    GHOST_HAND(API.getConfiguredCheckName(Enums.HackType.GhostHand)),
    BLOCK_REACH(API.getConfiguredCheckName(Enums.HackType.BlockReach)),
    ELYTRA_MOVE(API.getConfiguredCheckName(Enums.HackType.ElytraMove)),
    FAST_BOW(API.getConfiguredCheckName(Enums.HackType.ElytraMove)),
    FAST_CLICKS(API.getConfiguredCheckName(Enums.HackType.FastClicks)),
    FAST_HEAL(API.getConfiguredCheckName(Enums.HackType.FastHeal)),
    IMPOSSIBLE_INVENTORY(API.getConfiguredCheckName(Enums.HackType.ImpossibleInventory)),
    HIT_REACH(API.getConfiguredCheckName(Enums.HackType.HitReach)),
    FAST_BREAK(API.getConfiguredCheckName(Enums.HackType.FastHeal)),
    SPEED(API.getConfiguredCheckName(Enums.HackType.Speed)),
    FAST_PLACE(API.getConfiguredCheckName(Enums.HackType.FastPlace)),
    MORE_PACKETS(API.getConfiguredCheckName(Enums.HackType.MorePackets)),
    NO_FALL(API.getConfiguredCheckName(Enums.HackType.NoFall)),
    FAST_EAT(API.getConfiguredCheckName(Enums.HackType.FastEat)),
    VELOCITY(API.getConfiguredCheckName(Enums.HackType.Velocity)),
    KILL_AURA(API.getConfiguredCheckName(Enums.HackType.KillAura)),
    FOUND_COAL("Found Coal"),
    FOUND_COPPER("Found Copper"),
    FOUND_IRON("Found Iron"),
    FOUND_LAPIS("Found Lapis"),
    FOUND_REDSTONE("Found Redstone"),
    FOUND_GOLD("Found Gold"),
    FOUND_EMERALD("Found Emerald"),
    FOUND_DIAMOND("Found Diamond"),
    FOUND_NETHER_QUARTZ("Found Nether Quartz"),
    FOUND_ANCIENT_DEBRIS("Found Ancient Debris")

}