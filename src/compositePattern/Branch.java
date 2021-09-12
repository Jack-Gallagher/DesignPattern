package compositePattern;

import java.util.ArrayList;

/**
 * @Author：Jack
 * @Date： 2021/9/12 - 20:59
 * @Description： compositePattern
 * @Version： 1.0
 */
public class Branch implements IBranch {

    private String name;
    private String position;
    private int salary;

    private ArrayList<ICorp> subordinateList = new ArrayList<>();

    public Branch(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }


    @Override
    public void add(ICorp corp) {
        this.subordinateList.add(corp);
    }

    @Override
    public ArrayList<ICorp> getSubordinate() {
        return this.subordinateList;
    }

    @Override
    public String getInfo() {
        return this.name + this.position + this.salary;
    }
}
