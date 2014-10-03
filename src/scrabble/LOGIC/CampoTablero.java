package scrabble.LOGIC;

public class CampoTablero {
    private int multiple;       //Bonos que tenga este campo    
    private String ficha;       //se le puede colocar una letra       
    private int valorFicha;     //valor que tenga la letra que se coloco en este campo
    private String descripcion;
    private int pos;            //posicion respecto al tablero
    
    public CampoTablero( int pPos, int pMultiplicador, String pDescrip){
        this.multiple = pMultiplicador;
        this.ficha = null;
        this.valorFicha = 0;
        this.descripcion = pDescrip;
        this.pos = pPos;                 //posisicion [1 - 255] 
    }

    public int getPosicion(){
        return this.pos;
    }
    
    public void ponerFicha(Ficha pFicha){
        this.ficha = pFicha.getData();
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public int getMultiplicador(){
        return this.multiple;
    }
    
    
     
    
}
