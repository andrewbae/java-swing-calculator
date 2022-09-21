package src.kr.pwner.calculator.view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class DisplayPanel extends JPanel {
    private JTextField inputTextField;
    private JTextField outputTextField;

    public DisplayPanel() {
        this.setLayout(new GridLayout(2, 3));
        this.render();
    }

    private void render() {
        this.inputTextField = (JTextField) this.add(new JTextField());
        this.outputTextField = (JTextField) this.add(new JTextField());
    }

    public JTextField getInputTextField() {
        return this.inputTextField;
    }

    public JTextField getOutputTextField() {
        return this.outputTextField;
    }
}
