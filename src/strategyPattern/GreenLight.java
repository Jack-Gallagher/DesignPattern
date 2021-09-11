package strategyPattern;

/**
 * @Author：Jack
 * @Date： 2021/9/11 - 21:23
 * @Description： strategyPattern
 * @Version： 1.0
 */
public class GreenLight implements IStrategy{
    @Override
    public void operate() {
        System.out.println("find a greenLight");
    }
}
