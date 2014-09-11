
package scrabble.LOGIC;

/**
 *
 * @author Abrahamon
 */
public class Ficha{
   char valor; 
   int puntaje;

   public Ficha(char pValor, int pPuntaje){
       this.puntaje=pPuntaje;
       this.valor=pValor; 
   }
   
   public void getData(){
       System.out.println("Letra: "+valor+"; Puntaje: "+puntaje);
   }
    public void update() {
        System.out.println("SIRVE");
    }

  
}
