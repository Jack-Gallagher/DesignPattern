package iteratorPattern;

/**
 * @Author：Jack
 * @Date： 2021/9/12 - 16:09
 * @Description： iteratorPattern
 * @Version： 1.0
 */
public interface IProject {
    public void add(String name,int num,int cost);
    public String getProjectInfo();
    public IProjectIterator iterator();
}
