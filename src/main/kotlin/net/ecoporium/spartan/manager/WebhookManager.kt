package net.ecoporium.spartan.manager

import com.google.gson.Gson
import net.ecoporium.spartan.SpartanWebhooks
import net.ecoporium.spartan.model.webhook.Webhook
import net.ecoporium.spartan.model.webhook.WebhookType
import java.io.File
import java.io.FileReader
import java.net.URL
import java.util.*
import javax.net.ssl.HttpsURLConnection

class WebhookManager(private val plugin: SpartanWebhooks) {

    private val paths = listOf("violation.json")
    var webhooks = emptyMap<WebhookType, Webhook>()

    init {
        val dataFolder = plugin.dataFolder
        if (!dataFolder.exists()) {
            dataFolder.mkdir()
            val file = File(dataFolder, "violation.json")
            file.createNewFile()
        }
    }

    /**
     * Loads all webhooks and updates their variables from the JSON files
     */
    fun loadWebhooks() {
        if (!checkFileExistence()) return
        val mutableWebhooks = mutableMapOf<WebhookType, Webhook>()
        val gson = Gson()

        for (path in paths) {
            val file = File(plugin.dataFolder.path + path)
            val type = WebhookType.valueOf(path.removeSuffix(".json").uppercase(Locale.getDefault()))
            mutableWebhooks[type] = gson.fromJson(FileReader(file), Webhook::class.java)
        }
        webhooks = mutableWebhooks.toMap()
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

    /**
     * Sends a webhook with the given webhook type and URL
     */
    fun sendWebhook(type: WebhookType, url: URL) {
        val webhook = webhooks[type]
        if (webhook == null) {
            plugin.logger.severe("Attempted to send webhook, but could not find webhook with path '$type'")
            return
        }

        val connection = url.openConnection() as HttpsURLConnection
        connection.addRequestProperty("Content-Type", "application/json")
        connection.addRequestProperty("User-Agent", "SpartanWebhooks")
        connection.doOutput = true
        connection.requestMethod = "POST"

        val stream = connection.outputStream
        stream.write(Gson().toJson(webhook).toByteArray())
        stream.flush()
        stream.close()

        connection.inputStream.close()
        connection.disconnect()
    }

}