package be.lionelgoffaux.calculator;

import be.lionelgoffaux.calculator.controler.CalculatorController;
import be.lionelgoffaux.calculator.model.Calculator;
import be.lionelgoffaux.calculator.view.CalculatorView;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        CalculatorView view = new CalculatorView();
        Calculator calculator = new Calculator();
        CalculatorController control = new CalculatorController(calculator, view);

        for(JButton b: view.getKeyboard().getButtons())
            b.addActionListener(control);
    }
}
