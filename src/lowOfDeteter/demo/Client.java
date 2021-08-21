package lowOfDeteter.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：Jack
 * @Date： 2021/8/21 - 22:17
 * @Description： lowOfDeteter
 * @Version： 1.0
 */
public class Client {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        List<Girl> girls = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            girls.add(new Girl());
        }
            final GroupLeader groupLeader = new GroupLeader(girls);
        teacher.command(groupLeader);

    }
}
