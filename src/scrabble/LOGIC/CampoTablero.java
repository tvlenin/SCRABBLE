package scrabble.LOGIC;

public class CampoTablero {
    private int multiple;    
    private String ficha;
    private int valorFicha;
    private String descripcion;
    private int pos;
    public CampoTablero( int pos, int multiplicador, String descrip){
        this.multiple = multiplicador;
        this.ficha = "";
        this.valorFicha = 0;
        this.descripcion = descrip;
        this.pos = pos;
        
    }
    public int getPosicion(){
        return this.pos;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public int getMultiplicador(){
        return this.multiple;
    }
     
    
}
