package structuralPatterns.compositePattern.demo;

import java.util.ArrayList;

/**
 * @Author：Jack
 * @Date： 2021/9/12 - 20:00
 * @Description： structuralPatterns.compositePattern.demo
 * @Version： 1.0
 */
public class Root implements IRoot{
    private ArrayList subordianteList = new ArrayList();
    private String name;
    private String position;
    private int salary;

    public Root(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        return this.name+this.position+this.salary;
    }

    @Override
    public void add(IBranch branch) {
        this.subordianteList.add(branch);
    }

    @Override
    public void add(ILeaf leaf) {
        this.subordianteList.add(leaf);
    }

    @Override
    public ArrayList getSubordinateInfo() {
        return this.subordianteList;
    }
}
