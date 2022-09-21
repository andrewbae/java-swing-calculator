package src.kr.pwner.calculator;

import javax.swing.SwingUtilities;
import src.kr.pwner.calculator.view.CalculatorFrame;

public class Application implements Runnable {
    public void run() {
        new CalculatorFrame("Java swing calculator");
    }

    public static void main(String[] args) {
        // signle thread
        SwingUtilities.invokeLater(new Application());
    }
}
