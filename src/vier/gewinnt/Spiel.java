package vier.gewinnt;
/**
 *
 * @author Sen
 */
public class Spiel {
    
    private boolean spieler = true; // Spieler1 = True, Spieler2= False
    
    
    
    public void Spielstart(){
            
    }
    


    public void toggelSpieler(){
        this.spieler = !this.spieler;   
    }

    public boolean getAktuellerSpieler(){ //true = Spieler1
        return this.spieler;
    }
        

}
        

