package vier.gewinnt;
/**
 *
 * @author Sen Schwarz
 */
public class VierGewinnt {

    private char spielfeld[][];
    
    public VierGewinnt(){
    }
   
    public static void Spielstart ()
    {
        Spielreset();
    }
    
    public static void Spielreset()
    {
        
    }
    
    public static void Spielereingabe()
    {
        
    }
    
    public static void spielfeldleer(char spielfeld[][]) 
    {
		for (char i = 0; i < spielfeld.length; i++) // y = Zeilen
		{
			for (char j = 0; j < spielfeld[i].length; j++) // x = Spalten
			{
				spielfeld[i][j] = ('y');												
			}
		}
    } 
    
    
    
    
        public static void main(String[] args) {

    }   
}
