package compositePattern.demo;

/**
 * @Author：Jack
 * @Date： 2021/9/12 - 20:03
 * @Description： compositePattern.demo
 * @Version： 1.0
 */
public class Leaf implements ILeaf{
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
