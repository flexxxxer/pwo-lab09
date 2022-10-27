package pwo.lab09.factory;

/**
 * @author Aleksandr Kovalyov
 */
public class Sunday implements MessageFactory {
    @Override
    public String createIntroMessage() {
        return "Dzień dobry Niedziela.";
    }

    @Override
    public String createMainMessage() {
        return "Praca w niedziele? Nieeeeeeeeeeeeeeeeeeeeeee";
    }

    @Override
    public String createClosingMessage() {
        return "Siódmy dzień w tym tygodniu minął";
    }
}