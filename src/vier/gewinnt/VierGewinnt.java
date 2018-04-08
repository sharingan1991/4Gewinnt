package vier.gewinnt;
/**
 *
 * @author Sen Schwarz
 */
public class VierGewinnt{


        public static void main(String[] args){
        Spielfeld sf = new Spielfeld(6,7);
        
        System.out.println(sf);
        
        sf.reset();
        
        System.out.println(sf);
        
        int spielerzahl=1;
        
        for (int i = 0; i < 6; i++){ // i = Zeilen
		
            for (int j = 0; j < 7; j++){ // j = Spalten
		
		sf.Spielzug(j, spielerzahl);
                spielerzahl = 3 - spielerzahl;
            }

        }
       
        System.out.println(sf.SpielbrettVoll());
        
        
  
        
        System.out.println(sf);
        }
     
        

}
        
