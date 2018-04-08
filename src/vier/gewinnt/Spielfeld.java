package vier.gewinnt;
/**
 *
 * @author Sen
 */
public class Spielfeld {

private int [][] feld;
int spalten;
int zeilen;
private int zug;

    
public Spielfeld(int zeile, int spalte){
    spalten = spalte;
    zeilen = zeile;
    
    feld = new int[zeilen][spalten];
}

   
    public void reset(){
        for (int i = 0; i < zeilen; i++){ // i = Zeilen
		
            for (int j = 0; j < spalten; j++){ // j = Spalten
		
		feld[i][j] = 0;
            }
        }
    }

    public boolean gueltigeEingabe(int spaltennummer){ //Gültigkeit der Eingabe und Spalte voll
                     
        if (0 <= spaltennummer && spaltennummer < spalten && feld[0][spaltennummer] == 0){ 
                       
            return true;
        }
            return false;       
    }
    
    public void Spielzug(int spaltennummer, int spieler){ //Setzen des Spielsteins
        
        if (!gueltigeEingabe(spaltennummer)){
            return;
        }
        
        for (int i = zeilen-1; i >= 0; i--){
                    
            if (feld[i][spaltennummer] == 0){ // überprüft freie Stelle 
                
                feld[i][spaltennummer] = spieler; // setzt Spielstein
                    
                return; 
            }
        }
    }

    public boolean SpielbrettVoll(){ //Return entspricht True = Unentschieden
                
	for (int i = 0; i < spalten; i++){
            if(feld[0][i] != 0){
                return true;
            }
        }
                return false;
    }
    
    public boolean CheckWin(int spaltennummer,int zeile, int spieler){
    
        for (int i = 0; i < 6; i++){ // i = Zeilen
		
            for (int j = 0; j < 7; j++){ // j = Spalten
		
            }

        }    
        
    }
    
    
    
    
    
    
    
    
    
    public int getZugAnzahl(){
        return this.zug;
    }
    
    public String toString(){
        
        String ret = "";
        
        for (int i = 0; i < zeilen; i++){ // j = Zeilen
		
            for (int j = 0; j < spalten; j++){ // i = Spalten
		
                ret += feld[i][j] + " | ";
            }
            ret += "\n";
        }
    
          return ret;
    }
   
}
