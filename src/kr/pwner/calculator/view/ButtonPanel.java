package src.kr.pwner.calculator.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class ButtonPanel extends JPanel {
    private static final ButtonPanel instance = new ButtonPanel();
    private JButton[] numberButton = new JButton[10];
    private JButton clearButton;
    private JButton divButton;
    private JButton mulButton;
    private JButton subButton;
    private JButton addButton;
    private JButton equalButton;

    public static final int NUMBER_OF_NUMBER_BUTTON = 10;

    public static ButtonPanel getInstance() {
        return instance;
    }

    private ButtonPanel() {
        this.setLayout(new GridLayout(4, 3));

        for (Integer buttonIndex = 1; buttonIndex <= NUMBER_OF_NUMBER_BUTTON; buttonIndex++) {
            numberButton[buttonIndex % NUMBER_OF_NUMBER_BUTTON] = new JButton(
                    (String.valueOf(buttonIndex % NUMBER_OF_NUMBER_BUTTON)));
            this.add(numberButton[buttonIndex % NUMBER_OF_NUMBER_BUTTON]);
        }
        this.clearButton = (JButton) this.add(new JButton("c"));
        this.divButton = (JButton) this.add(new JButton("/"));
        this.mulButton = (JButton) this.add(new JButton("x"));
        this.subButton = (JButton) this.add(new JButton("-"));
        this.addButton = (JButton) this.add(new JButton("+"));
        this.equalButton = (JButton) this.add(new JButton("="));

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
