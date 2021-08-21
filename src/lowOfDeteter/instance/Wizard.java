package lowOfDeteter.instance;

import java.util.Random;

/**
 * @Author：Jack
 * @Date： 2021/8/21 - 22:35
 * @Description： lowOfDeteter.instance
 * @Version： 1.0
 */
public class Wizard {
    private Random random = new Random(System.currentTimeMillis());
    private int first(){
        System.out.println("first methos");
        return random.nextInt(100);
    }
    private int second(){
        System.out.println("second methos");
        return random.nextInt(100);
    }
    private int third(){
        System.out.println("third methos");
        return random.nextInt(100);
    }

    public void install(){
        int first = this.first();
        if (first > 50){
            int second = this.second();
            if (second > 50){
                int third = this.third();
                if (third > 50){
                    System.out.println("安装成功");
                }
            }
        }
    }
}
