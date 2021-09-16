package behavioralPatterns.responsibilityPattern;

public class Client {
    public static void main(String[] args) {
        Handler fater = new Father();
        Handler huband = new Husband();
        fater.setNext(huband);

        IWomen women = new Women(2,"out");

        fater.handleMessage(women);
    }
}
