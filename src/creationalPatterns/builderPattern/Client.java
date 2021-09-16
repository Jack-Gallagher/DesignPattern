package creationalPatterns.builderPattern;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ArrayList<String> sequence = new ArrayList<>();

        sequence.add("start");
        sequence.add("stop");
        sequence.add("alarm");
        sequence.add("engine boom");

        BenzBuilder builder = new BenzBuilder();
        builder.setSequence(sequence);
        BenzModel benz = (BenzModel) builder.getCarModel();

        benz.setSequence(sequence);
        benz.run();

        Director director = new Director();
        CarModel benzs = director.getABenzModel();
        benzs.run();
    }
}
