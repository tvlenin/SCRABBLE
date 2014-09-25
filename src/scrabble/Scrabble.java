package scrabble;
import scrabble.DATAIO.*;
import scrabble.EstructurasDeDatos.Lista;
import scrabble.EstructurasDeDatos.Nodo;
import scrabble.LOGIC.Bolsa;
import scrabble.LOGIC.Jugador;
import scrabble.LOGIC.Tablero;
import scrabble.LOGIC.TurnoSalida;

public class Scrabble extends Bolsa {
    
    private int cantidadJugadores = 4;
    private Lista <Jugador> listaJugadores = new Lista<>();
    private LeerTexto leer;
    private Tablero tablero;
    private int numJugador;
    private Bolsa bolsa;
    
    public Scrabble(){
        //this.preguntarQuienesJuegan();
       // this.sorteo();
        //sortear las 7 fichas para cada jugador
        
        
        Lista<String> lista = new Lista<>();
        
        this.primerTurno();
        /*
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
        int nJugadores = 4;
        Jugador jugadorNuevo;
        
        while(nJugadores>0){ //crear la cantidad de jugadores deseados y sacar una ficha
            jugadorNuevo = new Jugador();
            jugadorNuevo.sacarFichaParaSorteo();
            listaJugadores.insertar(jugadorNuevo);
            nJugadores--;
        }
        Nodo<Jugador> iterador = listaJugadores.getHead();
        while (iterador != null) {
            Nodo<Jugador> nodoComparar = iterador.getSiguiente();
            while(nodoComparar!= null){
                if(iterador.getDato().getNumeroIndicaTurno() < nodoComparar.getDato().getNumeroIndicaTurno()){
                    listaJugadores.intercambiarData(iterador, nodoComparar);
                }
                nodoComparar= nodoComparar.getSiguiente();
            }
            iterador = iterador.getSiguiente();
        }
    }
    
    
    public void primerTurno(){
        
    }

    public void turno(){}

    }

