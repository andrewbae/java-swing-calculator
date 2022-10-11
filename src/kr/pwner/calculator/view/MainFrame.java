package src.kr.pwner.calculator.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import src.kr.pwner.calculator.controller.MainController;
import src.kr.pwner.calculator.model.MainModel;
import java.awt.GridLayout;

public class MainFrame extends JFrame {
    private static final MainFrame instance = new MainFrame();
    private MainModel mainModel;
    private MainController mainController;
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

        this.displayPanel = DisplayPanel.getInstance();
        this.buttonPanel = ButtonPanel.getInstance();

        this.displayPanel.getInputTextField().setEditable(false);
        this.displayPanel.getOutputTextField().setEditable(false);

        this.mainModel = MainModel.getInstance();
        this.mainController = MainController.getInstance();
        this.mainController.registerObserver(displayPanel);

        for (int buttonIndex = 1; buttonIndex <= ButtonPanel.NUMBER_OF_NUMBER_BUTTON; buttonIndex++)
            this.buttonPanel.getNumberButton()[buttonIndex % ButtonPanel.NUMBER_OF_NUMBER_BUTTON]
                    .addActionListener(event -> { // get button text which event occured
                        this.mainController.numberButton(((JButton) event.getSource()).getText());
                    });

        this.buttonPanel.getClearButton().addActionListener(e -> this.mainController.clearButton());
        this.buttonPanel.getDivButton().addActionListener(e -> this.mainController.divButton());
        this.buttonPanel.getMulButton().addActionListener(e -> this.mainController.mulButton());
        this.buttonPanel.getSubButton().addActionListener(e -> this.mainController.subButton());
        this.buttonPanel.getAddButton().addActionListener(e -> this.mainController.addButton());
        this.buttonPanel.getEqualButton().addActionListener(e -> this.mainController.equalButton());

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
