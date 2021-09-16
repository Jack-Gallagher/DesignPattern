package structuralPatterns.proxyPattern;

public class Gamer implements IGamer{
    @Override
    public void play() {
        System.out.println("gamer play");
    }

    @Override
    public void shoot() {
        System.out.println("gamer shoot");
    }
}
