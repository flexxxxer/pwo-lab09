package pwo.lab09.factory;

/**
 * @author Aleksandr Kovalyov
 */
public class Saturday implements MessageFactory {
    @Override
    public String createIntroMessage() {
        return "Dzień dobry Sobota.";
    }

    @Override
    public String createMainMessage() {
        return "Pracy w sobote nie ma";
    }

    @Override
    public String createClosingMessage() {
        return "Szósty dzień w tym tygodniu minął";
    }
}