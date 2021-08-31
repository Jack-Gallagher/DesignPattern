package factoryPattern;

public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory factory = new HumanFactory();
        WhiteMan whiteMan = factory.createHuman(WhiteMan.class);
        whiteMan.getColor();
        whiteMan.say();
    }
}
