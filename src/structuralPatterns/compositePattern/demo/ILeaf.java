package structuralPatterns.compositePattern.demo;

import structuralPatterns.compositePattern.ICorp;

/**
 * @Author：Jack
 * @Date： 2021/9/12 - 19:58
 * @Description： structuralPatterns.compositePattern.demo
 * @Version： 1.0
 */
public interface ILeaf extends ICorp {
    public String getInfo();
}
