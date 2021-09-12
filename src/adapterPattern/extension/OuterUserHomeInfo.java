package adapterPattern.extension;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @Author：Jack
 * @Date： 2021/9/11 - 23:01
 * @Description： adapterPattern.extension
 * @Version： 1.0
 */
public class OuterUserHomeInfo implements IOuterUserHomeInfo{
    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("userAddress","this is user's address");
        return homeInfo;
    }
}
