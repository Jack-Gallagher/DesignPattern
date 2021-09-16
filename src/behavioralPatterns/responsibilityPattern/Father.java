package behavioralPatterns.responsibilityPattern;

public class Father extends Handler{

    public Father() {
        super(Handler.FATHER_LEVEL);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("request to father");
        System.out.println(women.getRequest());
        System.out.println("agree");
    }
}
