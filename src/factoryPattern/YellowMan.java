package factoryPattern;

public class YellowMan implements Human{
    @Override
    public void getColor() {
        System.out.println("get yellow color");
    }

    @Override
    public void talk() {
        System.out.println("speak chines");
    }
}
