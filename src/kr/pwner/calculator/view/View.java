package src.kr.pwner.calculator.view;

import javax.swing.JFrame;
import java.lang.NullPointerException;

public abstract class View<C> extends JFrame {
    private C controller;

    protected View(String title) {
        super(title);
    }

    protected void controller(C controller) {
        if (controller == null)
            throw new NullPointerException();
        this.controller = controller;
    }

    protected C getController() {
        return this.controller;
    }

    protected abstract void render();
}
