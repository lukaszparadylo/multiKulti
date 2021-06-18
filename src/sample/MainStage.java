package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MainStage {

    @FXML
    Button closeProgram;

    @FXML
    public void goToLockerModule() throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("lockers.fxml"));
        root.setCursor(Cursor.DISAPPEAR);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Lockers mode");
        stage.setScene(new Scene(root, 1024, 600));
        stage.show();
    }
    @FXML
    public void goToExpanderModule() throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("expander.fxml"));
        root.setCursor(Cursor.DISAPPEAR);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Expander mode");
        stage.setScene(new Scene(root, 1024, 600));
        stage.show();
        //stage.setFullScreen(true);
    }
    @FXML
    public void goToResearchModule() throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("climateResearch.fxml"));
        root.setCursor(Cursor.DISAPPEAR);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Research mode");
        stage.setScene(new Scene(root, 1024, 600));
        stage.show();
        //stage.setFullScreen(true);
    }
    @FXML
    public void exitProgram(){
        Stage stage = (Stage) closeProgram.getScene().getWindow();
        stage.close();
    }
}
