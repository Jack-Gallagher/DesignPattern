package proxyPattern;

import proxyPattern.Gamer;
import proxyPattern.GamerProxy;
import proxyPattern.IGamer;

public class GamerClient {
    public static void main(String[] args) {
        IGamer gamer = new Gamer();
        GamerProxy gamerProxy = new GamerProxy(gamer);
        gamerProxy.play();
        gamerProxy.shoot();
    }
}
