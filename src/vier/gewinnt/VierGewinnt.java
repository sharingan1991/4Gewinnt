package vier.gewinnt;
/**
 *
 * @author Sen Schwarz
 */
public class VierGewinnt{

    private char[][] spielfeld = new char[7][6];
    private boolean spieler = true;
    
        public VierGewinnt(){
        
        }
   
        public void Spielstart(){
            Spielreset();
        }
    
        public void Spielreset(){
        
        }
    
        public void Spielereingabe(){
        
        }
        
        public void toggelSpielzug(){
            this.spieler = !this.spieler;   
        }
     
    
    
    
    
        public static void main(String[] args){
            new VierGewinnt();    
        }
}
        
