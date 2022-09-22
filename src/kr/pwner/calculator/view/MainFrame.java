package src.kr.pwner.calculator.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import src.kr.pwner.calculator.controller.MainController;
import src.kr.pwner.calculator.model.MainModel;
import java.awt.GridLayout;
import src.kr.pwner.calculator.view.interfaces.View;

public class MainFrame extends JFrame implements View {
    private MainModel mainModel;
    private MainController calculatorController;
    private DisplayPanel displayPanel;
    private ButtonPanel buttonPanel;

    public MainFrame(String windowTitle) {
        this.setTitle(windowTitle);
        this.setSize(300, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2, 4));
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.initComponent();
        this.initActionListener();
        this.render();
    }

    @Override()
    public void initComponent() {
        this.displayPanel = new DisplayPanel();
        this.buttonPanel = new ButtonPanel();

        this.displayPanel.getInputTextField().setEditable(false);
        this.displayPanel.getOutputTextField().setEditable(false);

        this.mainModel = new MainModel(this);
        this.calculatorController = new MainController(mainModel);
    }

    @Override()
    public void render() {
        this.add(this.displayPanel);
        this.add(this.buttonPanel);
        this.setVisible(true);
    }

    private void initActionListener() {
        for (int v0 = 0; v0 <= ButtonPanel.NUMBER_OF_NUMBER_BUTTON; v0++)
            this.buttonPanel.getNumberButton()[v0 % ButtonPanel.NUMBER_OF_NUMBER_BUTTON].addActionListener(e -> {
                this.calculatorController.numberButton(((JButton) e.getSource()).getText());
            });

        this.buttonPanel.getClearButton().addActionListener(e -> this.calculatorController.clearButton());
        this.buttonPanel.getDivButton().addActionListener(e -> this.calculatorController.divButton());
        this.buttonPanel.getMulButton().addActionListener(e -> this.calculatorController.mulButton());
        this.buttonPanel.getSubButton().addActionListener(e -> this.calculatorController.subButton());
        this.buttonPanel.getAddButton().addActionListener(e -> this.calculatorController.addButton());
        this.buttonPanel.getEqualButton().addActionListener(e -> this.calculatorController.equalButton());
    }

    public DisplayPanel getDisplayPanel() {
        return this.displayPanel;
    }

    public ButtonPanel getButtonPanel() {
        return this.buttonPanel;
    }
}
