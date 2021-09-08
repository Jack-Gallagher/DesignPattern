package proxyPattern.forceProxy;

public interface IGamerPlayer {
    public void login(String name);
    public void kill();
    public void upgrade();
    public IGamerPlayer getProxy();
}
