package src.kr.pwner.calculator.interfaces;

public interface Controller {
    void registerObserver(Display display);

    void removeObserver(Display display);

    void notifyObserver(String inputTextField, String outputTextField);
}
