package ru.petsinbloom.demofx.Controllers;

import javafx.collections.FXCollections;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.controlsfx.control.PropertySheet;
import ru.petsinbloom.demofx.Models.Model;
import ru.petsinbloom.demofx.Views.AccountType;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public ChoiceBox<AccountType> acc_selector;
    public Label payee_address_lbl;
    public TextField payee_address_fld;
    public TextField password_fld;
    public Button login_btn;
    public Label error_lbl;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        acc_selector.setItems(FXCollections.observableArrayList(AccountType.CLIENT, AccountType.ADMIN));
        acc_selector.setValue(Model.getInstance().getViewFactory().getLoginAccountType());
        acc_selector.valueProperty().addListener(observable -> {Model.getInstance().getViewFactory().setLoginAccountType(acc_selector.getValue());});

        login_btn.setOnAction(e -> onLogin());
    }

    private void onLogin() {
        Stage stage = (Stage) login_btn.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);

        if(Model.getInstance().getViewFactory().getLoginAccountType()==AccountType.CLIENT) {
            Model.getInstance().getViewFactory().showClientWindow();
        }else {
            Model.getInstance().getViewFactory().showAdminWindow();
        }
    }
}
