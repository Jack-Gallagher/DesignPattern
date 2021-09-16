package behavioralPatterns.iteratorPattern.demo;

/**
 * @Author：Jack
 * @Date： 2021/9/12 - 15:29
 * @Description： behavioralPatterns.iteratorPattern.demo
 * @Version： 1.0
 */
public class Project implements IProject{
    private String name;
    private int num = 0;
    private int cost = 0;

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }



    @Override
    public String getProjectInfo() {
        return this.name+this.num+this.cost;
    }
}
