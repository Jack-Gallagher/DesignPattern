package structuralPatterns.proxyPattern;

public class GamePlayerProxy implements IGamerPlayer{
    private IGamerPlayer gamerPlayer = null;

    public GamePlayerProxy(IGamerPlayer gamerPlayer) {
        this.gamerPlayer = gamerPlayer;
    }

    @Override
    public void login(String user, String password) {
        this.gamerPlayer.login(user,password);
    }

    @Override
    public void killBoss() {
        this.gamerPlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamerPlayer.upgrade();
    }
}
