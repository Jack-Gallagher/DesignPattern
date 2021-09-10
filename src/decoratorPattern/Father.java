package decoratorPattern;

public class Father {
    public static void main(String[] args) {
        SchoolReport sr = new FourthSP();
//        sr.report();
        sr = new HighScoreDecorator(sr);
//        sr.report();

        sr = new SortDecorator(sr);

        sr.report();

        sr.sign();
    }
}
