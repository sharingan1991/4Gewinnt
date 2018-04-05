package vier.gewinnt;
/**
 *
 * @author Sen Schwarz
 */
public class VierGewinnt{

    private final char [][] spielfeld = new char[7][6]; //Spalten - Zeilen
    private final Inputlistener listener;
    
    private boolean spieler = true; // Spieler1 = True, Spieler2= False
    
        public VierGewinnt(){
            listener = new Inputlistener();
        }
   
        public void Spielstart(){
            Spielreset(this.spielfeld[][]);
        }
    
        public char[][] Spielreset(char spielfeldleer[][]){       
            for (int j = 0; j < 6; j++) // j = Zeilen
		{
			for (int i = 0; i < 7; i++) // i = Spalten
			{
				spielfeldleer[j][i] = '9';
                        }
                }
            return spielfeldleer;
        }
    
        public void Spielereingabe(){
        
        }
        
        public char[][] spielzug(char spielfeld[][], int spaltennummer,
			boolean spieler) {
                
                char spielstein;
                
                if (spieler = true){
                    spielstein = '1'; //Spieler1
                }
                else
                {
                    spielstein = '2'; //Spieler2
                }
            
		for (int i = 5; i >= 0; i--)
		{
			if (spielfeld[i][spaltennummer] == '9'){ // überprüft freie Stelle 
                                spielfeld[i][spaltennummer] = spielstein;
				i = 0; 
			}
		}
		return spielfeld;
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
        
