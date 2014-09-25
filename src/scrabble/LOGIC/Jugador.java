package scrabble.LOGIC;

import scrabble.EstructurasDeDatos.Lista;
import scrabble.EstructurasDeDatos.Nodo;

public class Jugador extends Bolsa {
    
    private int ptSorteoTurnos;
    private int turno;
    
    public Jugador(){
        ptSorteoTurnos = 0;
        
        Lista<Ficha> _fichas = new Lista<> ();
        for (int i = 0; i < 7; i++){
            Nodo<Ficha> fichasJugador = super.listaFichas.getAndQuitarElementoAzar();
            _fichas.insertarFinal(fichasJugador.getDato());
            //System.out.println(fichasJugador.getDato().getData());
        }
        
        //System.out.println(super.listaFichas.getTalla());
        
    }
    //Es una lista donde se encontraran los valores correspondientes a cada ficha
    public Lista<Ficha> fichasJugador(){        
        return null;
    }
    
    public int sacarFichaParaSorteo(){
        char letraObetenida = super.listaFichas.mostrarElementoAzar().getDato().getCharData();
        ptSorteoTurnos =(int)letraObetenida;
        return ptSorteoTurnos;
    }
    
    public int getNumeroIndicaTurno(){
        return ptSorteoTurnos;
    }
    public int numeroJugador(){
        return this.turno;
    }
    public void setnumeroJugador(int turno){
        this.turno = turno;
    }
    
    public void puntajeJugador(){
    }

    
    
}
