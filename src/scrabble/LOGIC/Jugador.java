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
    
    private int ptSorteoTurnos;
    private int turno;

    /**
     * Metodo constructor de la clase Jugador en el que se crea una lista para almacenar las fichas de cada jugador,
     * Y se analiza el turno que se esta produciendo.
     * @param turnos Cantidad de turnos que ocurriran antes de acabar una ronda.
     * @author abrahamon
     */
    public Jugador(int turnos){
        ptSorteoTurnos = 0;
        this.turno = turnos;
        
        Lista<Ficha> _fichas = new Lista<> ();
        for (int i = 0; i < 7; i++){
            Nodo<Ficha> fichasJugador = super.listaFichas.getAndQuitarElementoAzar();
            _fichas.insertarFinal(fichasJugador.getDato());
            //System.out.println(fichasJugador.getDato().getData());
        }
        
        //System.out.println(super.listaFichas.getTalla());
        
    }
    
    /**
     * Metodo para sacar una fichas de la bolsa, 
     * La cual sera utilizada para establecer el orden del juego.
     * @author abrahamon
     */
    public void sacarFichaParaSorteo(){
        char letraObetenida = super.listaFichas.mostrarElementoAzar().getDato().getCharData();
        ptSorteoTurnos =(int)letraObetenida;
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

    
    
}
