package net.ecoporium.spartan.config

import net.ecoporium.spartan.api.config.adapter.BukkitConfigAdapter
import org.bukkit.plugin.java.JavaPlugin
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path

class ConfigHelper(private val plugin: JavaPlugin) {

    fun resolveConfig(fileName: String): Path {
        val configFile = plugin.dataFolder.toPath().resolve(fileName)

        if (!Files.exists(configFile)) {
            try {
                Files.createDirectories(configFile.parent)
            } catch (exception: IOException) {
                // ignored
            }

            try {
                val inputStream = javaClass.classLoader.getResourceAsStream(fileName)
                Files.copy(inputStream!!, configFile)
                inputStream.close()
            } catch (exception: IOException) {
                throw RuntimeException(exception)
            }
        }

        return configFile
    }

    fun provideConfigAdapter(fileName: String): BukkitConfigAdapter {
        return BukkitConfigAdapter(plugin, resolveConfig(fileName).toFile())
    }

}