package behavioralPatterns.observerPattern;

/**
 * @Author：Jack
 * @Date： 2021/9/13 - 19:39
 * @Description： ovserverPattern
 * @Version： 1.0
 */
public class Lisi implements Observer{
    @Override
    public void update(String context) {
        System.out.println("observing");
        System.out.println(context);
    }
}
