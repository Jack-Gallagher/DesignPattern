package structuralPatterns.proxyPattern.forceProxy;

public class Client {
    public static void main(String[] args) {
        IGamerPlayer gamer = new GamePlayer("zhagnsna");
        IGamerPlayer proxy = gamer.getProxy();
        proxy.login("cc");
        proxy.kill();
        proxy.upgrade();
    }
}
