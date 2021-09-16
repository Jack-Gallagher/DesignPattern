package behavioralPatterns.MediatorPattern;

public class Client {
    public static void main(String[] args) {
        Stock stocks = new Stock();
        System.out.println("buy -------------------------");
        Purchase purchase = new Purchase();
        purchase.buyComputer(100);
        System.out.println(stocks.getStockNumber());
        System.out.println("sale--------------------------");
        Sale sale = new Sale();
        sale.sellComputer(1);
        System.out.println(stocks.getStockNumber());

        System.out.println("stock-------------------------");
        Stock stock = new Stock();
        stock.clearStock();
        System.out.println(stocks.getStockNumber());

    }
}
