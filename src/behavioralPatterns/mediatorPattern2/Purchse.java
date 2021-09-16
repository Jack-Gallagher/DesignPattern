package behavioralPatterns.mediatorPattern2;

/**
 * @Author：Jack
 * @Date： 2021/9/9 - 21:47
 * @Description： behavioralPatterns.mediatorPattern2
 * @Version： 1.0
 */
public class Purchse extends AbstractColleague {

    public Purchse(AbstractMediator mediator) {
        super(mediator);
    }

    public void buyComputers(int number){
        super.mediator.execute("purchase.buy",number);
    }

    public void refuseBuy(){
        System.out.println("refuse buy computers");
    }
}
