package scrabble;
import GUI.PantallaPrincipal;
import scrabble.DATAIO.*;
import scrabble.EstructurasDeDatos.Lista;
import scrabble.EstructurasDeDatos.Nodo;
import scrabble.LOGIC.Bolsa;

import scrabble.LOGIC.Ficha;
import scrabble.LOGIC.Jugador;
import scrabble.LOGIC.Tablero;
public class Scrabble extends Bolsa {
    
    private int cantidadJugadores = 1;
    private Lista <Jugador> listaJugadores = new Lista<>();
    private LeerTexto leer = new LeerTexto();
    private Tablero tablero = new Tablero();
    private Nodo<Jugador> nodoJugadorConElTurno;
    Lista<String> listaDiccionario = leer("es_CR.dic");
    private int TurnosSaltadosSeguidos;
    
    public Scrabble(){
        this.TurnosSaltadosSeguidos = 0;
        this.preguntarQuienesJuegan();
        this.primerTurno(); //verificar que coloque una palabra en la ficha central
        this.preguntarQuienesJuegan();
        /*fin del juego 
            no hay que poner    ~turno sin jugador TODOSx2  ~ 6 pases e impugnaciones de todos  ~la bolsa vacia
                    
            -(fichas en el mazo)                            ~sumar al ganador todas las fichas
        */
        }
    
    
    public void preguntarQuienesJuegan(){//caso en que a ==b
        // se lee del arduino cuantos botones entran
        // se toca el boton del centro
        int nJugadores = 1;
        Jugador jugadorNuevo;
        
        while(nJugadores > 0){ //crear la cantidad de jugadores deseados y sacar una ficha
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
        boolean flag = true; //mientras no se coloque una palabra en la posicion correcta no se comienza.
        nodoJugadorConElTurno = listaJugadores.getHead();   
        while(flag){
            
            String palabra="perro";
            Lista <Ficha> listaFichasColocadas = nodoJugadorConElTurno.getDato().getListaFichas();
            //lectura del arduino, POS Mazo y POS tablero
            Lista<Integer> listaPosiciones = new Lista<>();
            listaPosiciones.insertar(113);
            
            for (Nodo<Ficha> iteradorDeLetras= listaFichasColocadas.getHead(); iteradorDeLetras != null; iteradorDeLetras = iteradorDeLetras.getSiguiente()){
                palabra = palabra+iteradorDeLetras.getDato().getData();
            }
            if (listaDiccionario.buscar(palabra)){
                for (Nodo<Integer> iteradorDePos = listaPosiciones.getHead(); iteradorDePos != null; iteradorDePos= iteradorDePos.getSiguiente()){
                    if (iteradorDePos.getDato() == 133){
                        asignarPtjJugador( listaFichasColocadas.getHead(), listaPosiciones.getHead());
                        
                        this.asignarPtjJugador(listaFichasColocadas.getHead(), listaPosiciones.getHead());
                        //quitar las fichas que coloco el jugador, añadir ptj respectivo y colocar en el tablero
                        nodoJugadorConElTurno = nodoJugadorConElTurno.getSiguiente();
                        this.turno();
                        flag = false;
                    }
                }
            }  
        }
        System.out.println("Mal colocada la primera ficha, voler colocar");
        this.primerTurno();   
    }
    
    public void turno(){
        
    }
    
    //solo en caso de que se coloque una palabra correctamente se llama a este metodo
    public void asignarPtjJugador(Nodo<Ficha> iteradorFichas,Nodo<Integer> iteradorPos)
    {//sus argumentos: 2 listas simetricas, primera con letra colocada y segunda con posicion colocada
        int bonusPorPalabra =1;
        int bonusPorLetra=1;
        int puntajePalabra= 0;
        while(iteradorFichas != null && iteradorPos != null){
            bonusPorLetra = 1; 
            if( tablero.getDescripcionPosX(iteradorPos.getDato()) == "l" ){
                bonusPorLetra = tablero.getBonusPosX(iteradorPos.getDato());
            }
            if( tablero.getDescripcionPosX(iteradorPos.getDato()) == "p" ){
                bonusPorPalabra= bonusPorPalabra*tablero.getBonusPosX(iteradorPos.getDato());
            }
            puntajePalabra = puntajePalabra + bonusPorLetra;
            iteradorFichas = iteradorFichas.getSiguiente();
            iteradorPos = iteradorPos.getSiguiente();
        }
        puntajePalabra = puntajePalabra*bonusPorPalabra;
        nodoJugadorConElTurno.getDato().sumarPuntaje(puntajePalabra); 
    }
    public void verificarFinJuego(){}
    }

