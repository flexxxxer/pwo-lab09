package pwo.lab09.factory;

/**
 * @author Aleksandr Kovalyov
 */
public class Friday implements MessageFactory{
    @Override
    public String createIntroMessage() {
        return "Dzień dobry Piątek.";
    }

    @Override
    public String createMainMessage() {
        return "Praca nie idzie, prawie nic nie robie";
    }

    @Override
    public String createClosingMessage() {
        return "Piąty dzień pracy w tym tygodniu minął";
    }
}