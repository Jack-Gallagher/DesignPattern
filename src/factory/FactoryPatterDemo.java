package factory;

public class FactoryPatterDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("circle");
        shape.draw();

    }
}
