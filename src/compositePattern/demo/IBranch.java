package compositePattern.demo;

import java.util.ArrayList;

/**
 * @Author：Jack
 * @Date： 2021/9/12 - 19:58
 * @Description： compositePattern.demo
 * @Version： 1.0
 */
public interface IBranch {
    public String getInfo();
    public void add(IBranch branch);
    public void add(ILeaf leaf);
    public ArrayList getSubordinateInfo();
}
