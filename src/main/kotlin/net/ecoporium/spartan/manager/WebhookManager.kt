package net.ecoporium.spartan.manager

import com.google.gson.Gson
import net.ecoporium.spartan.SpartanWebhooks
import net.ecoporium.spartan.model.Webhook
import java.io.File
import java.io.FileReader

class WebhookManager(private val plugin: SpartanWebhooks) {

    private val paths = listOf("violation.json")
    var webhooks = emptyList<Webhook>()

    /**
     * Loads all webhooks and updates their variables from the JSON files
     */
    fun loadWebhooks() {
        if (!checkFileExistence()) return
        val mutableWebhooks = mutableListOf<Webhook>()
        val gson = Gson()

        for (path in paths) {
            val file = File(plugin.dataFolder.path + path)
            mutableWebhooks.add(gson.fromJson(FileReader(file), Webhook::class.java))
        }
        webhooks = mutableWebhooks.toList()
    }

    /**
     * Checks if all files specified in the paths list exists
     */
    private fun checkFileExistence(): Boolean {
        var exists = true
        for (path in paths) {
            val file = File(plugin.dataFolder.path + path)
            if (!file.exists().and(file.isFile)) {
                plugin.logger.severe("Attempted to locate file at '${file.path}', but could not find it.")
                exists = false
            }
        }
        return exists
    }

}