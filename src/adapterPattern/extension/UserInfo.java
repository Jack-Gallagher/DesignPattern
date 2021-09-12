package adapterPattern.extension;

/**
 * @Author：Jack
 * @Date： 2021/9/11 - 22:37
 * @Description： adapterPattern
 * @Version： 1.0
 */
public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("we get user Name");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("we get user Address");
        return null;
    }
}
