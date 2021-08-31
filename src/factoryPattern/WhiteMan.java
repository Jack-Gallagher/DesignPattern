package factoryPattern;

public class WhiteMan implements Human{

    @Override
    public void getColor() {
        System.out.println("white man");
    }

    @Override
    public void say() {
        System.out.println("I am white man");
    }
}
