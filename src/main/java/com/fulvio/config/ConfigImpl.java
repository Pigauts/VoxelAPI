package com.fulvio.config;

import com.fulvio.API.Config;
import com.fulvio.Util;
import com.fulvio.item.ItemBuilder;
import com.fulvio.number.Amount;
import com.fulvio.number.Range;
import org.bukkit.*;
import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.ConfigurationOptions;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;
import org.checkerframework.checker.units.qual.A;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ConfigImpl implements Config {

    private File file;

    private ConfigurationSection config;

    public ConfigImpl(File file) {
        this(file, YamlConfiguration.loadConfiguration(file));
    }

    public ConfigImpl(File file, ConfigurationSection config) {
        this.file = file;
        this.config = config;
    }


    @Override
    public Set<String> getKeys(boolean deep) {
        return config.getKeys(deep);
    }

    @Override
    public Map<String, Object> getValues(boolean deep) {
        return config.getValues(deep);
    }

    @Override
    public boolean contains(String path) {
        return config.contains(path);
    }

    @Override
    public boolean contains(String path, boolean ignoreDefault) {
        return config.contains(path, ignoreDefault);
    }

    @Override
    public boolean isSet(String path) {
        return config.isSet(path);
    }

    @Override
    public String getCurrentPath() {
        return config.getCurrentPath();
    }

    @Override
    public String getName() {
        return config.getName();
    }

    @Override
    public Configuration getRoot() {
        return config.getRoot();
    }

    @Override
    public ConfigurationSection getParent() {
        return config.getParent();
    }

    @Override
    public Object get(String path) {
        return config.get(path);
    }

    @Override
    public Object get(String path, Object def) {
        return config.get(path, def);
    }

    @Override
    public void set(String path, Object value) {
        config.set(path, value);
    }

    @Override
    public ConfigurationSection createSection(String path) {
        return config.createSection(path);
    }

    @Override
    public ConfigurationSection createSection(String path, Map<?, ?> map) {
        return config.createSection(path, map);
    }

    @Override
    public String getString(String path) {
        return config.getString(path);
    }

    @Override
    public String getString(String path, String def) {
        return config.getString(path, def);
    }

    @Override
    public boolean isString(String path) {
        return config.isString(path);
    }

    @Override
    public int getInt(String path) {
        return config.getInt(path);
    }

    @Override
    public int getInt(String path, int def) {
        return config.getInt(path, def);
    }

    @Override
    public boolean isInt(String path) {
        return config.isInt(path);
    }

    @Override
    public boolean getBoolean(String path) {
        return config.getBoolean(path);
    }

    @Override
    public boolean getBoolean(String path, boolean def) {
        return config.getBoolean(path, def);
    }

    @Override
    public boolean isBoolean(String path) {
        return config.isBoolean(path);
    }

    @Override
    public double getDouble(String path) {
        return config.getDouble(path);
    }

    @Override
    public double getDouble(String path, double def) {
        return config.getDouble(path, def);
    }

    @Override
    public boolean isDouble(String path) {
        return config.isDouble(path);
    }

    @Override
    public long getLong(String path) {
        return config.getLong(path);
    }

    @Override
    public long getLong(String path, long def) {
        return config.getLong(path, def);
    }

    @Override
    public boolean isLong(String path) {
        return config.isLong(path);
    }

    @Override
    public List<?> getList(String path) {
        return config.getList(path);
    }

    @Override
    public List<?> getList(String path, List<?> def) {
        return config.getList(path, def);
    }

    @Override
    public boolean isList(String path) {
        return config.isList(path);
    }

    @Override
    public List<String> getStringList(String path) {
        return config.getStringList(path);
    }

    @Override
    public List<Integer> getIntegerList(String path) {
        return config.getIntegerList(path);
    }

    @Override
    public List<Boolean> getBooleanList(String path) {
        return config.getBooleanList(path);
    }

    @Override
    public List<Double> getDoubleList(String path) {
        return config.getDoubleList(path);
    }

    @Override
    public List<Float> getFloatList(String path) {
        return config.getFloatList(path);
    }

    @Override
    public List<Long> getLongList(String path) {
        return config.getLongList(path);
    }

    @Override
    public List<Byte> getByteList(String path) {
        return config.getByteList(path);
    }

    @Override
    public List<Character> getCharacterList(String path) {
        return config.getCharacterList(path);
    }

    @Override
    public List<Short> getShortList(String path) {
        return config.getShortList(path);
    }

    @Override
    public List<Map<?, ?>> getMapList(String path) {
        return config.getMapList(path);
    }

    @Override
    public <T> T getObject(String path, Class<T> clazz) {
        return config.getObject(path, clazz);
    }

    @Override
    public <T> T getObject(String path, Class<T> clazz, T def) {
        return config.getObject(path, clazz, def);
    }

    @Override
    public <T extends ConfigurationSerializable> T getSerializable(String path, Class<T> clazz) {
        return config.getSerializable(path, clazz);
    }

    @Override
    public <T extends ConfigurationSerializable> T getSerializable(String path, Class<T> clazz, T def) {
        return config.getSerializable(path, clazz, def);
    }

    @Override
    public Vector getVector(String path) {
        return config.getVector(path);
    }

    @Override
    public Vector getVector(String path, Vector def) {
        return config.getVector(path, def);
    }

    @Override
    public boolean isVector(String path) {
        return config.isVector(path);
    }

    @Override
    public OfflinePlayer getOfflinePlayer(String path) {
        return config.getOfflinePlayer(path);
    }

    @Override
    public OfflinePlayer getOfflinePlayer(String path, OfflinePlayer def) {
        return config.getOfflinePlayer(path, def);
    }

    @Override
    public boolean isOfflinePlayer(String path) {
        return config.isOfflinePlayer(path);
    }

    @Override
    public ItemStack getItemStack(String path) {
        return config.getItemStack(path);
    }

    @Override
    public ItemStack getItemStack(String path, ItemStack def) {
        return config.getItemStack(path, def);
    }

    @Override
    public boolean isItemStack(String path) {
        return config.isItemStack(path);
    }

    @Override
    public Color getColor(String path) {
        return config.getColor(path);
    }

    @Override
    public Color getColor(String path, Color def) {
        return config.getColor(path, def);
    }

    @Override
    public boolean isColor(String path) {
        return config.isColor(path);
    }

    @Override
    public Location getLocation(String path) {
        return config.getLocation(path);
    }

    @Override
    public Location getLocation(String path, Location def) {
        return config.getLocation(path, def);
    }

    @Override
    public boolean isLocation(String path) {
        return config.isLocation(path);
    }

    @Override
    public ConfigurationSection getConfigurationSection(String path) {
        return config.getConfigurationSection(path);
    }

    @Override
    public boolean isConfigurationSection(String path) {
        return config.isConfigurationSection(path);
    }

    @Override
    public ConfigurationSection getDefaultSection() {
        return config.getDefaultSection();
    }

    @Override
    public void addDefault(String path, Object value) {
        config.addDefault(path, value);
    }

    @Override
    public void addDefaults(Map<String, Object> defaults) {

    }

    @Override
    public void addDefaults(Configuration defaults) {

    }

    @Override
    public void setDefaults(Configuration defaults) {

    }

    @Override
    public Configuration getDefaults() {
        return null;
    }

    @Override
    public ConfigurationOptions options() {
        return null;
    }

    @Override
    public List<String> getComments(String path) {
        return config.getComments(path);
    }

    @Override
    public List<String> getInlineComments(String path) {
        return config.getInlineComments(path);
    }

    @Override
    public void setComments(String path, List<String> comments) {
        config.setComments(path, comments);
    }

    @Override
    public void setInlineComments(String path, List<String> comments) {
        config.setInlineComments(path, comments);
    }

    public Config getConfig(String path) {
        return new ConfigImpl(file, getConfigurationSection(path));
    }

    public String getColorString(String path) {
        return ChatColor.translateAlternateColorCodes('&', config.getString(path, ""));
    }

    public String getEnumString(String path) {
        return getString(path).toUpperCase().replace(" ", "_");
    }

    public List<String> getColorList(String path) {
        final List<String> list = config.getStringList(path);
        list.replaceAll(string -> Util.color(string));
        return list;
    }

    public Amount getAmount(String path) {
        final String[] numbers = getString(path).split("-");
        if (!Util.isNumber(numbers[0])) return null;
        if (numbers.length < 2) {
            return new Amount(Util.getNumber(numbers[0]));
        } else {
            if (!Util.isNumber(numbers[1])) return null;
            return new Range(Util.getNumber(numbers[0]), Util.getNumber(numbers[1]));
        }
    }

    public Amount getAmount(String path, int def) {
        final Amount amount = getAmount(path);
        return amount == null ? new Amount(def) : amount;
    }

    public Material getMaterial(String path) {
        final String id = getEnumString(path);
        if (!Util.isValidEnum(Material.class, id)) return null;
        return Material.valueOf(id);
    }

    public Material getMaterial(String path, Material def) {
        final Material material = getMaterial(path);
        return material == null ? def : material;
    }

    public ItemStack getItem(String path) {
        if (isItemStack(path)) return getItemStack(path);
        return new ItemBuilder(getConfig(path)).build();
    }


}
