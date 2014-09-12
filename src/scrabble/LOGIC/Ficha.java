
package scrabble.LOGIC;

/**
 *
 * @author Abrahamon
 */
public class Ficha{
   String valor; 
   int puntaje;

   public Ficha(char pValor, char pPuntaje){
       this.puntaje=puntaje;
       this.valor=valor; 
   }
   
   public void getData(){
       System.out.println("Letra: "+valor+"; Puntaje: "+puntaje);
   }
    public void update() {
        System.out.println("SIRVE");
    }

  
}
