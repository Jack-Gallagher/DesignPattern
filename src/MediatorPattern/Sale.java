package MediatorPattern;

import java.util.Random;

public class Sale {
    public void sellComputer(int number){
        Stock stock = new Stock();
        Purchase purchase = new Purchase();
        if (stock.getStockNumber()<number) {
            purchase.buyComputer(number);
        }
        System.out.println("sale computer "+number);
        stock.decrease(number);
    }
    public int getSaleStatus(){
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("sale status " + saleStatus);
        return saleStatus;
    }
    public void offSale(){

        Stock stock = new Stock();
        System.out.println("off sale "+stock.getStockNumber());
    }

}
