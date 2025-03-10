package ru.petsinbloom.demofx;

import java.io.*;
import java.util.Properties;

public class ConfigManager {
    private static final String CONFIG_FILE = "config.properties";

    public static void saveConfig(String key, String value) {
        Properties prop = new Properties();
        try (OutputStream output = new FileOutputStream(CONFIG_FILE)) {
            prop.setProperty(key, value);
            prop.store(output, null);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String loadConfig(String key) {
        Properties prop = new Properties();
        try (InputStream input = new FileInputStream(CONFIG_FILE)) {
            prop.load(input);
            return prop.getProperty(key);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}