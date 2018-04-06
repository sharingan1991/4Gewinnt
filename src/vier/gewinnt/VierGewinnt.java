package vier.gewinnt;
/**
 *
 * @author Sen Schwarz
 */
public class VierGewinnt{

    private final int [][] spielfeld = new int[6][7]; //Zeilen - Spalten
    private final Inputlistener listener;
    
    private boolean spieler = true; // Spieler1 = True, Spieler2= False
    private int zug;
    
        public VierGewinnt(){ //Konstruktor
            listener = new Inputlistener();
        }
   
        public void Spielstart(){
            Spielreset(this.spielfeld);
        }
    
        public int[][] Spielreset(int spielfeldleer[][]){       
            for (int j = 0; j < 5; j++) // j = Zeilen
		{
			for (int i = 0; i < 6; i++) // i = Spalten
			{
				spielfeldleer[j][i] = 9;
                        }
                }
            return spielfeldleer;
        }
    
        public int Spielereingabe(){
            int spalte=0; //dummy!!!!!
            return spalte;
        }
        
        public int gueltigeEingabe(){ //Gültigkeit der Abfrage
            int spalte;
            spalte = Spielereingabe();   
            int spaltennummer = spalte - 1; // -1 wegen Array
               while (0 > spaltennummer || spaltennummer >= 7){ // ungültige eingabe abfrage erneut
                   spalte = Spielereingabe();
                   spaltennummer = spalte - 1;
               }
               return spaltennummer;
        }
        
        public boolean volleSpalte (int spielfeld[][]) { //Return entspricht True = Spalte voll
       
            int spaltennummer = gueltigeEingabe();
            boolean spaltevoll = spielfeld[0][spaltennummer] != 9; 
                    
            return spaltevoll; 

        }
        
        public boolean SpielbrettVoll(int spielfeld[][]){ //Return entspricht True = Unentschieden
                
	  for (int i = 0; i <= 6; i++){
                if(spielfeld[0][i] != 9){
                    return true;
                }
            }
                    return false;
        }
        
        
        public int[][] Spielzug(int spielfeld[][], int spaltennummer) { //Setzen des Spielsteins
                
                int spielstein;
                
                if (this.spieler = true){
                    spielstein = 1; //Spieler1
                }
                else
                {
                    spielstein = 2; //Spieler2
                }
            
		for (int i = 5; i >= 0; i--)
		{
			if (spielfeld[i][spaltennummer] == 9){ // überprüft freie Stelle 
                                spielfeld[i][spaltennummer] = spielstein; // setzt Spielstein
				i = 0; 
			}
		}
		return spielfeld;
	}

		
				
	
        
        public void toggelSpieler(){
            this.spieler = !this.spieler;   
        }
        
        public boolean getAktuellerSpieler(){ //true = Spieler1
            return this.spieler;
        }
        
        public int getZugAnzahl(){
            return this.zug;
        }
        
        public static void main(String[] args){
        
        }
}
        
