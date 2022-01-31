package net.ecoporium.spartan

import net.ecoporium.spartan.manager.WebhookManager
import org.bukkit.plugin.java.JavaPlugin

class SpartanWebhooks: JavaPlugin() {

    lateinit var webhookManager: WebhookManager

    override fun onEnable() {

        if (server.pluginManager.isPluginEnabled("Spartan")) {
            logger.severe("The Spartan Anti-Cheat plugin was not located.")
            logger.severe("SpartanWebhooks cannot function properly without it.")
            server.pluginManager.disablePlugin(this)
            return
        }

        webhookManager = WebhookManager(this)
        webhookManager.loadWebhooks()
        if (webhookManager.webhooks.isEmpty()) {
            logger.severe("Could not locate any file configurations for webhooks!")
            server.pluginManager.disablePlugin(this)
            return
        }

    }

}