package proxyPattern.nomalProxy;


public class GamerProxyN implements IGamerN {

    private IGamerN gamerN = null;

    public GamerProxyN (String name){
        try {
            gamerN = new GamerN(this,name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void play() {
        this.gamerN.play();
    }

    @Override
    public void shoot() {
        this.gamerN.shoot();
    }
}
