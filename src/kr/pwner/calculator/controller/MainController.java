package src.kr.pwner.calculator.controller;

import src.kr.pwner.calculator.model.MainModel;

public class MainController {
    private static final MainController instance = new MainController();
    MainModel calculatorModel;

    public static MainController getInstance() {
        return instance;
    }

    private MainController() {
    }

    public MainController init(MainModel calculatorModel) {
        this.calculatorModel = calculatorModel;
        return this;
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

    public void numberButton(int buttonIndex) {
    }
}