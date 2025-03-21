package ru.petsinbloom.demofx.Controllers.Client;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AccountsController implements Initializable {
    public Label ch_acc_num;
    public Label transaction_limit;
    public Label ch_account_date;
    public Label ch_acc_bal;
    public Label sv_acc_num;
    public Label sv_acc_date;
    public Label sv_acc_balance;
    public TextField amount_to_sv;
    public Button trans_to_sv_btn;
    public TextField amount_to_ch;
    public Button trans_to_ch_btn;
    public Label withdrawal_limit;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
