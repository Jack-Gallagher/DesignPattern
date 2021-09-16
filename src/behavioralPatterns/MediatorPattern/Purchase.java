package behavioralPatterns.MediatorPattern;

public class Purchase {

    public void buyComputer(int number){
        Stock stock = new Stock();
        Sale sale = new Sale();
        int saleStatus = sale.getSaleStatus();
        if(saleStatus > 80){
            System.out.println("buy computer:"+number);
            stock.increase(number);
        }else {
            int buyNumber = number/2;
            System.out.println("buy computer:"+buyNumber);
            stock.increase(buyNumber);
        }
    }
    public void refuseBuyIBM(){
        System.out.println("don't but computer");
    }
}
