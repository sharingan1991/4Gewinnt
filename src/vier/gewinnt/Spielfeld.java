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
        for (int i = 0; i < zeilen; i++){ // j = Zeilen
		
            for (int j = 0; j < spalten; j++){ // i = Spalten
		
		feld[i][j] = 0;
            }
        }
    }

    public boolean gueltigeEingabe(int spaltennummer){ //Gültigkeit der Abfrage
                     
        if (0 < spaltennummer && spaltennummer <= spalten && feld[0][spaltennummer] != 0){ 
                       
            return true;
        }
            return false;       
    }
    
    public void Spielzug(int spaltennummer, int spieler){ //Setzen des Spielsteins
                
        for (int i = zeilen; i >= 0; i--){
                    
            if (feld[i][spaltennummer] == 0){ // überprüft freie Stelle 
                
                feld[i][spaltennummer] = spieler; // setzt Spielstein
                    return; 
            }
        }
    }

    public boolean SpielbrettVoll(){ //Return entspricht True = Unentschieden
                
	for (int i = 0; i <= zeilen; i++){
            if(feld[0][i] != 0){
                return true;
            }
        }
                return false;
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
