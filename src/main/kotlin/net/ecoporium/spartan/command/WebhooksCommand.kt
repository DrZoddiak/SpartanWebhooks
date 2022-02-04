package net.ecoporium.spartan.command

import dev.triumphteam.cmd.bukkit.annotation.Permission
import dev.triumphteam.cmd.core.BaseCommand
import dev.triumphteam.cmd.core.annotation.Command
import dev.triumphteam.cmd.core.annotation.SubCommand
import net.ecoporium.spartan.SpartanWebhooks
import net.ecoporium.spartan.config.SpartanConfigKeys
import net.ecoporium.spartan.model.violation.Violation
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.command.CommandSender

@Command("webhooks")
class WebhooksCommand(private val plugin: SpartanWebhooks): BaseCommand() {

    @SubCommand("reload")
    @Permission("spartan-webhooks.commands.reload")
    fun reload(sender: CommandSender) {
        SpartanWebhooks.instance.loadConfigs()
        sender.sendMessage(
            Component.text("[SpartanWebhooks]", NamedTextColor.DARK_PURPLE).append(
                Component.text(" Configs reloaded.", NamedTextColor.GREEN)
            )
        )
    }

    @SubCommand("status")
    @Permission("spartan-webhooks.commands.status")
    fun status(sender: CommandSender, violation: Violation) {
        sender.sendMessage(Component.text("[SpartanWebhooks]", NamedTextColor.DARK_PURPLE).append(
            Component.text(" Status of ${violation.fancyName}: ", NamedTextColor.GOLD).append(
                Component.text(violation.key.get(SpartanWebhooks.instance.spartanConfig.adapter), NamedTextColor.YELLOW)
            )
        ))
    }

}