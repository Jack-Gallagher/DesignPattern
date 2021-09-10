package mediatorPattern2;

/**
 * @Author：Jack
 * @Date： 2021/9/9 - 22:19
 * @Description： mediatorPattern2
 * @Version： 1.0
 */
public class Client {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        System.out.println("buy-----------------------");
        Purchse purchse = new Purchse(mediator);
        purchse.buyComputers(100);
        System.out.println("sale----------------------");
        Sale sale = new Sale(mediator);
        sale.sellComputer(1);
        System.out.println("stock-------------------------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
