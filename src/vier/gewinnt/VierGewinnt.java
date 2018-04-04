package vier.gewinnt;
/**
 *
 * @author Sen Schwarz
 */
public class VierGewinnt{

    private char spielfeld[][];
    private static boolean spieler = true;
    
        private VierGewinnt(){
        
        }
   
        private static void Spielstart(){
            Spielreset();
        }
    
        private static void Spielreset(){
        
        }
    
        private static void Spielereingabe(){
        
        }
        
        public static void setSpielzug(boolean spieler){
            VierGewinnt.spieler = spieler;
            VierGewinnt.spieler = !VierGewinnt.spieler;
            
        }
     
    
    
    
    
        public static void main(String[] args){
            new VierGewinnt();    
        }
}
        
