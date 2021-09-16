package structuralPatterns.proxyPattern;

public class GamerProxy implements IGamer {

    private IGamer gamer = new Gamer();

    public GamerProxy(IGamer gamer) {
        this.gamer = gamer;
    }

    @Override
    public void play() {
        this.gamer.play();
    }

    @Override
    public void shoot() {
        this.gamer.shoot();
    }
}
