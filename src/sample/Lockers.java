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

public class Lockers {
    LockersController container;
    @FXML
    Button backButton;
    @FXML
    Button openOne, openAll, checkAll, programLockers, changeLockersParameters, tryDestroy;

    public void backToMainMenu()  {
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();
    }
    public void openOne() throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("openOne.fxml"));
        root.setCursor(Cursor.DISAPPEAR);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Lockers mode");
        stage.setScene(new Scene(root, 1024, 600));
        stage.show();
    }
    public void openAll() throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("openAll.fxml"));
        root.setCursor(Cursor.DISAPPEAR);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Open all");
        stage.setScene(new Scene(root, 1024, 600));
        stage.show();
    }
    public void programLockers() throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("programLockers.fxml"));
        root.setCursor(Cursor.DISAPPEAR);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Program lockers");
        stage.setScene(new Scene(root, 1024, 600));
        stage.show();
    }
}

