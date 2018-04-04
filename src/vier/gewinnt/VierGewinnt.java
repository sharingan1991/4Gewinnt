
package vier.gewinnt;

/**
 *
 * @author Sen Schwarz
 */
public class VierGewinnt {

    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static char[][] spielfeldleer(char spielfeld[][]) 
    {

		for (char i = 0; i < spielfeld.length; i++) // y = Zeilen
		{
			for (char j = 0; j < spielfeld[i].length; j++) // x = Spalten
			{
				spielfeld[i][j] = ('y');												
			}
		}
		return spielfeld;
    } 
    
}
