package vier.gewinnt;
/**
 *
 * @author Sen Schwarz
 */
public class VierGewinnt{

    char[][] spielfeld = new char[7][6];
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
        
        public void toggelSpielzug(){
            this.spieler = !this.spieler;   
        }
     
    
    
    
    
        public static void main(String[] args){
            new VierGewinnt();    
        }
}
        
