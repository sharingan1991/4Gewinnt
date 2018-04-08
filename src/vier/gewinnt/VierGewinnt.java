package vier.gewinnt;
/**
 *
 * @author Sen Schwarz
 */
public class VierGewinnt{


        public static void main(String[] args){
        Spielfeld sf = new Spielfeld(6,7);
        
        System.out.println(sf);
        
        sf.reset();
        
        System.out.println(sf);
        
        sf.Spielzug(1, 1);
        
        sf.Spielzug(1, 2);
        
        System.out.println(sf);
        }
     
        

}
        
