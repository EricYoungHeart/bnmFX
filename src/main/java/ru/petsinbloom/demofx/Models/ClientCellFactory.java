package ru.petsinbloom.demofx.Models;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;
import ru.petsinbloom.demofx.Controllers.Admin.ClientCellController;

import java.io.IOException;

public class ClientCellFactory extends ListCell<Client> {

    @Override
    protected void updateItem(Client client, boolean empty) {
        super.updateItem(client, empty);

        if (empty || client == null) {
            setText(null);
            setGraphic(null);
        } else {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/Admin/ClientCell.fxml"));
            ClientCellController controller = new ClientCellController(client);
            fxmlLoader.setController(controller);
            setText(null);

            try {
                setGraphic(fxmlLoader.load());
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
