package singleton;

public class Minister {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Emperor instance = Emperor.getInstance();
            instance.say();
        }
    }
}
