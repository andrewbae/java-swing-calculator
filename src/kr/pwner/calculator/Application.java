package src.kr.pwner.calculator;

import javax.swing.SwingUtilities;

import src.kr.pwner.calculator.view.MainFrame;

public class Application implements Runnable {
    public void run() {
        MainFrame.getInstance().setTitle("Java Swing Calculator");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Application());
    }
}