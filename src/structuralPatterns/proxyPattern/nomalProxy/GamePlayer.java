package structuralPatterns.proxyPattern.nomalProxy;

import structuralPatterns.proxyPattern.IGamerPlayer;

public class GamePlayer implements IGamerPlayer  {
    private String name = "";

    public GamePlayer(IGamerPlayer gamerPlayer,String name) throws Exception {
        if (gamerPlayer == null) {
            throw new Exception("can not create charcctor");
        } else {
            this.name = name;
        }
    }
    @Override
    public void login(String user, String password) {
        System.out.println("user " + user + "login by "+this.name);
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "killing bosses");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + " upgrade");
    }
}
