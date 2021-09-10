package mediatorPattern2;

/**
 * @Author：Jack
 * @Date： 2021/9/9 - 21:47
 * @Description： mediatorPattern2
 * @Version： 1.0
 */
public class Stock extends AbstractColleague {

    public static int COMPUTER_NUMBER = 100;
    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    public void increase(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER+number;
        System.out.println("stock number is "+COMPUTER_NUMBER);
    }

    public void decrease(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER-number;
        System.out.println("stock number is "+COMPUTER_NUMBER);
    }

    public int getStockNumber(){

        return COMPUTER_NUMBER;
    }

    public void clearStock(){

        System.out.println("we now have "+COMPUTER_NUMBER);
        super.mediator.execute("stock.clear");
    }
}
