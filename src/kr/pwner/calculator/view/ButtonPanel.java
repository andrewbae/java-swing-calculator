package src.kr.pwner.calculator.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import src.kr.pwner.calculator.view.interfaces.View;

public class ButtonPanel extends JPanel implements View {
    private JButton[] numberButton = new JButton[10];
    private JButton clearButton;
    private JButton divButton;
    private JButton mulButton;
    private JButton subButton;
    private JButton addButton;
    private JButton equalButton;

    public static final int NUMBER_OF_NUMBER_BUTTON = 10;

    public ButtonPanel() {
        this.setLayout(new GridLayout(4, 3));
        this.initComponent();
        this.render();
    }

    @Override()
    public void initComponent() {
        for (Integer buttonIndex = 1; buttonIndex <= NUMBER_OF_NUMBER_BUTTON; buttonIndex++)
            numberButton[buttonIndex % NUMBER_OF_NUMBER_BUTTON] = new JButton(
                    (String.valueOf(buttonIndex % NUMBER_OF_NUMBER_BUTTON)));
        this.clearButton = new JButton("c");
        this.divButton = new JButton("/");
        this.mulButton = new JButton("x");
        this.subButton = new JButton("-");
        this.addButton = new JButton("+");
        this.equalButton = new JButton("=");
    }

    @Override()
    public void render() {
        for (Integer buttonIndex = 1; buttonIndex <= NUMBER_OF_NUMBER_BUTTON; buttonIndex++)
            this.add(numberButton[buttonIndex % NUMBER_OF_NUMBER_BUTTON]);
        this.add(this.clearButton);
        this.add(this.divButton);
        this.add(this.mulButton);
        this.add(this.subButton);
        this.add(this.addButton);
        this.add(this.equalButton);

        this.setVisible(true);
    }

    public JButton[] getNumberButton() {
        return this.numberButton;
    }

    public JButton getClearButton() {
        return this.clearButton;
    }

    public JButton getDivButton() {
        return this.divButton;
    }

    public JButton getMulButton() {
        return this.mulButton;
    }

    public JButton getSubButton() {
        return this.subButton;
    }

    public JButton getAddButton() {
        return this.addButton;
    }

    public JButton getEqualButton() {
        return this.equalButton;
    }
}
