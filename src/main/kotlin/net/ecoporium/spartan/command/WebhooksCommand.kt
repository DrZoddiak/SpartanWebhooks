package net.ecoporium.spartan.command

import dev.triumphteam.cmd.bukkit.annotation.Permission
import dev.triumphteam.cmd.core.BaseCommand
import dev.triumphteam.cmd.core.annotation.Command
import dev.triumphteam.cmd.core.annotation.SubCommand
import net.ecoporium.spartan.model.violation.Violation
import net.kyori.adventure.text.Component
import org.bukkit.command.CommandSender

@Command("webhooks")
class WebhooksCommand: BaseCommand() {

    @SubCommand("toggle")
    @Permission("spartan-webhooks.commands.toggle")
    fun toggle(sender: CommandSender, violation: Violation) {
        sender.sendMessage(Component.text("Toggled webhooks for ${violation.fancyName}."))
    }

}