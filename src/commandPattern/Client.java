package commandPattern;

/**
 * @Author：Jack
 * @Date： 2021/9/9 - 23:37
 * @Description： commandPattern
 * @Version： 1.0
 */
public class Client {
    public static void main(String[] args){
        Invoker invoker = new Invoker();

        Command command = new AddCommand();
        Command command1 = new Delete();


        invoker.setCommand(command);

        invoker.action();

        invoker.setCommand(command1);
        invoker.action();
    }

}
