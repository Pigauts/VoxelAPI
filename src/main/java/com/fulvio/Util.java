package com.fulvio;

import org.bukkit.ChatColor;

public abstract class Util {

    public static String color(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }

    public static String enumFormat(String s) {
        return s.toUpperCase().replace(" ", "_");
    }

    public static <E extends Enum<E>> boolean isValidEnum(Class<E> enumClass, String enumName) {
        try {
            Enum.valueOf(enumClass, enumName);
        } catch (IllegalArgumentException e) {
            return false;
        }
        return true;
    }

    public static boolean isNumber(String s) {
        return getNumber(s) != null;
    }

    public static Integer getNumber(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return null;
        }
    }

}
