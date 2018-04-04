package vier.gewinnt;
/**
 *
 * @author Sen Schwarz
 */
public class VierGewinnt{

    private final char[][] spielfeld = new char[7][6];
    private boolean spieler = true;
    private final Inputlistener listener;
    
        public VierGewinnt(){
            listener = new Inputlistener();
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
        
