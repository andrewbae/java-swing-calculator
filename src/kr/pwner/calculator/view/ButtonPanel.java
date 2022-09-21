package src.kr.pwner.calculator.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class ButtonPanel extends JPanel {
    private JButton numberButton0;
    private JButton numberButton1;
    private JButton numberButton2;
    private JButton numberButton3;
    private JButton numberButton4;
    private JButton numberButton5;
    private JButton numberButton6;
    private JButton numberButton7;
    private JButton numberButton8;
    private JButton numberButton9;

    private JButton clearButton;
    private JButton divButton;
    private JButton mulButton;
    private JButton subButton;
    private JButton addButton;
    private JButton equalButton;

    public ButtonPanel() {
        this.setLayout(new GridLayout(4, 3));
        this.render();
    }

    private void render() {
        // this.numberButton = new JButton[10];
        // for (Integer v0 = 1; v0 <= 10; v0++) {
        // numberButton[v0 % 10] = new JButton((String.valueOf(v0 % 10)));
        // this.add(numberButton[v0 % 10]);
        // }
        this.numberButton0 = (JButton) this.add(new JButton("0"));
        this.numberButton1 = (JButton) this.add(new JButton("1"));
        this.numberButton2 = (JButton) this.add(new JButton("2"));
        this.numberButton3 = (JButton) this.add(new JButton("3"));
        this.numberButton4 = (JButton) this.add(new JButton("4"));
        this.numberButton5 = (JButton) this.add(new JButton("5"));
        this.numberButton6 = (JButton) this.add(new JButton("6"));
        this.numberButton7 = (JButton) this.add(new JButton("7"));
        this.numberButton8 = (JButton) this.add(new JButton("8"));
        this.numberButton9 = (JButton) this.add(new JButton("9"));

        this.clearButton = (JButton) this.add(new JButton("c"));
        this.divButton = (JButton) this.add(new JButton("/"));
        this.mulButton = (JButton) this.add(new JButton("x"));
        this.subButton = (JButton) this.add(new JButton("-"));
        this.addButton = (JButton) this.add(new JButton("+"));
        this.equalButton = (JButton) this.add(new JButton("="));
    }

    public JButton getNumberButton0() {
        return numberButton0;
    }

    public JButton getNumberButton1() {
        return numberButton1;
    }

    public JButton getNumberButton2() {
        return numberButton2;
    }

    public JButton getNumberButton3() {
        return numberButton3;
    }

    public JButton getNumberButton4() {
        return numberButton4;
    }

    public JButton getNumberButton5() {
        return numberButton5;
    }

    public JButton getNumberButton6() {
        return numberButton6;
    }

    public JButton getNumberButton7() {
        return numberButton7;
    }

    public JButton getNumberButton8() {
        return numberButton8;
    }

    public JButton getNumberButton9() {
        return numberButton9;
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
