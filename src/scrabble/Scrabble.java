package scrabble;
import scrabble.DATAIO.*;
import scrabble.DATAIO.IOArduino;
import scrabble.EstructurasDeDatos.Lista;
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
        leer.leer("es_CR.dic");
        
        while (cantidadJugadores > 0){
            jugador = new Jugador();
            listaJugadores.insertar(jugador);
            cantidadJugadores--;
        }
        listaJugadores.getHead().getDato().sacarFichaParaSorteo();
        //System.out.println(listaJugadores.getHead().getDato().getNumeroIndicaTurno());
        
        
        
        
       
        
        
        //TurnoSalida turnoSalida = new TurnoSalida();
        
    }

}
