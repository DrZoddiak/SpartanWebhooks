package net.ecoporium.spartan.api.config.adapter;

import net.ecoporium.spartan.api.config.generic.adapter.ConfigurationAdapter;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.*;

public class BukkitConfigAdapter implements ConfigurationAdapter {
    private final JavaPlugin plugin;
    private final File file;
    private YamlConfiguration configuration;

    public BukkitConfigAdapter(JavaPlugin plugin, File file) {
        this.plugin = plugin;
        this.file = file;
        reload();
    }

    @Override
    public void reload() {
        this.configuration = YamlConfiguration.loadConfiguration(this.file);
    }

    @Override
    public String getString(String path, String def) {
        return this.configuration.getString(path, def);
    }

    public void setString(String path, String def) {
        this.configuration.set(path, def);
        this.reload();
    }

    @Override
    public int getInteger(String path, int def) {
        return this.configuration.getInt(path, def);
    }

    public void setInt(String path, int def) {
        this.configuration.set(path, def);
        this.reload();
    }

    @Override
    public double getDouble(String path, double def) {
        return this.configuration.getDouble(path, def);
    }

    public void setDouble(String path, double def) {
        this.configuration.set(path, def);
        this.reload();
    }

    @Override
    public boolean getBoolean(String path, boolean def) {
        return this.configuration.getBoolean(path, def);
    }

    public void setBoolean(String path, boolean def) {
        this.configuration.set(path, def);
        this.reload();
    }

    @Override
    public List<String> getStringList(String path, List<String> def) {
        List<String> list = this.configuration.getStringList(path);
        return this.configuration.isSet(path) ? list : def;
    }

    @Override
    public List<String> getKeys(String path, List<String> def) {
        ConfigurationSection section = this.configuration.getConfigurationSection(path);
        if (section == null) {
            return def;
        }

        Set<String> keys = section.getKeys(false);
        return new ArrayList<>(keys);
    }

    @Override
    public Map<String, String> getStringMap(String path, Map<String, String> def) {
        Map<String, String> map = new HashMap<>();
        ConfigurationSection section = this.configuration.getConfigurationSection(path);
        if (section == null) {
            return def;
        }

        for (String key : section.getKeys(false)) {
            map.put(key, section.getString(key));
        }

        return map;
    }

    @Override
    public JavaPlugin getPlugin() {
        return this.plugin;
    }
}
