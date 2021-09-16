package structuralPatterns.decoratorPattern;

public class HighScoreDecorator extends Decorator{

    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportHighScore(){
        System.out.println("report high score");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
