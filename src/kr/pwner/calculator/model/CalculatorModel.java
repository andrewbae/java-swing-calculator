package src.kr.pwner.calculator.model;

import javax.swing.JTextField;
import org.mariuszgromada.math.mxparser.*;

public class CalculatorModel {
    JTextField inputTextField;
    JTextField outputTextField;

    public CalculatorModel(JTextField inputTextField, JTextField outputTextField) {
        this.inputTextField = inputTextField;
        this.outputTextField = outputTextField;
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
