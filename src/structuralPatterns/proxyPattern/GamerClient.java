package structuralPatterns.proxyPattern;

public class GamerClient {
    public static void main(String[] args) {
        IGamer gamer = new Gamer();
        GamerProxy gamerProxy = new GamerProxy(gamer);
        gamerProxy.play();
        gamerProxy.shoot();
    }
}
