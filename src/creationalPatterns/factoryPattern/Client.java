package creationalPatterns.factoryPattern;

public class Client {
    public static void main(String[] args) {

        AbstractHumanFactory factory = new Factory();
        WhiteMan man = factory.createMan(WhiteMan.class);
        man.getColor();
        man.talk();
    }
}
