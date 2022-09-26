package src.kr.pwner.calculator.model;

import javax.swing.JTextField;
import org.mariuszgromada.math.mxparser.*;
import src.kr.pwner.calculator.view.MainFrame;

public class MainModel {
    private static final MainModel instance = new MainModel();
    JTextField inputTextField;
    JTextField outputTextField;

    public static MainModel getInstance() {
        return instance;
    }

    private MainModel() {
    };

    public MainModel init(MainFrame mainFrame) {
        this.inputTextField = mainFrame.getDisplayPanel().getInputTextField();
        this.outputTextField = mainFrame.getDisplayPanel().getOutputTextField();
        return instance;
    }

    public void flushInputOutput() {
        this.inputTextField.setText("");
        this.outputTextField.setText("");
    }

    public void appendToInput(String text) {
        this.inputTextField.setText(this.inputTextField.getText() + text);
    }

    public void calculate() {
        double result = new Expression(this.inputTextField.getText()).calculate();
        this.outputTextField.setText(String.valueOf(result));
    }
}
