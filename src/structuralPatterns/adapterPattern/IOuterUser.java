package structuralPatterns.adapterPattern;

import java.util.Map;

/**
 * @Author：Jack
 * @Date： 2021/9/11 - 22:38
 * @Description： structuralPatterns.adapterPattern
 * @Version： 1.0
 */
public interface IOuterUser {
    public Map getUserBaseInfo();
    public Map getUserHomeInfo();

}
