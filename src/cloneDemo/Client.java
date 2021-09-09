package cloneDemo;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Things things = new Things();
        things.setArray("hello");

        Things clone = (Things) things.clone();
        clone.setArray("world");

        System.out.println(things.getArray());

    }
}
