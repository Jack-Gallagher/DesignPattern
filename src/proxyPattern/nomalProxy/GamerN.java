package proxyPattern.nomalProxy;

public class GamerN implements IGamerN {
    private String name = "";

    public GamerN(IGamerN gamerN, String name) {
        if (gamerN == null) {
            System.out.println("can not create gamer");
        } else {
            this.name = name;
        }
    }

    @Override
    public void play() {
        System.out.println(this.name + " gamerN play");
    }

    @Override
    public void shoot() {
        System.out.println(this.name + " gamerN shoot");
    }
}
