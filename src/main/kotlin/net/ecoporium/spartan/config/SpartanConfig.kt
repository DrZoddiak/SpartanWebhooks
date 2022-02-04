package net.ecoporium.spartan.config

import net.ecoporium.spartan.api.config.adapter.BukkitConfigAdapter
import net.ecoporium.spartan.api.config.generic.KeyedConfiguration


class SpartanConfig(val adapter: BukkitConfigAdapter) : KeyedConfiguration(adapter, SpartanConfigKeys.keys) {

    init {
        init()
    }

}