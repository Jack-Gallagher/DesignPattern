package structuralPatterns.decoratorPattern;

public class SortDecorator extends Decorator{

    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    private void sortReport(){
        System.out.println("my location is 38");
    }

    @Override
    public void report() {
        super.report();
        this.sortReport();
    }
}
