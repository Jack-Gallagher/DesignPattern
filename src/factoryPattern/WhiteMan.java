package factoryPattern;

public class WhiteMan implements Human{
    @Override
    public void getColor() {
        System.out.println("get white color");
    }

    @Override
    public void talk() {
        System.out.println("speak english");
    }
}
