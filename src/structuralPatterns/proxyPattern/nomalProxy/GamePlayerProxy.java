package structuralPatterns.proxyPattern.nomalProxy;

import structuralPatterns.proxyPattern.IGamerPlayer;

public class GamePlayerProxy implements IGamerPlayer {
    private IGamerPlayer gamerPlayer = null;

    public GamePlayerProxy(String name){
        try {
            gamerPlayer = new GamePlayer(this,name);
        } catch (Exception e) {
            //todo finish exception handle
            e.printStackTrace();
        }
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
