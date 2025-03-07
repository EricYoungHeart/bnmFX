package ru.petsinbloom.demofx.Models;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;
import ru.petsinbloom.demofx.Controllers.Client.TransactionCellController;

public class TransactionCellFactory extends ListCell<Transaction> {
    @Override
    protected void updateItem(Transaction transaction, boolean empty) {
        super.updateItem(transaction, empty);
        if(empty) {
            setText(null);
            setGraphic(null);
        } else {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/Client/TransactionCell.fxml"));
            TransactionCellController controller = new TransactionCellController(transaction);
            fxmlLoader.setController(controller);
            setText(null);
            try{
                setGraphic(fxmlLoader.load());
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
