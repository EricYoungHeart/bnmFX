package ru.petsinbloom.demofx.Controllers.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import ru.petsinbloom.demofx.Models.Model;
import ru.petsinbloom.demofx.Views.AdminMenuOptions;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminMenuController implements Initializable {
    public Button create_client_btn;
    public Button clients_btn;
    public Button deposit_btn;
    public Button logout_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }

    private void addListeners() {
        create_client_btn.setOnAction(e -> onCreateClient());
        clients_btn.setOnAction(e -> onClients());
        deposit_btn.setOnAction(actionEvent -> onDeposit());
    }

    private void onCreateClient(){
        Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminMenuOptions.CREATE_CLIENT);
    }

    private void onClients(){
        Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminMenuOptions.CLIENTS);
    }

    private void onDeposit() {
        Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminMenuOptions.DEPOSIT);
    }

}
