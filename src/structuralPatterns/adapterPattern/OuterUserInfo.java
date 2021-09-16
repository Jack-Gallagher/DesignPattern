package structuralPatterns.adapterPattern;

import java.util.Map;

/**
 * @Author：Jack
 * @Date： 2021/9/11 - 22:40
 * @Description： structuralPatterns.adapterPattern
 * @Version： 1.0
 */
public class OuterUserInfo extends OuterUser implements IUserInfo{
    private Map BaseInfo = super.getUserBaseInfo();
    private Map HomeInfo = super.getUserHomeInfo();

    @Override
    public String getUserName() {
        String userName = (String) this.BaseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress = (String) this.HomeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }
}
