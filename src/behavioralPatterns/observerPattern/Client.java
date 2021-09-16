package behavioralPatterns.observerPattern;

/**
 * @Author：Jack
 * @Date： 2021/9/13 - 19:40
 * @Description： ovserverPattern
 * @Version： 1.0
 */
public class Client {
    public static void main(String[] args) {
        Hanfei hanfei = new Hanfei();
        Observer lisi = new Lisi();

        hanfei.addObserver(lisi);
        hanfei.eat();
        hanfei.out();

    }
}
