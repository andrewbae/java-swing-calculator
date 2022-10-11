package src.kr.pwner.calculator.view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import src.kr.pwner.calculator.interfaces.Display;

public class DisplayPanel extends JPanel implements Display {
    private static final DisplayPanel instance = new DisplayPanel();
    private JTextField inputTextField;
    private JTextField outputTextField;

    public static DisplayPanel getInstance() {
        return instance;
    }

    private DisplayPanel() {
        this.setLayout(new GridLayout(2, 3));

        this.inputTextField = (JTextField) this.add(new JTextField());
        this.outputTextField = (JTextField) this.add(new JTextField());

        this.setVisible(true);
    }

    public JTextField getInputTextField() {
        return this.inputTextField;
    }

    public JTextField getOutputTextField() {
        return this.outputTextField;
    }

    @Override
    public void updateDisplay(String inputTextField, String outputTextField) {
        this.inputTextField.setText(inputTextField);
        this.outputTextField.setText(outputTextField);
    }
}
