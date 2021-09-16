package behavioralPatterns.MediatorPattern;

public class Stock {
    private static int COMOUTER_NUMBER = 100;

    public void increase(int number){
        COMOUTER_NUMBER = COMOUTER_NUMBER + number;
        System.out.println("we now have :" + COMOUTER_NUMBER);

    }
    public void decrease(int number){
        COMOUTER_NUMBER = COMOUTER_NUMBER - number;
        System.out.println("we now have :" + COMOUTER_NUMBER);
    }
    public int getStockNumber(){

        return COMOUTER_NUMBER;
    }
    public void clearStock(){
        Purchase purchase = new Purchase();
        Sale sale = new Sale();
        System.out.println("clear numbers:" + COMOUTER_NUMBER);
        sale.offSale();
        purchase.refuseBuyIBM();

    }

}
