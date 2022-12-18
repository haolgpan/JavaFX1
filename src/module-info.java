module JavaFX1 {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;

    exports seedu.address;
    opens seedu.address.view;
}