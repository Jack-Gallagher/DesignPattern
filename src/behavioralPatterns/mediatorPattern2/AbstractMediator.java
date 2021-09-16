package behavioralPatterns.mediatorPattern2;

/**
 * @Author：Jack
 * @Date： 2021/9/9 - 21:45
 * @Description： behavioralPatterns.mediatorPattern2
 * @Version： 1.0
 */
public abstract class AbstractMediator {

    protected Purchse purchse;
    protected Sale sale;
    public Stock stock;

    public AbstractMediator() {
        purchse = new Purchse(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    public abstract void execute(String str,Object...objects);
}
