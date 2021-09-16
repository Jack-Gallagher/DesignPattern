package creationalPatterns.builderPattern;

import java.util.ArrayList;

public class Director {
    private ArrayList<String> sequence = new ArrayList<>();
    private BenzBuilder builder = new BenzBuilder();
    public BenzModel getABenzModel(){
        this.sequence.clear();
        sequence.add("start");
        sequence.add("stop");
        sequence.add("alarm");
        this.builder.setSequence(this.sequence);
        return (BenzModel) this.builder.getCarModel();
    }

    public CarModel getBBenzModel(){
        this.sequence.clear();
        sequence.add("start");
        sequence.add("alarm");
        this.builder.setSequence(this.sequence);
        return (BenzModel) this.builder.getCarModel();
    }

}
