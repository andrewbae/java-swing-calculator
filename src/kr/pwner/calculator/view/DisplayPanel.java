package src.kr.pwner.calculator.view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import src.kr.pwner.calculator.interfaces.View;

public class DisplayPanel extends JPanel implements View {
    private static final DisplayPanel instance = new DisplayPanel();
    private JTextField inputTextField;
    private JTextField outputTextField;

    public static DisplayPanel getInstance() {
        return instance;
    }

    private DisplayPanel() {
        this.setLayout(new GridLayout(2, 3));

        this.initComponent();
        this.render();
    };

    @Override()
    public void initComponent() {
        this.inputTextField = new JTextField();
        this.outputTextField = new JTextField();
    }

    @Override()
    public void render() {
        this.add(this.inputTextField);
        this.add(this.outputTextField);
        this.setVisible(true);
    }

    public JTextField getInputTextField() {
        return this.inputTextField;
    }

    public JTextField getOutputTextField() {
        return this.outputTextField;
    }
}
