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
    private Lista <Jugador> listaJugadores = new Lista<>();
    private LeerTexto leer;
    private Tablero tablero;
    private int numJugador;
    private Bolsa bolsa;
    
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
    
    
    public void preguntarQuienesJuegan(){
        // se lee del arduino cuantos botones entran
        // se toca el boton del centro
        
        while (numJugador <= 4){
            Jugador jugadorTmp = new Jugador(bolsa.sacarFichaParaSorteo());
            listaJugadores.insertar(jugadorTmp);
            
            System.out.println(listaJugadores.getHead().getDato().numeroJugador());
            numJugador ++;
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
