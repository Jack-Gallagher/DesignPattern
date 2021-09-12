package iteratorPattern;

/**
 * @Author：Jack
 * @Date： 2021/9/12 - 16:02
 * @Description： iteratorPattern
 * @Version： 1.0
 */
public class Boss {
    public static void main(String[] args) {
        IProject project = new Project();

        project.add("aaa",1,1);
        project.add("bbb",2,2);
        project.add("ccc",3,3);

        IProjectIterator iterator = project.iterator();

        while (iterator.hasNext()){
            IProject p = (IProject) iterator.next();
            System.out.println(p.getProjectInfo());
        }

    }
}
