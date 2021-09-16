package structuralPatterns.proxyPattern.forceProxy;

public class GamePlayerProxy implements IGamerPlayer {
    private IGamerPlayer gamerPlayer = null;
    private String name = "";


    public GamePlayerProxy(GamePlayer gamePlayer, String name) {
        this.gamerPlayer = gamePlayer;
        this.name = name;
    }


    @Override
    public void login(String name) {
        this.gamerPlayer.login(name);
    }

    @Override
    public void kill() {
        this.gamerPlayer.kill();
    }

    @Override
    public void upgrade() {
        this.gamerPlayer.upgrade();
    }

    @Override
    public IGamerPlayer getProxy() {
        return null;
    }
}
