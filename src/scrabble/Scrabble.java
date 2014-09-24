package scrabble;
import scrabble.DATAIO.*;
import scrabble.DATAIO.IOArduino;
import scrabble.EstructurasDeDatos.Lista;
import scrabble.EstructurasDeDatos.Nodo;
import scrabble.LOGIC.Bolsa;
import scrabble.LOGIC.Jugador;
import scrabble.LOGIC.Tablero;
import scrabble.LOGIC.TurnoSalida;

public class Scrabble {
    
    private int cantidadJugadores = 4;
    private Lista<Jugador> listaJugadores;
    private LeerTexto leer;
    private Tablero tablero;
    
    public Scrabble(){
        
        this.preguntarQuienesJuegan();
        this.sorteo();
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
    
    
    public void preguntarQuienesJuegan(){
        leer = new LeerTexto();    
        tablero = new Tablero();
        listaJugadores = new Lista<>();
        Jugador jugador;
        
        while (cantidadJugadores > 0){
            jugador = new Jugador();
            listaJugadores.insertar(jugador);
            cantidadJugadores -- ;
        }
    }
    
    public void sorteo(){
        Nodo<Jugador> tmpNodo = listaJugadores.getHead();
        while(tmpNodo != null){
            tmpNodo.getDato().sacarFichaParaSorteo();
            tmpNodo = tmpNodo.getSiguiente();
        }
    }
    
    public void primerTurno(){
        
    }

    public void turno(){}
}
