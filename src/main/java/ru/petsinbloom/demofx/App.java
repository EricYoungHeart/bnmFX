package ru.petsinbloom.demofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ru.petsinbloom.demofx.Models.Model;
import ru.petsinbloom.demofx.Views.ViewFactory;

import java.io.File;

public class App extends Application {

    @Override
    public void start(Stage stage)  {
        // FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
        // Scene scene = new Scene(fxmlLoader.load());
        // stage.setScene(scene);
        // stage.show();

        //ViewFactory viewFactory = new ViewFactory();
        //viewFactory.showLoginWindow();

        //File configFile = new File("config.properties");
        //if (!configFile.exists()) {
        //    ConfigManager.saveConfig("username", "JohnDoe"); // Default username
        //    ConfigManager.saveConfig("theme", "light");    // Default theme
        //}

        // Load configuration
        //String username = ConfigManager.loadConfig("username");
        //String theme = ConfigManager.loadConfig("theme");
        //System.out.println("Loaded username: " + username);
        //System.out.println("Loaded theme: " + theme);

        // Access the singleton instance
        AppConfig config = AppConfig.getInstance();

        // Load configuration values
        String qCod = config.getConfig("qCod");
        String qName = config.getConfig("qName");
        int orgId = Integer.parseInt(config.getConfig("orgId"));
        String pumpLogin = config.getConfig("pumpLogin");
        String pumpPassword = config.getConfig("pumpPassword");
        int orgCode = Integer.parseInt(config.getConfig("orgCode"));
        String host = config.getConfig("host");
        String pBase = config.getConfig("pBase");
        String pCommon = config.getConfig("pCommon");

        // Use the values (e.g., set up UI)
        System.out.println("qCod: " + qCod);
        System.out.println("qName: " + qName);
        System.out.println("orgId: " + orgId);
        System.out.println("pumpLogin: " + pumpLogin);
        System.out.println("pumpPassword: " + pumpPassword);
        System.out.println("orgCode: " + orgCode);
        System.out.println("host: " + host);
        System.out.println("pBase: " + pBase);
        System.out.println("pCommon: " + pCommon);

        Model.getInstance().getViewFactory().showLoginWindow();

    }
}
