package net.ecoporium.spartan.api.config.generic.adapter;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;
import java.util.Map;

public interface ConfigurationAdapter {

    JavaPlugin getPlugin();

    void reload();

    String getString(String path, String def);

    int getInteger(String path, int def);

    double getDouble(String path, double def);

    boolean getBoolean(String path, boolean def);

    List<String> getStringList(String path, List<String> def);

    List<String> getKeys(String path, List<String> def);

    Map<String, String> getStringMap(String path, Map<String, String> def);

}