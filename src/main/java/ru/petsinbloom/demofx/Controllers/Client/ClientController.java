package ru.petsinbloom.demofx.Controllers.Client;

import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import ru.petsinbloom.demofx.Models.Model;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientController implements Initializable {

    public BorderPane client_parent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue);
            switch (newValue) {
                case TRANSACTIONS -> client_parent.setCenter(Model.getInstance().getViewFactory().getTransactionsView());
                case DASHBOARD -> client_parent.setCenter(Model.getInstance().getViewFactory().getDashboardView());
                case ACCOUNTS -> client_parent.setCenter(Model.getInstance().getViewFactory().getAccountsView());
                default -> client_parent.setCenter(Model.getInstance().getViewFactory().getTransactionsView());
            }
        });
    }
}
