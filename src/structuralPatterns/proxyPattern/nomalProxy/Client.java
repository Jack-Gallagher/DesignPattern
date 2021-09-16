package structuralPatterns.proxyPattern.nomalProxy;

import structuralPatterns.proxyPattern.IGamerPlayer;

public class Client {
    public static void main(String[] args) {
        IGamerPlayer proxy = new GamePlayerProxy("jack");
        proxy.login("jack","password");
        proxy.killBoss();
        proxy.upgrade();
    }
}
