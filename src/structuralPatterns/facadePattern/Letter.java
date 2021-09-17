package structuralPatterns.facadePattern;

public class Letter implements ILetterProcess{
    @Override
    public void write(String context) {
        System.out.println("context is "+context);
    }

    @Override
    public void address(String address) {
        System.out.println("write address :"+address);
    }

    @Override
    public void send() {
        System.out.println("send to post");
    }
}
