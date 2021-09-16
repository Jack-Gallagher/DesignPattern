package behavioralPatterns.iteratorPattern;

import java.util.ArrayList;

/**
 * @Author：Jack
 * @Date： 2021/9/12 - 16:15
 * @Description： behavioralPatterns.iteratorPattern
 * @Version： 1.0
 */
public class ProjectIterator implements IProjectIterator {

    private ArrayList<IProject> projectsList = new ArrayList<>();
    private int currentItem = 0;

    public ProjectIterator(ArrayList<IProject> projectsList) {
        this.projectsList = projectsList;
    }


    @Override
    public boolean hasNext() {
        boolean b = false;
        if (this.currentItem >= projectsList.size() || this.projectsList.get(currentItem) == null) {
            b = true;
        }
        return b;
    }

    @Override
    public Object next() {
        return this.projectsList.get(currentItem++);
    }

    @Override
    public void remove() {

    }
}
