package ru.petsinbloom.demofx;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class AppConfig {
    private static AppConfig instance;
    private Properties properties;

    private AppConfig() {
        properties = new Properties();
        loadConfig();
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    private void loadConfig() {
        // Load from a file with UTF-8 encoding
        // Версия, если не нужно сохранять кириллицу в UTF-8
        //try (InputStream input = new FileInputStream("config.properties")) {
        //    properties.load(input);
        try (Reader reader = new InputStreamReader(new FileInputStream("config.properties"), StandardCharsets.UTF_8)) {
            properties.load(reader);
        } catch (IOException ex) {
            // Initialize with default values if the file doesn't exist
            properties.setProperty("qCod", "I2");
            properties.setProperty("qName", "МСК \"ИНКО-МЕД\"");
            properties.setProperty("orgId", "6470");
            properties.setProperty("pumpLogin", "inco_frolov_pump_in");
            properties.setProperty("pumpPassword", "c0zDOS");
            properties.setProperty("orgCode", "6032");
            properties.setProperty("host", "192.168.192.119:8080");
            properties.setProperty("pBase", "D:\\Nsi\\Base");
            properties.setProperty("pCommon", "D:\\Nsi\\Common");
            saveConfig(); // Save the default configuration to file
        }
    }

    public void saveConfig() {
        // Save to a file with UTF-8 encoding
        // Версия, если не нужно читить кириллицу в UTF-8
        //try (OutputStream output = new FileOutputStream("config.properties")) {
        //    properties.store(output, null);
        try (Writer writer = new OutputStreamWriter(new FileOutputStream("config.properties"), StandardCharsets.UTF_8)) {
            properties.store(writer, null);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public String getConfig(String key) {
        return properties.getProperty(key);
    }

    public void setConfig(String key, String value) {
        properties.setProperty(key, value);
    }
}
