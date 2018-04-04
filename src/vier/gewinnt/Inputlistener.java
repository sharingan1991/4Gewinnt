package vier.gewinnt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Sen
 */
public class Inputlistener implements ActionListener{
   
    @Override
    public void actionPerformed(ActionEvent e){
       
        switch (e.getActionCommand()){
            //Hauptmenue
            case "button_start": 
                VierGewinnt.Spielstart();
                break;
            case "button_einstellungen":
                break;
            case "button_about":
                break;
            case "button_hilfe":
                break;
            case "button_sprache":
                break;
            //Spalten     
            case "A":
                break;
            case "B":
                break;
            case "C":
                break;
            case "D":
                break;
            case "E":
                break;
            case "F":
                break;
            //Default   
            default:
                break;  
        }
       
    }
  
}


