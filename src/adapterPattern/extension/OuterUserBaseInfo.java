package adapterPattern.extension;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author：Jack
 * @Date： 2021/9/11 - 23:00
 * @Description： adapterPattern.extension
 * @Version： 1.0
 */
public class OuterUserBaseInfo implements IOuterUserBaseInfo{
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfo = new HashMap();
        baseInfo.put("usrName","this is user's name");
        return baseInfo;
    }
}
