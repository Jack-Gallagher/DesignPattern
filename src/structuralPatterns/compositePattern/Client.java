package structuralPatterns.compositePattern;

import structuralPatterns.compositePattern.demo.IBranch;
import structuralPatterns.compositePattern.demo.Leaf;

import java.util.ArrayList;

/**
 * @Author：Jack
 * @Date： 2021/9/12 - 21:06
 * @Description： structuralPatterns.compositePattern
 * @Version： 1.0
 */
public class Client {
    public static void main(String[] args) {

        Branch root = new Branch("a","a",2000);

        Branch aa = new Branch("aa","aa",1000);

        Leaf leaf = new Leaf("aaa","aaa",200);

        root.add(aa);
        aa.add(leaf);

        System.out.println(root.getInfo());
        getAllInfo(root.getSubordinate());
    }
    private static void getAllInfo(ArrayList subordinateInfo) {
        int len = subordinateInfo.size();
        for (int m = 0; m < len; m++) {
            Object s = subordinateInfo.get(m);
            if (s instanceof structuralPatterns.compositePattern.demo.Leaf) {
                System.out.println(((Leaf) s).getInfo());
            } else {
                structuralPatterns.compositePattern.demo.IBranch branch = (IBranch) s;
                System.out.println(branch.getInfo());
                getAllInfo(branch.getSubordinateInfo());
            }
        }
    }
}
