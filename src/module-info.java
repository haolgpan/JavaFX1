module JavaFX1 {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires java.prefs;
    requires jakarta.xml.bind;
    exports seedu.address;
    exports seedu.address.util;
    opens seedu.address.view;
    opens seedu.address.model to jakarta.xml.bind;
}