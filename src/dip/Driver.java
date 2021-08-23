package dip;

public class Driver implements IDriver{
    public void drive(Benz benz){
        benz.run();
    }

    @Override
    public void drive(ICar iCar) {
        iCar.run();
    }
}
