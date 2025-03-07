module ru.petsinbloom.demofx {
    requires javafx.controls;
    requires javafx.fxml;

    requires de.jensd.fx.glyphs.fontawesome;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens ru.petsinbloom.demofx to javafx.fxml;
    exports ru.petsinbloom.demofx;

    exports ru.petsinbloom.demofx.Controllers;
    exports ru.petsinbloom.demofx.Controllers.Admin;
    exports ru.petsinbloom.demofx.Controllers.Client;
    exports ru.petsinbloom.demofx.Models;
    exports ru.petsinbloom.demofx.Views;
}