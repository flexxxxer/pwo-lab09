package pwo.lab09.factory;

public class Thursday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Dzień dobry Czwartek.";
    }

    @Override
    public String createMainMessage() {
        return "Praca w czwartek idzie lepiej";
    }

    @Override
    public String createClosingMessage() {
        return "Czwarty dzień pracy w tym tygodniu minął";
    }
}