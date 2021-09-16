package behavioralPatterns.commandPattern;

/**
 * @Author：Jack
 * @Date： 2021/9/9 - 23:36
 * @Description： behavioralPatterns.commandPattern
 * @Version： 1.0
 */
public class Delete extends Command{
    @Override
    public void execute() {
        super.pg.delete();
    }
}
