package adapterPattern.extension;

import java.util.Map;

/**
 * @Author：Jack
 * @Date： 2021/9/11 - 23:02
 * @Description： adapterPattern.extension
 * @Version： 1.0
 */
public class OuterUserInfo implements IUserInfo{
    private IOuterUserBaseInfo baseInfo = null;
    private IOuterUserHomeInfo homeInfo = null;

    private Map baseMap = null;
    private Map homeMap = null;

    public OuterUserInfo(IOuterUserBaseInfo baseInfo, IOuterUserHomeInfo homeInfo) {
        this.baseInfo = baseInfo;
        this.homeInfo = homeInfo;

        this.baseMap = baseInfo.getUserBaseInfo();
        this.homeMap = homeInfo.getUserHomeInfo();
    }

    @Override
    public String getUserName() {
        String userName = (String) this.baseMap.get("userName");
        return userName;
    }

    @Override
    public String getHomeAddress() {
        return null;
    }
}
