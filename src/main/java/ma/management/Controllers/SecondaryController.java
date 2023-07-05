package ma.management.Controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import ma.management.App;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}