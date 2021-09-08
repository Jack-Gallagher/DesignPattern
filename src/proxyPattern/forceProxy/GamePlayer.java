package proxyPattern.forceProxy;

public class GamePlayer implements IGamerPlayer {
    private String name = "";
    private IGamerPlayer proxy = null;

    public GamePlayer(String name) {
        this.name = name;
    }


    @Override
    public void login(String user) {
        if (this.isProxy()){
            System.out.printf("user login as %s  proxy login ad %s \n",this.name,user);
        }else {
            System.out.println("please use proxy");
        }

    }

    @Override
    public void kill() {
        if (this.isProxy()){
            System.out.println(this.name + "killing");
        }else {
            System.out.println("please use proxy");
        }
    }

    @Override
    public void upgrade() {
        if (this.isProxy()){
            System.out.println(this.name + "upgrade");
        }else {
            System.out.println("please use proxy");
        }
    }

    @Override
    public IGamerPlayer getProxy() {
        this.proxy = new GamePlayerProxy(this,name);
        return this.proxy;
    }

    private boolean isProxy() {
        if (this.proxy == null){
            return false;
        }else {
            return true;
        }
    }
}
