package scrabble.LOGIC;


import scrabble.DATAIO.LeerTexto;
import scrabble.EstructurasDeDatos.Lista;
import scrabble.EstructurasDeDatos.Nodo;

public abstract class Bolsa extends LeerTexto  {
    
    LeerTexto fichas = new LeerTexto();
    
    Lista <Ficha> listaFichas = new Lista <>();
    public Bolsa(){
        Lista <String> listaLecturaDeFichasTxt = fichas.leer("FICHAS.TXT");
        
        Nodo <String> tmpDataLista = listaLecturaDeFichasTxt.getHead();
        //System.out.println(tmpDataLista.getDato());
        
        while(tmpDataLista != null){
            String [] letra = tmpDataLista.getDato().split("_");
            Ficha ficha = new Ficha(Integer.parseInt(letra[0]),letra[1]);
            
            listaFichas.insertar(ficha);
            tmpDataLista = tmpDataLista.getSiguiente();           
        }
    }
    /*
    public int sacarFichaParaSorteo(){
        char letraObetenida = listaFichas.mostrarElementoAzar().getDato().getCharData();
        int ptSorteoTurnos =(int)letraObetenida;
        return ptSorteoTurnos;
    }*/
    
    public boolean bolsaVacia(){
        if (listaFichas.getTalla() == 0)
            return true;
        return false;
    }
    
    
    
}
