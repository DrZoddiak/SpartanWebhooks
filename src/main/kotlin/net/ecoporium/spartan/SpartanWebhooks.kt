package net.ecoporium.spartan

import dev.triumphteam.cmd.bukkit.BukkitCommandManager
import net.ecoporium.spartan.command.WebhooksCommand
import net.ecoporium.spartan.config.ConfigHelper
import net.ecoporium.spartan.config.SpartanConfig
import net.ecoporium.spartan.listener.ViolationHandler
import net.ecoporium.spartan.manager.WebhookManager
import org.bukkit.command.CommandSender
import org.bukkit.plugin.java.JavaPlugin

class SpartanWebhooks: JavaPlugin() {

    companion object {
        lateinit var instance: SpartanWebhooks
    }

    lateinit var spartanConfig: SpartanConfig
    lateinit var webhookManager: WebhookManager

    override fun onEnable() {
        instance = this

        if (!server.pluginManager.isPluginEnabled("Spartan")) {
            logger.severe("The Spartan Anti-Cheat plugin was not located.")
            logger.severe("SpartanWebhooks cannot function properly without it.")
            server.pluginManager.disablePlugin(this)
            return
        }

        webhookManager = WebhookManager(this)
        /*webhookManager.loadWebhooks()
        if (webhookManager.webhooks.isEmpty()) {
            logger.severe("Could not locate any file configurations for webhooks!")
            server.pluginManager.disablePlugin(this)
            return
        }*/

        server.pluginManager.registerEvents(ViolationHandler(), this)
        this.loadCommands()

    }

    private fun loadCommands() {
        val commandManager: BukkitCommandManager<CommandSender> = BukkitCommandManager.create(this)
        commandManager.registerCommand(WebhooksCommand(this))
    }

    fun loadConfigs() {
        if (spartanConfig != null) {
            spartanConfig.reload()
        } else {
            spartanConfig = SpartanConfig(ConfigHelper(this).provideConfigAdapter("config.yml"))
        }
    }

}