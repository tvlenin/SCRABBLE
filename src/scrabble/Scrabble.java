package scrabble;
import GUI.PantallaPrincipal;
import scrabble.DATAIO.*;
import scrabble.EstructurasDeDatos.Lista;
import scrabble.EstructurasDeDatos.Nodo;
import scrabble.LOGIC.Bolsa;
import scrabble.LOGIC.Jugador;
import scrabble.LOGIC.Tablero;
import scrabble.LOGIC.TurnoSalida;

public class Scrabble extends Bolsa {
    
    
    private Lista <Jugador> listaJugadores = new Lista<>();
    private LeerTexto leer = new LeerTexto();
    private Tablero tablero;
    private Bolsa bolsa;
    Lista<String> listaDiccionario = leer("es_CR.dic");
    
    public Scrabble(){
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
        this.preguntarQuienesJuegan();
        
        this.primerTurno();//al cumplirse las condiciones llama a turno normal
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
    
    
    public void preguntarQuienesJuegan(){//caso en que a ==b
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
                if (iterador.getDato().getNumeroIndicaTurno() == nodoComparar.getDato().getNumeroIndicaTurno()){
                    iterador.getDato().sacarFichaParaSorteo();
                    iterador = listaJugadores.getHead();
                    
                }if(iterador.getDato().getNumeroIndicaTurno() < nodoComparar.getDato().getNumeroIndicaTurno()){
                    listaJugadores.intercambiarData(iterador, nodoComparar);
                }
                nodoComparar= nodoComparar.getSiguiente();
            }
            iterador = iterador.getSiguiente();
        } 
    }
    
    public void primerTurno(){
        boolean flag = true;
        while(flag){
            String codeArduino = "";

            Lista <Integer> listaPosiciones = new Lista <>();
            Lista <String> listaLetras = new Lista <>();
            listaPosiciones.insertar(113);
            listaLetras.insertar("a");
            String palabra = "";

            Nodo <String> iteradorDeString = listaLetras.getHead();
            Nodo <Integer> iteradorDePosiciones = listaPosiciones.getHead();
            
            while (iteradorDePosiciones != null){
                if (iteradorDePosiciones.getDato() == 113){
                    flag = false;
                }
             palabra = palabra + iteradorDeString.getDato();
             iteradorDeString = iteradorDeString.getSiguiente();
             iteradorDePosiciones = iteradorDePosiciones.getSiguiente();
            }
            if (listaDiccionario.buscar(palabra)){
                this.turno();
            }   
        }
        //this.primerTurno();   
    }

    public void turno(){}

    }

