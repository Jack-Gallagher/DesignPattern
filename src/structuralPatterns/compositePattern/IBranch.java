package structuralPatterns.compositePattern;

import java.util.ArrayList;

/**
 * @Author：Jack
 * @Date： 2021/9/12 - 20:56
 * @Description： structuralPatterns.compositePattern
 * @Version： 1.0
 */
public interface IBranch extends ICorp{
    public void add(ICorp corp);
    public ArrayList<ICorp> getSubordinate( );
}
