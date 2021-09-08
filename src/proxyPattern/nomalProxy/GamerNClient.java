package proxyPattern.nomalProxy;

public class GamerNClient {
    public static void main(String[] args) {
        GamerProxyN proxyN = new GamerProxyN("jack");
        proxyN.play();
        proxyN.shoot();
    }
}
