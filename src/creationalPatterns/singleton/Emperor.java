package creationalPatterns.singleton;

public class Emperor {
    private static final Emperor EMPEROR = new Emperor();
    private Emperor(){};
    public static Emperor getInstance(){
        return EMPEROR;
    }

    public static void say(){
        System.out.println("I am emperor");
    }
}
