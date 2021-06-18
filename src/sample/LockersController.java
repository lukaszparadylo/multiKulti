package sample;

import com.intelligt.modbus.jlibmodbus.exception.ModbusIOException;
import com.intelligt.modbus.jlibmodbus.exception.ModbusNumberException;
import com.intelligt.modbus.jlibmodbus.exception.ModbusProtocolException;
import com.intelligt.modbus.jlibmodbus.master.ModbusMaster;
import com.intelligt.modbus.jlibmodbus.master.ModbusMasterFactory;
import com.intelligt.modbus.jlibmodbus.serial.SerialParameters;
import com.intelligt.modbus.jlibmodbus.serial.SerialPort;
import com.intelligt.modbus.jlibmodbus.serial.SerialPortException;
import com.intelligt.modbus.jlibmodbus.utils.DataUtils;
import com.intelligt.modbus.jlibmodbus.utils.FrameEvent;
import com.intelligt.modbus.jlibmodbus.utils.FrameEventListener;

public class LockersController {

    SerialParameters sp;
    ModbusMaster modbusMaster;
    byte[] tab={1};
    FrameEvent frameEvent;

    LockersController() throws SerialPortException {
        this.sp = new SerialParameters();
        this.frameEvent = new FrameEvent(tab);
        setDefaultCommPortsParameters();
        setUpModbus();
        listener.frameReceivedEvent(frameEvent);
        listener.frameSentEvent(frameEvent);
    }
    public String setDefaultCommPortsParameters() {
        try {
            sp.setDevice("/dev/ttyUSB0");
            //sp.setDevice("COM8");
            sp.setBaudRate(com.intelligt.modbus.jlibmodbus.serial.SerialPort.BaudRate.BAUD_RATE_115200);
            sp.setDataBits(8);
            sp.setParity(SerialPort.Parity.NONE);
            sp.setStopBits(0);
        }catch (Exception e){
            System.out.println("Error "+e.getMessage());
            return e.getMessage();
        }
        return "Serialport setup OK";
    }
    public String setUpModbus() throws SerialPortException {
        try {
            modbusMaster = ModbusMasterFactory.createModbusMasterRTU(sp);
            modbusMaster.setResponseTimeout(10);
        }catch (SerialPortException e){
            System.out.println("Error "+e.getMessage());
            return e.getMessage();
        }
        return "Modbus master setup OK";
    }
    public String writeDataToRegister(int lockerAddress, int registerStartAddress, int[] dataToWrite){
        try {
            modbusMaster.connect();
            int[] data = dataToWrite;
            modbusMaster.writeMultipleRegisters(lockerAddress,registerStartAddress,data);
            modbusMaster.disconnect();
        }catch (ModbusIOException | ModbusNumberException | ModbusProtocolException  e){
            System.out.println("Error "+e.getMessage());
            return e.getMessage();
        }
        return "SuccessFull wrote data to "+registerStartAddress;
    }
    public int[] readDataFromRegister(int lockerAddress, int registerStartAddress, int quantity){
        int[] data = new int[]{-1};
        try {
            modbusMaster.connect();
            data = modbusMaster.readHoldingRegisters(lockerAddress, registerStartAddress, quantity);
            modbusMaster.disconnect();
        }catch (ModbusIOException | ModbusNumberException | ModbusProtocolException  e){
            System.out.println("Error "+e.getMessage());
            //data = new int[]{0};
        }
        return data;
    }
    public void modbusGetOrSetData() throws SerialPortException, ModbusIOException, ModbusNumberException, ModbusProtocolException, InterruptedException {

        try {
            modbusMaster.connect();
            int[] tab = {0xFB5A};
            modbusMaster.writeMultipleRegisters(0x23,0x0A,tab);
            modbusMaster.disconnect();
        }catch (ModbusIOException | ModbusNumberException | ModbusProtocolException  e){
            System.out.println("Error "+e.getMessage());
        }
    }

    FrameEventListener listener = new FrameEventListener() {
        @Override
        public void frameSentEvent(FrameEvent event) {
            System.out.println("frame sent " + DataUtils.toAscii(event.getBytes()));
        }
        @Override
        public void frameReceivedEvent(FrameEvent event) {
            System.out.println("frame recv " + DataUtils.toAscii(event.getBytes()));
        }
    };
}
