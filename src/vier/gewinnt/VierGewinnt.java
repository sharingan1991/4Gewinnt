package vier.gewinnt;
/**
 *
 * @author Sen Schwarz
 */
public class VierGewinnt{

    private final char[][] spielfeld = new char[7][6];
    private final Inputlistener listener;
    
    private boolean spieler = true; // Spieler1 = True, Spieler2= False
    
        public VierGewinnt(){
            listener = new Inputlistener();
        }
   
        public void Spielstart(){
            Spielreset(this.spielfeld[][]);
        }
    
        public char[][] Spielreset(char spielfeld[][]){
        
            for (char j = 0; j < spielfeld.length; j++) // j = Zeilen
		{
			for (char i = 0; i < spielfeld[j].length; i++) // i = Spalten
			{
				spielfeld[j][i] = ('9');
                        }
                }
            return spielfeld;
        }
    
        public void Spielereingabe(){
        
        }
        
        

		
				
	
        
        public void toggelSpielzug(){
            this.spieler = !this.spieler;   
        }
        
        public boolean getSpieler(){
            return this.spieler;
        }
     
    
    
    
    
        public static void main(String[] args){
            new VierGewinnt();          
        }
}
        
