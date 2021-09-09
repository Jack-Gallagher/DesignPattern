package mediatorPattern2;

/**
 * @Author：Jack
 * @Date： 2021/9/9 - 21:46
 * @Description： mediatorPattern2
 * @Version： 1.0
 */
public abstract class AbstractColleague {

    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
