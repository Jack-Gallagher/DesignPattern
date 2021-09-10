package responsibilityPattern.demo;

public class Clent {
    public static void main(String[] args) {
        IHandler father = new Father();
        Women women = new Women(1,"out");
        father.handleMessage(women);
    }
}
