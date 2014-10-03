package scrabble.DATAIO;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.util.Enumeration;

 
 
public class IOArduino implements SerialPortEventListener {
    private int columna;
    private int fila;
    
    //lista con los observadores
  
    
    String valorArduino;
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
  System.out.println("ARDUINO HACIENDO DE LAS ");
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
 public synchronized void serialEvent() {
 // if (oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
   try {
        while (true){
            valorArduino = input.readLine();

            
        if (valorArduino.contains(",")){
            System.out.println(valorArduino);
            String valores[] = valorArduino.split(",");
            this.columna = Integer.parseInt(valores[0]);
            this.fila = Integer.parseInt(valores[1]);

        }
         if (valorArduino.contentEquals("10")){
            System.out.println("10");
            return;
            
        
        }
          if (valorArduino.contentEquals("9")){
            System.out.println("9");
            return;
            
        
        }
           if (valorArduino.contentEquals("8")){
            System.out.println("8");
            return;
            
        
        }
        
        if (valorArduino.contentEquals("7")){
            System.out.println("7");
            return;
            
        
        }
        if (valorArduino.contentEquals("6")){
            System.out.println("6");
            return;
            
        
        }
        if (valorArduino.contentEquals("5")){
            System.out.println("5");
            return;
            
        
        }
           if (valorArduino.contentEquals("4")){
            System.out.println("4");
            return;
            
        
        }
            if (valorArduino.contentEquals("3")){
            System.out.println("3");
            return;
            
        
        }
             if (valorArduino.contentEquals("2")){
            System.out.println("2");
            return;
            
        
        }
              if (valorArduino.contentEquals("1")){
            System.out.println("1");
            return;
            
        
        }
        }
    
    
    
    
   } catch (Exception e) {
    System.err.println(e.toString());
   //}
  }
  // Ignore all the other eventTypes, but you should consider the other ones.
 }
    public String getParOrdenado(){
        //this.initialize();
     return fila+"."+columna;
    }

    @Override
    public void serialEvent(SerialPortEvent spe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getDato(){
        this.serialEvent();
        return this.valorArduino;
    }
 
}
 
 