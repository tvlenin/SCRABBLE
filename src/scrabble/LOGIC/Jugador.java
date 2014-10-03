package scrabble.LOGIC;

import scrabble.EstructurasDeDatos.Lista;
import scrabble.EstructurasDeDatos.Nodo;

/**
 * Clase en la que se gestionaran los datos referentes a los jugadores, 
 * Se crea una lista para almacenar las fichas que posee cada jugador, se gestionan los turnos, 
 * La cantidad de jugadores y el puntaje de los jugadores durante la partida. 
 * @author abrahamon
 */
public class Jugador extends Bolsa {
    
    private int puntajeJugador;
    private int ptSorteoTurnos;
    private int turno;
    private int nTurnosSaltados;
    private String palabra = "";
    //public static Diccionario dic = new Diccionario();
    private Lista<Ficha> _fichas;
    
    
    /**
     * Metodo contructor de la clase Jugador en el que se asignan valores a algunas variables que se utilizaran en otros metodos
     * @author abrahamon
     */
    public Jugador(){
        nTurnosSaltados = 0;
        ptSorteoTurnos = 0;
        puntajeJugador = 0;
        _fichas = new Lista<> ();
        for (int i = 0; i < 7; i++){
            Nodo<Ficha> fichasJugador = super.listaFichas.getAndQuitarElementoAzar();
            _fichas.insertarFinal(fichasJugador.getDato());
            
            
        }
        //System.out.println(super.listaFichas.getTalla());
        
        
        
    }
    
    
    /**
    * Metodo para sacar una fichas de la bolsa,
    * La cual sera utilizada para establecer el orden del juego.
    * @return Regresa los puntos que se utilizan para establecer el orden de la partida
    * @author abrahamon
    */
    public int sacarFichaParaSorteo(){
        char letraObetenida = super.listaFichas.mostrarElementoAzar().getDato().getCharData();
        ptSorteoTurnos =(int)letraObetenida;
        return ptSorteoTurnos;
    }
    
    /**
     * Metodo para obtener el numero del turno y el orden que se obtuvo en el sorteo
     * @return ptSorteoTurnos Valor de la ficha conseguida de la bolsa para determinar el turno.
     * @author abrahamon
     */
    public int getNumeroIndicaTurno(){
        return ptSorteoTurnos;
    }
    
    /**
     * Metodo para indicar el numero de turno que se esta realizando en ese momento en una ronda determinada.
     * @return turno Retorna el numero de turno que se esta produciendo
     * @author abrahamon
     */
    public int numeroJugador(){
        return this.turno;
    }
    
    
    public void setnumeroJugador(int turno){
        this.turno = turno;
    }
    
    /**
     * Metodo para establecer el puntaje que posee un jugador.
     * @author abrahamon
     */
    public void puntajeJugador(){
    }
   
    /**
     * Metodo con el que se obtiene la lista de las fichas que posee un jugador
     * @return listaFichas Lista con las fichas que posee un jugador para realizar una jugada
     * @author abrahamon
     */
    public Lista<Ficha> getListaFichas(){
        return listaFichas;
    }
    
    /**
     * Metodo por el cual se reliza una sumadel puntaje que posee un jugador, y el obtenido por su jugada
     * @param pData Puntaje obtenido al colocar una palabra en el tablero
     * @author abrahamon
     */
    public void sumarPuntaje(int pData){
        puntajeJugador = puntajeJugador + pData;
    }
   
    /**
     * Metodo en el que se puede conocer el numero de turnos que se han pasado en el juego
     * @return nTurnosSaltados Numero de turnsos que han sido pasados por los jugadores
     * @author abrahamon
     */
    public int getTurnosPasados(){
        return nTurnosSaltados;
    }
    
    /**
     * Metodo por medio del cual se puede verificar si la bolsa de fichas se encuentra vacia
     * @return boolean Retorna true si la bolsa se encuentra vacia, de lo contrario regresa false
     * @author abrahamon
     */
    public boolean revisarBolsaVacia(){
        if(bolsaVacia())
            return true;
        return false;
    }
    
    
}
