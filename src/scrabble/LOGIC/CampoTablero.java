package scrabble.LOGIC;

/**
 * Clase en la cual se administran las operaciones relacionadas con el tablero del juego
 * @author abrahamon
 */
public class CampoTablero {
    private int multiple;       //Bonos que tenga este campo    
    private String ficha;       //se le puede colocar una letra       
    private int valorFicha;     //valor que tenga la letra que se coloco en este campo
    private String descripcion;
    private int pos;            //posicion respecto al tablero
     
    /**
     * Metodo constructor de la clase CampoTablero, en el cual se evaluan los aspecto relacionados con los espacios del tablero,
     * Ya sea si el espacio se encuentra disponible, si el espacio cuenta con alguna bonificacion
     * @param pPos Posicion del espacio que se esta evalundo con respecto al tablero
     * @param pMultiplicador Bonos de puntuacion que posea el espacio que se esta evaluando
     * @param pDescrip Tipo de espacio que se esta evaluando, para saber si tiene bonificacion de palabra, de letra o sin bonificacion
     * @author tvlnin
     */
    public CampoTablero( int pPos, int pMultiplicador, String pDescrip){
        this.multiple = pMultiplicador;
        this.ficha = null;
        this.valorFicha = 0;
        this.descripcion = pDescrip;
        this.pos = pPos;                 //posisicion [1 - 255] 
    }

    /**
     * Metodo que obtiene la posicion que se esta evaluando es este momento
     * @return pos Posicion del espacio respecto al tablero de juego
     * @author tvlenin
     */
    public int getPosicion(){
        return this.pos;
    }
    
    /**
     * Metodo por medio del cual se coloca una ficha en el tablero de juego para formar una palabra
     * @param pFicha Valor de la ficha que se esta colocando en el tablero de juego
     * @author tvlenin
     */
    public void ponerFicha(Ficha pFicha){
        this.ficha = pFicha.getData();
    }
    
    /**
     * Metodo en el que se obtiene la descripcion de un espacio del tablero(tipo de bonificacion o disponibilidad)
     * @return descripcion Puede regresar distintos valores si el espacio del tablero tiene bonificacion o no, o si se encuentra ocupado
     * @author tvlenin
     */
    public String getDescripcion(){
        return this.descripcion;
    }
    
    /**
     * Metodo por el que se verifica el valor y tipo de multiplicador que posee un espacio del tablero
     * @return multiple El tipo de multiplicador de puntaje que posee el espacio
     * @author tvlenin
     */
    public int getMultiplicador(){
        return this.multiple;
    }
               
}
