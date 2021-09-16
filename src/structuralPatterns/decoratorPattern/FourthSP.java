package structuralPatterns.decoratorPattern;

public class FourthSP extends SchoolReport{
//    public FourthSP() {
////        System.out.println("the sp construct");
//    }

    @Override
    public void report() {
        System.out.println("my score is 33 545 55 66 ");
    }

    @Override
    public void sign() {
        System.out.println("parent sign");
    }
}
