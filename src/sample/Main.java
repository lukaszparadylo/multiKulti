package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Timer;
import java.util.TimerTask;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        root.setCursor(Cursor.DISAPPEAR);
        primaryStage.setTitle("Nyga tester");
        primaryStage.setScene(new Scene(root, 1024, 600));
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.show();
        //timer.schedule(timerTask,100,1000);

    }


    public static void main(String[] args) throws InterruptedException {

        //Thread.sleep(60000);
        launch(args);
    }
}
