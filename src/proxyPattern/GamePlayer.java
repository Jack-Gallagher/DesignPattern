package proxyPattern;

public class GamePlayer implements IGamerPlayer{
    private String name;

    public GamePlayer(String name) {
        this.name = name;
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
