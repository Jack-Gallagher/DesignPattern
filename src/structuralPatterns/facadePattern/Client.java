package structuralPatterns.facadePattern;

public class Client {
    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();
        postOffice.sendLetter("hello","street");
    }
}
