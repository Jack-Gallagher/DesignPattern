package lowOfDeteter.demo;

import java.util.List;

/**
 * @Author：Jack
 * @Date： 2021/8/21 - 22:15
 * @Description： lowOfDeteter
 * @Version： 1.0
 */
public class GroupLeader {
    private List<Girl> girlList;

    public GroupLeader(List<Girl> girlList){
        this.girlList = girlList;
    }
    public void count(){
        System.out.println("number of girl is " + girlList.size());
    }
}
