package compositePattern;

import compositePattern.demo.ILeaf;

/**
 * @Author：Jack
 * @Date： 2021/9/12 - 20:56
 * @Description： compositePattern
 * @Version： 1.0
 */
public class Leaf implements ILeaf {
    private String name;
    private String position;
    private int salary;

    public Leaf(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        return this.name+this.position+this.salary;
    }
}
