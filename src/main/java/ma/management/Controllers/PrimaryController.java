package ma.management.Controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import ma.management.App;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
