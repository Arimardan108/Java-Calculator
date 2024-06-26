package be.lionelgoffaux.calculator.view;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

/***
 * Represent the keyboard of the GUI.
 * @author Lionel Goffaux
 */
public class Keyboard extends JPanel {

     private List<JButton> buttons = new LinkedList<>();

    /***
     * Create and place a button for each function and digit.
     */
    public Keyboard(){
        String[] buttonMainStr = {"7", "8", "9", "/", "4", "5", "6", "X","1", "2", "3", "-", "0", ".", "Enter", "+"};

        Font ftIco = new Font("Sans-Sarif", Font.PLAIN, 24);  // Font for buttons with a single char.
        Font ftText = new Font("Sans-Sarif", Font.PLAIN, 20); // Font the other buttons.
        this.setPreferredSize(new Dimension(405, 350));
        this.setOpaque(false); // To get the same color as the element behind.
        this.setLayout(new GridLayout(4, 4, 5, 5));

        for(String str: buttonMainStr){
            JButton but = new JButton(str);
            but.setFont(str.length() == 1? ftIco: ftText);
            this.add(but);
            buttons.add(but);
        }
    }

    /***
     * Return the list of all buttons of the keyboard.
     * @return The List of all button.
     */
    public List<JButton> getButtons() {
        return buttons;
    }
}
