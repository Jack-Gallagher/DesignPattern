package behavioralPatterns.commandPattern;

/**
 * @Author：Jack
 * @Date： 2021/9/9 - 23:37
 * @Description： behavioralPatterns.commandPattern
 * @Version： 1.0
 */
public class Invoker {
    public Command command;
    public void setCommand(Command command){
        this.command = command;
    }

    public void action(){
        this.command.execute();
    }
}
