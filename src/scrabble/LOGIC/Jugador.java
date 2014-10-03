package scrabble.LOGIC;

import scrabble.EstructurasDeDatos.Lista;
import scrabble.EstructurasDeDatos.Nodo;

public class Jugador extends Bolsa {
    
    private int puntajeJugador;
    private int ptSorteoTurnos;
    private int turno;
    private int nTurnosSaltados;
    private String palabra = "";
    //public static Diccionario dic = new Diccionario();
    private Lista<Ficha> _fichas;
    
    
    /**
     * Metodo contructor de la clase Jugador en el que se asignan valores a algunas variables que se utilizaran en otros metodos
     * @author abrahamon
     */
    public Jugador(){
        nTurnosSaltados = 0;
        ptSorteoTurnos = 0;
        puntajeJugador = 0;
        _fichas = new Lista<> ();
        for (int i = 0; i < 7; i++){
            Nodo<Ficha> fichasJugador = super.listaFichas.getAndQuitarElementoAzar();
            _fichas.insertarFinal(fichasJugador.getDato());
            //System.out.println(_fichas.getTail().getDato().getData());
            
            
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
   
    public Lista<Ficha> getListaFichas(){
        return _fichas;
    }
    
    public void sumarPuntaje(int pData){
        puntajeJugador = puntajeJugador + pData;
    }
   
    
    public int getTurnosPasados(){
        return nTurnosSaltados;
    }
    
    public boolean revisarBolsaVacia(){
        if(bolsaVacia())
            return true;
        return false;
    }
    
    
}
