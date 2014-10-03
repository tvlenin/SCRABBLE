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
    
    private int cantidadJugadores = 0;
    private Lista <Jugador> listaJugadores = new Lista<>();
    private LeerTexto leer = new LeerTexto();
    private Tablero tablero = new Tablero();
    private Nodo<Jugador> nodoJugadorConElTurno;
    Lista<String> listaDiccionario = leer("es_CR.dic");
    private int TurnosSaltadosSeguidos;
    private IOArduino ardu = new IOArduino();
    Thread hilo;
    String arduinoooo;
    
    public Scrabble(){
        ardu.initialize();
        this.TurnosSaltadosSeguidos = 0;
        this.preguntarQuienesJuegan();
        this.primerTurno();
        
        }
    
    
    public void preguntarQuienesJuegan(){//caso en que a ==b
        // se lee del arduino cuantos botones entran
        // se toca el boton del centro
        
        int nJugadoresCreados = ardu.getUltimoBotonP();
        //System.out.println(nJugadoresCreados);
        Jugador jugadorNuevo;
        
        while(nJugadoresCreados >= 1 && nJugadoresCreados < 5){ //crear la cantidad de jugadores deseados y sacar una ficha
            jugadorNuevo = new Jugador();
            jugadorNuevo.sacarFichaParaSorteo();
            listaJugadores.insertar(jugadorNuevo);
            nJugadoresCreados--;
            this.cantidadJugadores++;
        }
        Nodo<Jugador> iterador = listaJugadores.getHead();
        while (iterador != null) {
            Nodo<Jugador> nodoComparar = iterador.getSiguiente();
            while(nodoComparar!= null){
                if (iterador.getDato().getNumeroIndicaTurno() == nodoComparar.getDato().getNumeroIndicaTurno()){
                    iterador.getDato().sacarFichaParaSorteo();
                    iterador = listaJugadores.getHead();
                    
                }if(iterador.getDato().getNumeroIndicaTurno() < nodoComparar.getDato().getNumeroIndicaTurno()){
                    listaJugadores.intercambiarDataNOUSAR(iterador, nodoComparar);
                }
                nodoComparar= nodoComparar.getSiguiente();
            }
            iterador = iterador.getSiguiente();
        }
//        System.out.println(nodoJugadorConElTurno.getDato().getListaFichas().getHead().getDato().getCharData());
//        System.out.println(nodoJugadorConElTurno.getDato().getListaFichas().getHead().getSiguiente().getDato().getCharData());
//        System.out.println(nodoJugadorConElTurno.getDato().getListaFichas().getHead().getSiguiente().getSiguiente().getDato().getCharData());
//        System.out.println(nodoJugadorConElTurno.getDato().getListaFichas().getHead().getSiguiente().getSiguiente().getSiguiente().getDato().getCharData());
//        System.out.println(nodoJugadorConElTurno.getDato().getListaFichas().getHead().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getDato().getCharData());
//        System.out.println(nodoJugadorConElTurno.getDato().getListaFichas().getHead().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getDato().getCharData());
//        System.out.println(nodoJugadorConElTurno.getDato().getListaFichas().getHead().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getDato().getCharData());
//        
//System.out.println("termine de pregunta quenes juegan");
    }
    
    public void primerTurno(){
        boolean flag = true; //mientras no se coloque una palabra en la posicion correcta no se comienza.
        nodoJugadorConElTurno = listaJugadores.getHead();
        int inputArduino = 0;
        Lista<Integer> listaPosiciones = new Lista<>();
        Lista<String> listaPares = new Lista<>();
        
        while(inputArduino != 9){
            String a = ardu.getParOrdenado();
            inputArduino = ardu.getUltimoBotonP();
            System.out.println(a);
            listaPosiciones.insertarFinal(inputArduino);
            listaPares.insertar(a);
        }
        
        while(flag){
            String palabra = "";
            Lista <Ficha> listaFichasColocadas = nodoJugadorConElTurno.getDato().getListaFichas();
            
            for(Nodo<Integer> iteradorPos= listaPosiciones.getHead(); iteradorPos != null; iteradorPos = iteradorPos.getSiguiente()){
                Nodo<Ficha> iterador = nodoJugadorConElTurno.getDato().getListaFichas().getDato();
                for(int a = 0;  a <= iteradorPos.getDato(); a++ ){
                    iterador = iterador.getSiguiente();
                }
                palabra = palabra+ iterador.getDato().getCharData();
            }
            System.out.println(palabra);
            if (listaDiccionario.buscar(palabra)){
                for (Nodo<Integer> iteradorDePos = listaPosiciones.getHead(); iteradorDePos != null; iteradorDePos= iteradorDePos.getSiguiente()){
                    if (iteradorDePos.getDato() == 133){
                        asignarPtjJugador( listaFichasColocadas.getHead(), listaPosiciones.getHead());
                        
                        this.asignarPtjJugador(listaFichasColocadas.getHead(), listaPosiciones.getHead());
                        
                        //quitar las fichas que coloco el jugador y colocar en el tablero
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
        System.out.println("llegue a turno");
        boolean flag = true;
        //while(flag){
            String palabra="perro";
            Lista <Ficha> listaFichasColocadas = nodoJugadorConElTurno.getDato().getListaFichas();
            Lista<Integer> listaPosiciones = new Lista<>();//lista con todas las posiciones donde se coloco una ficha
            listaPosiciones.insertar(113);
            
            
        //}
        if(this.terminoElJuego()){
            this.finJuego();
        }
        if (nodoJugadorConElTurno == listaJugadores.getTail())
            nodoJugadorConElTurno = listaJugadores.getHead();
        else
            nodoJugadorConElTurno = nodoJugadorConElTurno.getSiguiente();
    }
    
    public void finJuego(){}
    
    public boolean terminoElJuego(){
        if(TurnosSaltadosSeguidos >= cantidadJugadores*2)
            return true;
        for (Nodo<Jugador> iterador = listaJugadores.getHead(); iterador != null; iterador = iterador.getSiguiente()){
            if(iterador.getDato().getTurnosPasados() < 6)
                return false;
        }
        if (nodoJugadorConElTurno.getDato().revisarBolsaVacia())
            return true;
        return false;
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
}
