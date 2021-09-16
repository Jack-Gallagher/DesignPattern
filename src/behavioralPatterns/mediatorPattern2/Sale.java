package behavioralPatterns.mediatorPattern2;

import java.util.Random;

/**
 * @Author：Jack
 * @Date： 2021/9/9 - 21:47
 * @Description： behavioralPatterns.mediatorPattern2
 * @Version： 1.0
 */
public class Sale extends AbstractColleague{

    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    public void sellComputer(int number){
        super.mediator.execute("sale.sell"+number);
        System.out.println("sold"+number+"computer");
    }

    public int getStatus(){
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM电脑的销售情况为："+saleStatus);
        return saleStatus;

    }

    public void offSale(){
        super.mediator.execute("sale.offsell");
    }
}
