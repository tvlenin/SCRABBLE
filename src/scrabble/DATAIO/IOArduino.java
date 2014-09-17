package scrabble.DATAIO;

public abstract class IOArduino {
    
    public IOArduino(){}
    
    public void comunicar(){
        System.out.println("Comunicando con arduino");
    }
    public int cuantosJugadores(){
        return 2;
    }

}
