package be.lionelgoffaux.calculator.controler;

import be.lionelgoffaux.calculator.model.Calculator;
import be.lionelgoffaux.calculator.view.CalculatorView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/***
 * Controller of the different events from the calculator buttons.
 * @author Lionel Goffaux
 */
public class CalculatorController implements ActionListener {

    private Calculator cal;
    private CalculatorView view;

    /**
     * Set the calculator and his view.
     * @param cal The calculator model.
     * @param view The GUI.
     */
    public CalculatorController(Calculator cal, CalculatorView view){
        this.cal = cal;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // In this case the sources are always a button.
        JButton butt = (JButton) e.getSource();
        String buttTxt = butt.getText();

        if(buttTxt.equals("+"))
            cal.doOperation((a, b) -> a+b);
        else if(buttTxt.equals("-"))
            cal.doOperation((a, b) -> b-a);
        else if(buttTxt.equals("X"))
            cal.doOperation((a, b) -> a*b);
        else if(buttTxt.equals("/"))
            cal.doOperation((a, b) -> b/a);
        else if(buttTxt.equals("Enter"))
            cal.enter();
        else // The button isn't an operator so we add the digit.
            cal.addDigit(buttTxt);

        // Then we get the new displayed number.
        view.getScreen().setText(cal.getCurrentDisplay());
    }
}
