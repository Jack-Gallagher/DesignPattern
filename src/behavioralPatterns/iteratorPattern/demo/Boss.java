package behavioralPatterns.iteratorPattern.demo;

import java.util.ArrayList;

/**
 * @Author：Jack
 * @Date： 2021/9/12 - 15:53
 * @Description： behavioralPatterns.iteratorPattern.demo
 * @Version： 1.0
 */
public class Boss {
    public static void main(String[] args) {
        ArrayList<IProject> infos = new ArrayList<>();
        infos.add(new Project("aaa",1,1));
        infos.add(new Project("bbb",2,2));

        for (IProject info : infos) {
            System.out.println(info.getProjectInfo());
        }
    }
}
