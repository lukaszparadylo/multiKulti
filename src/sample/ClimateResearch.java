package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ClimateResearch {
    @FXML
    Button backButton;

    public void backToMainMenu()  {
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();
    }
}
