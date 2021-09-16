package behavioralPatterns.dynamicProxy;

import structuralPatterns.proxyPattern.GamePlayer;
import structuralPatterns.proxyPattern.IGamerPlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        IGamerPlayer gamer = new GamePlayer("zhangsan");
        InvocationHandler handler = new GamePlayIH(gamer);

        ClassLoader cl = gamer.getClass().getClassLoader();

        IGamerPlayer proxy = (IGamerPlayer) Proxy.newProxyInstance(cl,new Class[]{IGamerPlayer.class},handler);
        proxy.login("zhangsna","aaaa");
        proxy.killBoss();
        proxy.upgrade();

        // TODO: 2021/9/8 finish dynamic proxy
    }
}
