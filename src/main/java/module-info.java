module ma.management {
    requires javafx.controls;
    requires javafx.fxml;

    opens ma.management.Controllers to javafx.fxml;
    exports ma.management;
}
