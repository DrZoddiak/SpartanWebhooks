package net.ecoporium.spartan.listener

import me.vagdedes.spartan.api.PlayerFoundOreEvent
import me.vagdedes.spartan.api.PlayerViolationEvent
import net.ecoporium.spartan.SpartanWebhooks
import net.ecoporium.spartan.model.webhook.WebhookType
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import java.net.URL

class ViolationHandler: Listener {

    @EventHandler
    fun onViolation(event: PlayerViolationEvent) {
        SpartanWebhooks.webhookManager.sendWebhook(
            WebhookType.VIOLATION,
            URL("To be received via configuration")
        )
    }

    @EventHandler
    fun onFoundOre(event: PlayerFoundOreEvent) {
        SpartanWebhooks.webhookManager.sendWebhook(
            WebhookType.FOUND_ORE,
            URL("To be received via configuration")
        )
    }

}