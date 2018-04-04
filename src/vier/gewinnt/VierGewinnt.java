package vier.gewinnt;
/**
 *
 * @author Sen Schwarz
 */
public class VierGewinnt{

    private final char[][] spielfeld = new char[7][6]; //Spalten/Zeilen
    private final Inputlistener listener;
    
    private boolean spieler = true; // Spieler1 = True, Spieler2= False
    
        public VierGewinnt(){
            listener = new Inputlistener();
        }
   
        public void Spielstart(){
            Spielreset(this.spielfeld[][]);
        }
    
        public char[][] Spielreset(char spielfeld[][]){
        
            for (int j = 0; j < 6; j++) // j = Zeilen
		{
			for (int i = 0; i < 7; i++) // i = Spalten
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
        
