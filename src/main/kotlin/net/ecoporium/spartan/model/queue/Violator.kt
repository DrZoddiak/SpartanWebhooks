package net.ecoporium.spartan.model.queue

import net.ecoporium.spartan.model.violation.Violation
import org.bukkit.OfflinePlayer

class Violator(private val player: OfflinePlayer) {

    private val violations: MutableMap<Violation, Int> = mutableMapOf()

    fun add(violation: Violation) {
        violations[violation] = violations[violation]?.plus(1) ?: 1
    }

    fun flush() {
        violations.clear()
    }

    fun recentViolations(): String {
        return violations.map { "${it.key.fancyName} - ${it.value}x" }.joinToString { "\n" }
    }

}