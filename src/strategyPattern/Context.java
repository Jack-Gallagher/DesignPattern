package strategyPattern;

/**
 * @Author：Jack
 * @Date： 2021/9/11 - 21:25
 * @Description： strategyPattern
 * @Version： 1.0
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate(){
        this.strategy.operate();
    }
}
