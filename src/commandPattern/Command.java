package commandPattern;

/**
 * @Author：Jack
 * @Date： 2021/9/9 - 23:26
 * @Description： commandPattern
 * @Version： 1.0
 */
public abstract  class Command {
    RequirementGroup rg = new RequirementGroup();
    PageGroup pg = new PageGroup();
    CodeGroup cg = new CodeGroup();

    public abstract void execute();
}
