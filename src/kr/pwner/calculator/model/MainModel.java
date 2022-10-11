package src.kr.pwner.calculator.model;

import org.mariuszgromada.math.mxparser.*;

public class MainModel {
    private static final MainModel instance = new MainModel();
    String inputTextField = "";
    String outputTextField = "";

    public static MainModel getInstance() {
        return instance;
    }

    private MainModel() {
    };

    public void flushInputOutput() {
        this.setInputTextField("");
        this.setOutputTextField("");
    }

    public void appendToInput(String text) {
        this.setInputTextField(this.getInputTextField() + text);
    }

    public void calculate() {
        double result = new Expression(this.getInputTextField()).calculate();
        this.setOutputTextField(String.valueOf(result));
    }

    public String getInputTextField() {
        return this.inputTextField;
    }

    public String getOutputTextField() {
        return this.outputTextField;
    }

    public void setInputTextField(String text) {
        this.inputTextField = text;
    }

    public void setOutputTextField(String text) {
        this.outputTextField = text;
    }
}
