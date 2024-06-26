package be.lionelgoffaux.calculator.view;

import javax.swing.*;
import java.awt.*;

/***
 * The window of the calculator.
 * @author Lionel Goffaux
 */
public class CalculatorView extends JFrame {

    private Screen screen = new be.lionelgoffaux.calculator.view.Screen();
    private Keyboard keyboard = new be.lionelgoffaux.calculator.view.Keyboard();

    /***
     * Setup the window and place screen and keyboard.
     */
    public CalculatorView(){
        JPanel container  = new JPanel();

        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 465);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        container.add(screen, BorderLayout.NORTH);
        container.add(keyboard, BorderLayout.CENTER);
        container.setBackground(Color.LIGHT_GRAY);

        this.setContentPane(container);
        this.setVisible(true);
    }

    /***
     * Return the calculator's screen.
     * @return The Screen element.
     */
    public be.lionelgoffaux.calculator.view.Screen getScreen() { return screen; }

    /***
     * Return the calculator's keyboard.
     * @return The Keyboard element.
     */
    public be.lionelgoffaux.calculator.view.Keyboard getKeyboard() { return keyboard; }
}
