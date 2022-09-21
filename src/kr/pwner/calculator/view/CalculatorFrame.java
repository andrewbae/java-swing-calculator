package src.kr.pwner.calculator.view;

import javax.swing.JFrame;
import src.kr.pwner.calculator.controller.CalculatorController;
import src.kr.pwner.calculator.model.CalculatorModel;
import java.awt.GridLayout;

public class CalculatorFrame extends View<CalculatorController> {
    private DisplayPanel displayPanel;
    private ButtonPanel buttonPanel;

    // need divide
    public CalculatorFrame(String title) {
        super(title);
        this.setSize(300, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2, 4));
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        this.render();
    }

    @Override()
    protected void render() {
        // Panel
        this.displayPanel = new DisplayPanel();
        this.buttonPanel = new ButtonPanel();

        this.displayPanel.getInputTextField().setEditable(false);
        this.displayPanel.getOutputTextField().setEditable(false);

        CalculatorModel calculatorModel = new CalculatorModel(this.displayPanel.getInputTextField(),
                this.displayPanel.getOutputTextField());

        this.controller(new CalculatorController(calculatorModel));

        // Number buttons event listener
        this.buttonPanel.getNumberButton0().addActionListener(e -> this.getController().numberButton0());
        this.buttonPanel.getNumberButton1().addActionListener(e -> this.getController().numberButton1());
        this.buttonPanel.getNumberButton2().addActionListener(e -> this.getController().numberButton2());
        this.buttonPanel.getNumberButton3().addActionListener(e -> this.getController().numberButton3());
        this.buttonPanel.getNumberButton4().addActionListener(e -> this.getController().numberButton4());
        this.buttonPanel.getNumberButton5().addActionListener(e -> this.getController().numberButton5());
        this.buttonPanel.getNumberButton6().addActionListener(e -> this.getController().numberButton6());
        this.buttonPanel.getNumberButton7().addActionListener(e -> this.getController().numberButton7());
        this.buttonPanel.getNumberButton8().addActionListener(e -> this.getController().numberButton8());
        this.buttonPanel.getNumberButton9().addActionListener(e -> this.getController().numberButton9());

        this.buttonPanel.getClearButton().addActionListener(e -> this.getController().clearButton());
        this.buttonPanel.getDivButton().addActionListener(e -> this.getController().divButton());
        this.buttonPanel.getMulButton().addActionListener(e -> this.getController().mulButton());
        this.buttonPanel.getSubButton().addActionListener(e -> this.getController().subButton());
        this.buttonPanel.getAddButton().addActionListener(e -> this.getController().addButton());
        this.buttonPanel.getEqualButton().addActionListener(e -> this.getController().equalButton());

        this.add(this.displayPanel);
        this.add(this.buttonPanel);
        this.setVisible(true);
    }
}
