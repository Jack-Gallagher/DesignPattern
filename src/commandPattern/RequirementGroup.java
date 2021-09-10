package commandPattern;

/**
 * @Author：Jack
 * @Date： 2021/9/9 - 23:25
 * @Description： commandPattern
 * @Version： 1.0
 */
public class RequirementGroup extends Group{
    @Override
    public void add() {
        System.out.println("add reqirement");

    }

    @Override
    public void find() {
        System.out.println("find reqirement");

    }

    @Override
    public void delete() {

    }

    @Override
    public void change() {

    }

    @Override
    public void plan() {
        System.out.println("reqirement plan");

    }
}
