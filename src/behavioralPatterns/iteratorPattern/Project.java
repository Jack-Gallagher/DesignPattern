package behavioralPatterns.iteratorPattern;

import java.util.ArrayList;

/**
 * @Author：Jack
 * @Date： 2021/9/12 - 16:11
 * @Description： behavioralPatterns.iteratorPattern
 * @Version： 1.0
 */
public class Project implements IProject{
    private ArrayList<IProject> projectList = new ArrayList<>();


    private String name;
    private int num;
    private int cost;

    public Project() {
    }

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }



    @Override
    public void add(String name, int num, int cost) {
        this.projectList.add(new Project(name,num,cost));
    }

    @Override
    public String getProjectInfo() {
        return this.name + " "+this.num + " " + this.cost;
    }

    @Override
    public IProjectIterator iterator() {
        this.projectList.iterator();
        return new ProjectIterator(this.projectList);
    }
}
