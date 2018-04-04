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
   
        private void Spielstart(){
            Spielreset();
        }
    
        private void Spielreset(){
        
        }
    
        private void Spielereingabe(){
        
        }
        
        public void setSpielzug(boolean spieler){
            this.spieler = spieler;
            this.spieler = !this.spieler;
            
        }
     
    
    
    
    
        public static void main(String[] args){
            new VierGewinnt();    
        }
}
        
