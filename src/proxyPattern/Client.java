package proxyPattern;

import java.sql.SQLOutput;

public class Client {
    public static void main(String[] args) {
        IGamerPlayer gamerPlayer = new GamePlayer("jack");
        System.out.println("began at now");
        IGamerPlayer proxy = new GamePlayerProxy(gamerPlayer);
        proxy.login("jack","123456");
        proxy.killBoss();
        proxy.upgrade();
    }


}
