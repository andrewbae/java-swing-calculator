package src.kr.pwner.calculator.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import src.kr.pwner.calculator.controller.MainController;
import src.kr.pwner.calculator.model.MainModel;
import java.awt.GridLayout;
import src.kr.pwner.calculator.interfaces.View;

public class MainFrame extends JFrame implements View {
    private static final MainFrame instance = new MainFrame();
    private MainModel mainModel;
    private MainController calculatorController;
    private DisplayPanel displayPanel;
    private ButtonPanel buttonPanel;

    public static MainFrame getInstance() {
        return instance;
    }

    private MainFrame() {
        this.setSize(300, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2, 4));
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.initComponent();
        this.render();
    }

    @Override()
    public void initComponent() {
        this.displayPanel = DisplayPanel.getInstance();
        this.buttonPanel = ButtonPanel.getInstance();

        this.displayPanel.getInputTextField().setEditable(false);
        this.displayPanel.getOutputTextField().setEditable(false);

        this.mainModel = MainModel.getInstance().init(this);
        this.calculatorController = MainController.getInstance().init(mainModel);

        for (int buttonIndex = 1; buttonIndex <= ButtonPanel.NUMBER_OF_NUMBER_BUTTON; buttonIndex++)
            this.buttonPanel.getNumberButton()[buttonIndex % ButtonPanel.NUMBER_OF_NUMBER_BUTTON]
                    .addActionListener(event -> { // get button text which event occured
                        this.calculatorController.numberButton(((JButton) event.getSource()).getText());
                    });

        this.buttonPanel.getClearButton().addActionListener(e -> this.calculatorController.clearButton());
        this.buttonPanel.getDivButton().addActionListener(e -> this.calculatorController.divButton());
        this.buttonPanel.getMulButton().addActionListener(e -> this.calculatorController.mulButton());
        this.buttonPanel.getSubButton().addActionListener(e -> this.calculatorController.subButton());
        this.buttonPanel.getAddButton().addActionListener(e -> this.calculatorController.addButton());
        this.buttonPanel.getEqualButton().addActionListener(e -> this.calculatorController.equalButton());
    }

    @Override()
    public void render() {
        this.add(this.displayPanel);
        this.add(this.buttonPanel);
        this.setVisible(true);
    }

    public DisplayPanel getDisplayPanel() {
        return this.displayPanel;
    }

    public ButtonPanel getButtonPanel() {
        return this.buttonPanel;
    }
}
