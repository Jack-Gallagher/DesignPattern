package behavioralPatterns.strategyPattern;

/**
 * @Author：Jack
 * @Date： 2021/9/11 - 21:23
 * @Description： behavioralPatterns.strategyPattern
 * @Version： 1.0
 */
public class BackDoor implements IStrategy{
    @Override
    public void operate() {
        System.out.println("find a back door");
    }
}
