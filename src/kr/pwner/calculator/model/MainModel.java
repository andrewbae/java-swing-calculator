package src.kr.pwner.calculator.model;

import javax.swing.JFrame;
import javax.swing.JTextField;
import org.mariuszgromada.math.mxparser.*;
import src.kr.pwner.calculator.view.MainFrame;

public class MainModel {
    JTextField inputTextField;
    JTextField outputTextField;

    public MainModel(MainFrame frame) {
        this.inputTextField = frame.getDisplayPanel().getInputTextField();
        this.outputTextField = frame.getDisplayPanel().getOutputTextField();
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
