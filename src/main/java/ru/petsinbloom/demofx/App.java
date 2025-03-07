package ru.petsinbloom.demofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ru.petsinbloom.demofx.Models.Model;
import ru.petsinbloom.demofx.Views.ViewFactory;

public class App extends Application {

    @Override
    public void start(Stage stage)  {
        // FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
        // Scene scene = new Scene(fxmlLoader.load());
        // stage.setScene(scene);
        // stage.show();

        //ViewFactory viewFactory = new ViewFactory();
        //viewFactory.showLoginWindow();

        Model.getInstance().getViewFactory().showLoginWindow();

    }
}
