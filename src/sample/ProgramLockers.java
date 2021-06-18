package sample;

import com.intelligt.modbus.jlibmodbus.serial.SerialPortException;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

public class ProgramLockers implements Initializable {
    @FXML private Button backButton, programLocker, cycleProgram;
    @FXML private TextField programLockerField, cycleProgramField;
    int i = 0;
    LockersController lockersController;
    Timer timer = new Timer();


    @FXML TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {
            if(i<=50){
                try {
                    int[] registerData = lockersController.readDataFromRegister(i, 0x0A,1);
                    Thread.sleep(5);
                    if(registerData[0]==96 || registerData[0]==0){
                        Integer valueToWrite = Integer.valueOf(programLockerField.getText());
                        lockersController.writeDataToRegister(i,600,new int[]{0x0600});
                        System.out.println("Locker "+i);
                        Thread.sleep(5);
                        lockersController.writeDataToRegister(5,0x0A,new int[]{0xFB5A});
                    }
                }catch (ClassCastException | InterruptedException e){
                    System.out.println("Error"+e.getMessage());
                }
                i++;
            }else {
                timer.cancel();
                i=0;
            }

        }
    };
    public void programLocker() throws SerialPortException, InterruptedException {
        timer.schedule(timerTask,50,50);
    }
    public void backToMainMenu()  {
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            lockersController = new LockersController();
        } catch (SerialPortException e) {
            e.printStackTrace();
        }
    }
}
