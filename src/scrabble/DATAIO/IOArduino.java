package scrabble.DATAIO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.util.Enumeration;
 
/**
 * Clase en la que se manejan las operaciones relacionadas con los datos del Arduino
 * @author tvlenin
 */ 
public class IOArduino implements SerialPortEventListener {
    private int columna;
    private int fila;
    
    SerialPort serialPort;
        /** The port we're normally going to use. */
 private static final String PORT_NAMES[] = {
                        "/dev/ttyACM0", //for Ubuntu
   "/dev/tty.usbserial-A9007UX1", // Mac OS X
   "/dev/ttyUSB0", // Linux
   "COM3", // Windows
 };
 
 /**
 * A BufferedReader which will be fed by a InputStreamReader
 * converting the bytes into characters
 * making the displayed results codepage independent
 */
 private BufferedReader input;
 /** The output stream to the port */
 private OutputStream output;
 /** Milliseconds to block while waiting for port open */
 private static final int TIME_OUT = 2000;
 /** Default bits per second for COM port. */
 private static final int DATA_RATE = 9600;
 
 public void initialize() {
  CommPortIdentifier portId = null;
  Enumeration portEnum = CommPortIdentifier.getPortIdentifiers();
 
  //First, Find an instance of serial port as set in PORT_NAMES.
  while (portEnum.hasMoreElements()) {
   CommPortIdentifier currPortId = (CommPortIdentifier) portEnum.nextElement();
   for (String portName : PORT_NAMES) {
    if (currPortId.getName().equals(portName)) {
     portId = currPortId;
     break;
    }
   }
  }
  if (portId == null) {
   System.out.println("Could not find COM port.");
   return;
  }
 
  try {
   // open serial port, and use class name for the appName.
   serialPort = (SerialPort) portId.open(this.getClass().getName(),
     TIME_OUT);
 
   // set port parameters
   serialPort.setSerialPortParams(DATA_RATE,
     SerialPort.DATABITS_8,
     SerialPort.STOPBITS_1,
     SerialPort.PARITY_NONE);
 
   // open the streams
   input = new BufferedReader(new InputStreamReader(serialPort.getInputStream()));
   output = serialPort.getOutputStream();
 
   // add event listeners
   serialPort.addEventListener(this);
   serialPort.notifyOnDataAvailable(true);
  } catch (Exception e) {
   System.err.println(e.toString());
  }
 }
 
 /**
  * This should be called when you stop using the port.
  * This will prevent port locking on platforms like Linux.
  */
 public synchronized void close() {
  if (serialPort != null) {
   serialPort.removeEventListener();
   serialPort.close();
  }
 }
 
 /**
  * Handle an event on the serial port. Read the data and print it.
     * @param oEvent
  */
 public synchronized void serialEvent(SerialPortEvent oEvent) {
  if (oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
   try {
    String valorArduino = input.readLine();
        if (valorArduino.contains(",")){
            getParOrdenado(valorArduino);
        }
    
    
    
    System.out.println(valorArduino);
   } catch (Exception e) {
    System.err.println(e.toString());
   }
  }
  // Ignore all the other eventTypes, but you should consider the other ones.
 }
 public String getParOrdenado(String par){
    return par; 
 }
 
}
 
 