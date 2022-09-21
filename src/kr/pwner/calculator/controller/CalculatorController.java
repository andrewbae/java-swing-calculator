package src.kr.pwner.calculator.controller;

import javax.swing.JTextField;
import src.kr.pwner.calculator.model.CalculatorModel;

public class CalculatorController {
    CalculatorModel calculatorModel;

    public CalculatorController(CalculatorModel calculatorModel) {
        this.calculatorModel = calculatorModel;
    }

    // Operation buttons
    public void equalButton() {
        this.calculatorModel.calculate();
    }

    public void clearButton() {
        this.calculatorModel.flushInputOutput();
    }

    public void divButton() {
        this.calculatorModel.appendToInput("/");
    }

    public void mulButton() {
        this.calculatorModel.appendToInput("*");
    }

    public void subButton() {
        this.calculatorModel.appendToInput("-");
    }

    public void addButton() {
        this.calculatorModel.appendToInput("+");
    }

    // Number buttons

    public void numberButton0() {
        this.calculatorModel.appendToInput("0");
    }

    public void numberButton1() {
        this.calculatorModel.appendToInput("1");
    }

    public void numberButton2() {
        this.calculatorModel.appendToInput("2");
    }

    public void numberButton3() {
        this.calculatorModel.appendToInput("3");
    }

    public void numberButton4() {
        this.calculatorModel.appendToInput("4");
    }

    public void numberButton5() {
        this.calculatorModel.appendToInput("5");
    }

    public void numberButton6() {
        this.calculatorModel.appendToInput("6");
    }

    public void numberButton7() {
        this.calculatorModel.appendToInput("7");
    }

    public void numberButton8() {
        this.calculatorModel.appendToInput("8");
    }

    public void numberButton9() {
        this.calculatorModel.appendToInput("9");
    }
}