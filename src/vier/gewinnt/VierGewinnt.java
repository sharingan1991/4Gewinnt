package vier.gewinnt;
/**
 *
 * @author Sen Schwarz
 */
public class VierGewinnt{

    private char spielfeld[][];
    private boolean spieler = true;
    
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
            this.spieler = spieler;
            this.spieler = !this.spieler;
            
        }
     
    
    
    
    
        public static void main(String[] args){
            new VierGewinnt();    
        }
}
        
