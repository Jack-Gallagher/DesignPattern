package creationalPatterns.abstractFactoryPattern;

public class Client {
    public static void main(String[] args) {
        ManFactory manFactory = new ManFactory();
        Human whiteHuman = manFactory.createWhiteHuman();
        whiteHuman.getColor();
    }
}
