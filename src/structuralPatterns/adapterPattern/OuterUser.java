package structuralPatterns.adapterPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author：Jack
 * @Date： 2021/9/11 - 22:39
 * @Description： structuralPatterns.adapterPattern
 * @Version： 1.0
 */
public class OuterUser implements IOuterUser{
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfo = new HashMap();
        baseInfo.put("userName","this is user's name");
        return baseInfo;
    }

    @Override
    public Map getUserHomeInfo() {
        return null;
    }
}
