package responsibilityPattern;

public class Husband extends Handler {
    public Husband() {
        super(Handler.HUSBAND_LEVEL);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("request to husband");
        System.out.println(women.getRequest());
        System.out.println("agree");
    }
}
