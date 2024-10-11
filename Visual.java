//Thanks for importing automatically vsc
import java.awt.Color;
import javax.swing.JButton;

//Maybe didnt need its own class but i didnt know how much was gonna go into this
public class Visual {

    //Create a function for creating buttons since I need to make a lot of them
    public static JButton createButton(String type, int x, int y) {   
        JButton Button = new JButton();  
        Button.setBounds(x,y,30,30); //posX, posY, size
        Button.setVisible(false); //The buttons need to be there, but not visible

        //Button Color
        if (type == "null"){Button.setVisible(false);} //If type null, then button will NOT be visible
        else{Button.setVisible(true);} //I know this looks weird since true is default but since I change buttons not create new ones I need this
        if (type == "Black"){Button.setBackground(Color.black);} //If false, set black
        else {Button.setBackground(Color.white);} //Other is here for capturing 

    return Button;

}
}
