package dip;

public class Client {
    public static void main(String[] args) {
        Driver driver = new Driver();
        ICar benz = new Benz();
        driver.drive(benz);
        ICar bmw = new Bmw();
        driver.drive(bmw);
    }
}
