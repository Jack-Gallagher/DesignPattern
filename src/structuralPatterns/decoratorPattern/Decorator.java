package structuralPatterns.decoratorPattern;

public abstract class Decorator extends SchoolReport{

    private SchoolReport sr;

    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    @Override
    public void report() {
        this.sr.report();
    }

    @Override
    public void sign() {
        this.sr.sign();
    }
}
