package scrabble;
import scrabble.DATAIO.*;
import scrabble.EstructurasDeDatos.Lista;
import scrabble.EstructurasDeDatos.Nodo;
import scrabble.LOGIC.Bolsa;
import scrabble.LOGIC.Jugador;
import scrabble.LOGIC.Tablero;
import scrabble.LOGIC.TurnoSalida;

/**
 * Clase en la que se manejara las acciones que involucran el funcionamiento general del programa.
 * @author abrahamon
 */
public class Scrabble {
    
    private int cantidadJugadores = 4; //Cantidad de jugadores que participaran en la partida
    private Lista <Jugador> listaJugadores = new Lista<>(); //Lista en la que se almacenaran los jugadores que participen de la partida
    private LeerTexto leer; 
    private Tablero tablero;
    private int numJugador = 1; // Inidica cual de los jugadores es el que esta en su turno
    
    /**
     * Metodo constructor de la clase Scrabble, en donde se pregunta la cantidad de jugadores que participaran, 
     * Se inicia el primer turno del juego y tambien se inician los turnos siguientes.
     * @author abrahamon
     */
    public Scrabble(){
        
        
        this.preguntarQuienesJuegan();
       // this.sorteo();
        //sortear las 7 fichas para cada jugador
        
        this.primerTurno();/*
            verificar que coloque una palabra en la ficha central
        */
        
        //while(true){
        this.turno();
        //}
        /*
            turno commun (2mins)
            jugada      ~        cambiar juego          ~   pasar turno
            verificar           y mezclar bolsa
            asignar puntaje                                 
                
        fin del juego 
            no hay que poner    ~turno sin jugador TODOSx2  ~ 6 pases e impugnaciones de todos  ~la bolsa vacia
                    
            -(fichas en el mazo)                            ~sumar al ganador todas las fichas
        */
        }
    
    /**
     * Metodo en el que se establece la cantidad de jugadores que participaran en la partida del juego.
     * @author abrahamon
     */
    public void preguntarQuienesJuegan(){
        // se lee del arduino cuantos botones entran
        // se toca el boton del centro
        
        while (numJugador <= 4){
            Jugador jugadorTmp = new Jugador(this.numJugador);
            listaJugadores.insertar(jugadorTmp);
            numJugador ++;
            System.out.println(listaJugadores.getHead().getDato().numeroJugador());
    
        }
    }
    
    /**
     * Metodo en el cual se realiza un sorteo de las siete fichas que tendran los jugadores al iniciar la partida.
     * @author abrahamon
     */
    public void sorteo(){
        Nodo<Jugador> tmpNodo = listaJugadores.getHead();
        while(tmpNodo != null){
            tmpNodo.getDato().sacarFichaParaSorteo();
            tmpNodo = tmpNodo.getSiguiente();
        }
    }
    
    /**
     * Metodo en el que se gestionara las acciones referentes al primer turno del juego,
     * El cual posee algunas caracteristicas distintas a los demas turnos del juego.
     * @author abrahamon
     */
    public void primerTurno(){
        
    }
    
    /**
     * Metodo en el que se gestinaran las tareas que son necesarias para el analisis, 
     * Y el desarrollo de los turnos del juego durante la partida, 
     * A excepcion del primer turno que posee caracteristicas distintas y debe analizarce por separado.
     * @author abrahamon
     */
    public void turno(){}
}
