package responsibilityPattern.demo;

public class Father implements IHandler{

    @Override
    public void handleMessage(IWomen women) {
        System.out.println("request is "+women.getRequest());
        System.out.println("agree");
    }
}
