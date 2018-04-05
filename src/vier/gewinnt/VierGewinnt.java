package vier.gewinnt;
/**
 *
 * @author Sen Schwarz
 */
public class VierGewinnt{

    private final int [][] spielfeld = new int[7][6]; //Spalten - Zeilen
    private final Inputlistener listener;
    
    private boolean spieler = true; // Spieler1 = True, Spieler2= False
    private int Spaltennummer;
    private int zug;
    
        public VierGewinnt(){ //Konstruktor
            listener = new Inputlistener();
        }
   
        public static void Spielstart(){
            Spielreset(this.spielfeld[][]);
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
            int spalte = -1;
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
                
		boolean vollesBrett = spielfeld[0][0] != 9 && spielfeld[0][1] != 9
                                   && spielfeld[0][2] != 9 && spielfeld[0][3] != 9
                                   && spielfeld[0][4] != 9 && spielfeld[0][4] != 9
                                   && spielfeld[0][5] != 9 && spielfeld[0][6] != 9;

                return vollesBrett;
		
        }
        
        
        public int[][] Spielzug(int spielfeld[][], int spaltennummer,
			boolean spieler) { //Setzen des Spielsteins
                
                spieler = this.spieler;
                int spielstein;
                
                if (spieler = true){
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
        
        public boolean getAktuellerSpieler(){
            return this.spieler;
        }
        
        public int getZugAnzahl(){
            return this.zug;
        }
        
        public static void main(String[] args){
            new VierGewinnt();          
        }
}
        
