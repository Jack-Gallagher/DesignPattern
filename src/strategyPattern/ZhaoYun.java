package strategyPattern;

/**
 * @Author：Jack
 * @Date： 2021/9/11 - 21:13
 * @Description： strategyPattern
 * @Version： 1.0
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context;
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("----------------------------");
        context = new Context(new GreenLight());
        context.operate();
    }
}
