package behavioralPatterns.tamplatePattern;

public class Hummer1 extends HummerModel {
    @Override
    public void start() {
        System.out.println("H1 start");
    }

    @Override
    public void stop() {
        System.out.println("H2 start");
    }

    @Override
    public void engineBoom() {
        System.out.println("This is H1's engine");
    }


}
