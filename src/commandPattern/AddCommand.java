package commandPattern;

/**
 * @Author：Jack
 * @Date： 2021/9/9 - 23:36
 * @Description： commandPattern
 * @Version： 1.0
 */
public class AddCommand extends Command{
    @Override
    public void execute() {
        super.rg.find();
        super.rg.add();
        super.rg.plan();

    }
}
