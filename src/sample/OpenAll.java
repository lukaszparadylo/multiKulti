package sample;
import com.intelligt.modbus.jlibmodbus.serial.SerialPortException;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.net.URL;
import java.util.*;


public class OpenAll implements Initializable, EventHandler<ActionEvent> {
    LockersController lockersController;

    @FXML private Button openBtn, backButton, box1Btn, box2Btn, box3Btn, box4Btn, box5Btn, box6Btn, box7Btn, box8Btn, box9Btn, box10Btn, box11Btn, box12Btn, box13Btn, box14Btn, box15Btn,
            box16Btn, box17Btn, box18Btn, box19Btn, box20Btn,box21Btn, box22Btn, box23Btn, box24Btn, box25Btn, box26Btn, box27Btn, box28Btn, box29Btn, box30Btn, box31Btn, box32Btn,
            box33Btn, box34Btn, box35Btn, box36Btn, box37Btn, box38Btn, box39Btn, box40Btn, box41Btn, box42Btn, box43Btn, box44Btn, box45Btn,box46Btn, box47Btn, box48Btn,
            box49Btn, box50Btn;

    @FXML private Label label = new Label();

    Timer timer = new Timer();
    int i = 0;
    List<Integer> listLockersToOpen;

    @FXML TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {

            if(i<=50){
                try {
                    int[] registerData = lockersController.readDataFromRegister(i, 0x0A,1);
                    Platform.runLater(() -> label.setText(String.valueOf(registerData[0])));
                    switch (i){
                        case 1:
                            Platform.runLater(() -> box1Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box1Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box1Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 2:
                            Platform.runLater(() -> box2Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box2Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box2Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 3:
                            Platform.runLater(() -> box3Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box3Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box3Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 4:
                            Platform.runLater(() -> box4Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box4Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box4Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 5:
                            Platform.runLater(() -> box5Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box5Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box5Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 6:
                            Platform.runLater(() -> box6Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box6Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box6Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 7:
                            Platform.runLater(() -> box7Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box7Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box7Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 8:
                            Platform.runLater(() -> box8Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box8Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box8Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 9:
                            Platform.runLater(() -> box9Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box9Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box9Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 10:
                            Platform.runLater(() -> box10Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box10Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box10Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 11:
                            Platform.runLater(() -> box11Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box11Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box11Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 12:
                            Platform.runLater(() -> box12Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box12Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box12Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 13:
                            Platform.runLater(() -> box13Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box13Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box13Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 14:
                            Platform.runLater(() -> box14Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box14Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box14Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 15:
                            Platform.runLater(() -> box15Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box15Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box15Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 16:
                            Platform.runLater(() -> box16Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box16Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box16Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 17:
                            Platform.runLater(() -> box17Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box17Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box17Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 18:
                            Platform.runLater(() -> box18Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box18Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box18Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 19:
                            Platform.runLater(() -> box19Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box19Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box19Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 20:
                            Platform.runLater(() -> box20Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box20Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box20Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 21:
                            Platform.runLater(() -> box21Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box21Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box21Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 22:
                            Platform.runLater(() -> box22Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box22Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box22Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 23:
                            Platform.runLater(() -> box23Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box23Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box23Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 24:
                            Platform.runLater(() -> box24Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box24Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box24Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 25:
                            Platform.runLater(() -> box25Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box25Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box25Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 26:
                            Platform.runLater(() -> box26Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box26Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box26Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 27:
                            Platform.runLater(() -> box27Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box27Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box27Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 28:
                            Platform.runLater(() -> box28Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box28Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box28Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 29:
                            Platform.runLater(() -> box29Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box29Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box29Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 30:
                            Platform.runLater(() -> box30Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box30Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box30Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 31:
                            Platform.runLater(() -> box31Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box31Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box31Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 32:
                            Platform.runLater(() -> box32Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box32Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box32Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 33:
                            Platform.runLater(() -> box33Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box33Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box33Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 34:
                            Platform.runLater(() -> box34Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box34Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box34Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 35:
                            Platform.runLater(() -> box35Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box35Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box35Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 36:
                            Platform.runLater(() -> box36Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box36Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box36Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 37:
                            Platform.runLater(() -> box37Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box37Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box37Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 38:
                            Platform.runLater(() -> box38Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box38Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box38Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 39:
                            Platform.runLater(() -> box39Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box39Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box39Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 40:
                            Platform.runLater(() -> box40Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box40Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box40Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 41:
                            Platform.runLater(() -> box41Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box41Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box41Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 42:
                            Platform.runLater(() -> box42Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box42Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box42Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 43:
                            Platform.runLater(() -> box43Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box43Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box43Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 44:
                            Platform.runLater(() -> box44Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box44Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box44Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 45:
                            Platform.runLater(() -> box45Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box45Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box45Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 46:
                            Platform.runLater(() -> box46Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box46Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box46Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 47:
                            Platform.runLater(() -> box47Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box47Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box47Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 48:
                            Platform.runLater(() -> box48Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box48Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box48Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 49:
                            Platform.runLater(() -> box49Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box49Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box49Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                        case 50:
                            Platform.runLater(() -> box50Btn.setVisible(true));
                            if(registerData[0]==-1){
                                Platform.runLater(() -> box50Btn.setDisable(true));
                            }else {
                                Platform.runLater(() -> box50Btn.setDisable(false));
                                listLockersToOpen.add(i);
                            }
                            break;
                    }

                }catch (ClassCastException e){
                    System.out.println("Error"+e.getMessage());
                }
                //box1Btn.setText(String.valueOf(registerData[0]));
                //box1Btn.setVisible(true);
                i++;
            }else {
                timer.cancel();
                i=0;
                if(listLockersToOpen.size()>0){
                    for(Integer i : listLockersToOpen){
                        lockersController.writeDataToRegister(i,0x0A,new int[]{0xFB5A});
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }else {
                    System.out.println("There is no box to open");
                }

            }
            System.out.println(i);
        }
    };
    public void changeData(){
        System.out.println("caascac");
    }

    public void findAllLockers() throws InterruptedException {
        timer.schedule(timerTask,50,50);
    }

    public void open(){
        lockersController.writeDataToRegister(35,0x0A,new int[]{0xFB5A});
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            lockersController = new LockersController();
        } catch (SerialPortException e) {
            e.printStackTrace();
        }
        listLockersToOpen = new ArrayList<>();
        box1Btn.setVisible(false);
        box2Btn.setVisible(false);
        box3Btn.setVisible(false);
        box4Btn.setVisible(false);
        box5Btn.setVisible(false);
        box6Btn.setVisible(false);
        box7Btn.setVisible(false);
        box8Btn.setVisible(false);
        box9Btn.setVisible(false);
        box10Btn.setVisible(false);
        box11Btn.setVisible(false);
        box12Btn.setVisible(false);
        box13Btn.setVisible(false);
        box14Btn.setVisible(false);
        box15Btn.setVisible(false);
        box16Btn.setVisible(false);
        box17Btn.setVisible(false);
        box18Btn.setVisible(false);
        box19Btn.setVisible(false);
        box20Btn.setVisible(false);
        box21Btn.setVisible(false);
        box22Btn.setVisible(false);
        box23Btn.setVisible(false);
        box24Btn.setVisible(false);
        box25Btn.setVisible(false);
        box26Btn.setVisible(false);
        box27Btn.setVisible(false);
        box28Btn.setVisible(false);
        box29Btn.setVisible(false);
        box30Btn.setVisible(false);
        box31Btn.setVisible(false);
        box32Btn.setVisible(false);
        box33Btn.setVisible(false);
        box34Btn.setVisible(false);
        box35Btn.setVisible(false);
        box36Btn.setVisible(false);
        box37Btn.setVisible(false);
        box38Btn.setVisible(false);
        box39Btn.setVisible(false);
        box40Btn.setVisible(false);
        box41Btn.setVisible(false);
        box42Btn.setVisible(false);
        box43Btn.setVisible(false);
        box44Btn.setVisible(false);
        box45Btn.setVisible(false);
        box46Btn.setVisible(false);
        box47Btn.setVisible(false);
        box48Btn.setVisible(false);
        box49Btn.setVisible(false);
        box50Btn.setVisible(false);
    }
    public void backToMainMenu()  {
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();
    }

    @Override
    public void handle(ActionEvent event) {
        String text = ((Button)event.getSource()).getText();
        Integer lockerId = Integer.valueOf(text);
        int[] boxStatus = lockersController.readDataFromRegister(lockerId, 0x0A,1);
        int[] deviceName = lockersController.readDataFromRegister(lockerId, 3201,5);
        String integerToHex = Integer.toHexString(deviceName[0]);
        String hexName1 = String.valueOf(deviceName[0]);
        String hexName2 = String.valueOf(deviceName[1]);
        String hexName3 = String.valueOf(deviceName[2]);
        String hexName4 = String.valueOf(deviceName[3]);
        String hexName5 = String.valueOf(deviceName[4]);
        String hexName6 = String.valueOf(deviceName[5]);
        hexToAscii(hexName1);
        //System.out.println(lockersController.hexToAscii(hexName1+hexName2+hexName3+hexName4+hexName5));
        System.out.println("gjhfjfjf");
        //Platform.runLater(() -> label.setText());
        lockersController.readDataFromRegister(lockerId, 0x0A,1);
        //lockersController.writeDataToRegister(lockerId,0x0A,new int[]{0xFB5A});
    }
    public String hexToAscii(String hexStr) {
        StringBuilder output = new StringBuilder("");

        for (int i = 0; i < hexStr.length(); i += 2) {
            String str = hexStr.substring(i, i + 2);
            output.append((char) Integer.parseInt(str, 16));
        }

        return output.toString();
    }
}
