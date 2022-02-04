package net.ecoporium.spartan.config

import net.ecoporium.spartan.api.config.generic.KeyedConfiguration
import net.ecoporium.spartan.api.config.generic.key.ConfigKey
import net.ecoporium.spartan.api.config.generic.key.ConfigKeyFactory.key
import net.ecoporium.spartan.api.config.generic.key.SimpleConfigKey

class SpartanConfigKeys {

    companion object {
        val keys: List<SimpleConfigKey<*>> = KeyedConfiguration.initialise(SpartanConfigKeys::class.java)

        val exploits: ConfigKey<Boolean> = key { it.getBoolean("violations.exploits", true) }
        val entityMove: ConfigKey<Boolean> = key { it.getBoolean("violations.entity-move", true) }
        val noSwing: ConfigKey<Boolean> = key { it.getBoolean("violations.no-swing", true) }
        val irregularMovements: ConfigKey<Boolean> = key { it.getBoolean("violations.irregular-movements", true) }
        val clip: ConfigKey<Boolean> = key { it.getBoolean("violations.clip", true) }
        val impossibleActions: ConfigKey<Boolean> = key { it.getBoolean("violations.impossible-actions", true) }
        val itemDrops: ConfigKey<Boolean> = key { it.getBoolean("violations.item-drops", true) }
        val autoRespawn: ConfigKey<Boolean> = key { it.getBoolean("violations.auto-respawn", true) }
        val inventoryClicks: ConfigKey<Boolean> = key { it.getBoolean("violations.inventory-clicks", true) }
        val sprint: ConfigKey<Boolean> = key { it.getBoolean("violations.sprint", true) }
        val jesus: ConfigKey<Boolean> = key { it.getBoolean("violations.jesus", true) }
        val noSlowdown: ConfigKey<Boolean> = key { it.getBoolean("violations.no-slowdown", true) }
        val criticals: ConfigKey<Boolean> = key { it.getBoolean("violations.criticals", true) }
        val ghostHand: ConfigKey<Boolean> = key { it.getBoolean("violations.ghost-hand", true) }
        val blockReach: ConfigKey<Boolean> = key { it.getBoolean("violations.block-reach", true) }
        val elytraMove: ConfigKey<Boolean> = key { it.getBoolean("violations.elytra-move", true) }
        val fastBow: ConfigKey<Boolean> = key { it.getBoolean("violations.fast-bow", true) }
        val fastClicks: ConfigKey<Boolean> = key { it.getBoolean("violations.fast-clicks", true) }
        val fastHeal: ConfigKey<Boolean> = key { it.getBoolean("violations.fast-heal", true) }
        val impossibleInventory: ConfigKey<Boolean> = key { it.getBoolean("violations.impossible-inventory", true) }
        val hitReach: ConfigKey<Boolean> = key { it.getBoolean("violations.hit-reach", true) }
        val fastBreak: ConfigKey<Boolean> = key { it.getBoolean("violations.fast-break", true) }
        val speed: ConfigKey<Boolean> = key { it.getBoolean("violations.speed", true) }
        val fastPlace: ConfigKey<Boolean> = key { it.getBoolean("violations.fast-place", true) }
        val morePackets: ConfigKey<Boolean> = key { it.getBoolean("violations.more-packets", true) }
        val noFall: ConfigKey<Boolean> = key { it.getBoolean("violations.no-fall", true) }
        val fastEat: ConfigKey<Boolean> = key { it.getBoolean("violations.fast-eat", true) }
        val velocity: ConfigKey<Boolean> = key { it.getBoolean("violations.velocity", true) }
        val killAura: ConfigKey<Boolean> = key { it.getBoolean("violations.kill-aura", true) }
        val foundCoal: ConfigKey<Boolean> = key { it.getBoolean("violations.found-coal", true) }
        val foundCopper: ConfigKey<Boolean> = key { it.getBoolean("violations.found-copper", true) }
        val foundIron: ConfigKey<Boolean> = key { it.getBoolean("violations.found-iron", true) }
        val foundLapis: ConfigKey<Boolean> = key { it.getBoolean("violations.found-lapis", true) }
        val foundRedstone: ConfigKey<Boolean> = key { it.getBoolean("violations.found-redstone", true) }
        val foundGold: ConfigKey<Boolean> = key { it.getBoolean("violations.found-gold", true) }
        val foundEmerald: ConfigKey<Boolean> = key { it.getBoolean("violations.found-emerald", true) }
        val foundDiamond: ConfigKey<Boolean> = key { it.getBoolean("violations.found-diamond", true) }
        val foundNetherQuartz: ConfigKey<Boolean> = key { it.getBoolean("violations.found-nether-quartz", true) }
        val foundAncientDebris: ConfigKey<Boolean> = key { it.getBoolean("violations.found-ancient-debris", true) }
    }

}