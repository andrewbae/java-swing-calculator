package src.kr.pwner.calculator.controller;

import src.kr.pwner.calculator.model.MainModel;

public class MainController {
    MainModel calculatorModel;

    public MainController(MainModel calculatorModel) {
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
    public void numberButton(String number) {
        this.calculatorModel.appendToInput(number);
    }
}