package structuralPatterns.adapterPattern.extension;

import structuralPatterns.adapterPattern.IUserInfo;
import structuralPatterns.adapterPattern.OuterUserInfo;

/**
 * @Author：Jack
 * @Date： 2021/9/11 - 22:44
 * @Description： structuralPatterns.adapterPattern
 * @Version： 1.0
 */
public class Client {
    public static void main(String[] args) {
        IUserInfo user = new OuterUserInfo();
        user.getUserName();
    }
}
