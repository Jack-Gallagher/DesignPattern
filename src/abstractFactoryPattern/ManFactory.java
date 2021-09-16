package abstractFactoryPattern;

public class ManFactory implements HumanFactory{
    @Override
    public Human createWhiteHuman() {
        return new WhiteHuman();
    }
}
