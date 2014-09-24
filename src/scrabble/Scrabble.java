package scrabble;
import scrabble.DATAIO.*;
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
        
        
        leer = new LeerTexto();    
        tablero = new Tablero();
        listaJugadores= new Lista<>();
        Jugador jugador;
        
        while (cantidadJugadores > 0){
            jugador = new Jugador();
            listaJugadores.insertar(jugador);
            cantidadJugadores--;
        }
        this.sorteo();
        
        //TurnoSalida turnoSalida = new TurnoSalida();
    }
    
    public void sorteo(){
        Nodo<Jugador> tmpNodo = listaJugadores.getHead();
        while(tmpNodo != null){
            tmpNodo.getDato().sacarFichaParaSorteo();
            tmpNodo = tmpNodo.getSiguiente();
        }
    }

}
