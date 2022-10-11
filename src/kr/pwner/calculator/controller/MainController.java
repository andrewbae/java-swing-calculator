package src.kr.pwner.calculator.controller;

import src.kr.pwner.calculator.model.MainModel;

import java.util.ArrayList;
import java.util.List;

import src.kr.pwner.calculator.interfaces.Controller;
import src.kr.pwner.calculator.interfaces.Display;

public class MainController implements Controller {
    private static final MainController instance = new MainController();
    private List<Display> display = new ArrayList<Display>();
    MainModel mainModel;

    public static MainController getInstance() {
        return instance;
    }

    // public MainController init(MainModel mainModel) {
    // this.mainModel = mainModel;
    // return this;
    // }
    private MainController() {
        this.mainModel = MainModel.getInstance();
    }

    @Override
    public void registerObserver(Display display) {
        this.display.add(display);
    }

    @Override
    public void removeObserver(Display display) {
        this.display.remove(display);
    }

    @Override
    public void notifyObserver(String inputTextField, String outputTextField) {
        for (Display dis : display) {
            dis.updateDisplay(inputTextField, outputTextField);
        }
    }

    public void equalButton() {
        this.mainModel.calculate();
        notifyObserver(this.mainModel.getInputTextField(), this.mainModel.getOutputTextField());
    }

    public void clearButton() {
        this.mainModel.flushInputOutput();
        notifyObserver("", "");
    }

    public void divButton() {
        this.mainModel.appendToInput("/");
        notifyObserver(this.mainModel.getInputTextField(), this.mainModel.getOutputTextField());
    }

    public void mulButton() {
        this.mainModel.appendToInput("*");
        notifyObserver(this.mainModel.getInputTextField(), this.mainModel.getOutputTextField());

    }

    public void subButton() {
        this.mainModel.appendToInput("-");
        notifyObserver(this.mainModel.getInputTextField(), this.mainModel.getOutputTextField());

    }

    public void addButton() {
        this.mainModel.appendToInput("+");
        notifyObserver(this.mainModel.getInputTextField(), this.mainModel.getOutputTextField());

    }

    public void numberButton(String number) {
        this.mainModel.appendToInput(number);
        notifyObserver(this.mainModel.getInputTextField(), this.mainModel.getOutputTextField());

    }
}