package structuralPatterns.compositePattern.demo;

import java.util.ArrayList;

/**
 * @Author：Jack
 * @Date： 2021/9/12 - 20:04
 * @Description： structuralPatterns.compositePattern.demo
 * @Version： 1.0
 */
public class Client {
    public static void main(String[] args) {
        IRoot a = new Root("a", "a", 1000);

        ILeaf A = new Leaf("A", "A", 2000);
        IBranch aa = new Branch("aa", "aa", 2000);
        IBranch bb = new Branch("bb", "bb", 2000);
        IBranch cc = new Branch("cc", "cc", 2000);

        ILeaf aaa = new Leaf("aaa", "aaa", 30000);
        ILeaf bbb = new Leaf("aaa", "aaa", 30000);
        ILeaf ddd = new Leaf("aaa", "aaa", 30000);
        ILeaf eee = new Leaf("aaa", "aaa", 30000);
        ILeaf fff = new Leaf("aaa", "aaa", 30000);
        ILeaf hhh = new Leaf("aaa", "aaa", 30000);
        ILeaf iii = new Leaf("aaa", "aaa", 30000);

        a.add(A);
        a.add(aa);
        a.add(bb);
        a.add(cc);

        aa.add(aaa);
        aa.add(bbb);
        aa.add(ddd);


        bb.add(eee);
        bb.add(fff);

        cc.add(hhh);
        cc.add(iii);

        System.out.println(a.getInfo());

        getAllInfo(a.getSubordinateInfo());
    }

    private static void getAllInfo(ArrayList subordinateInfo) {
        int len = subordinateInfo.size();
        for (int m = 0; m < len; m++) {
            Object s = subordinateInfo.get(m);
            if (s instanceof Leaf) {
                System.out.println(((Leaf) s).getInfo());
            } else {
                IBranch branch = (IBranch) s;
                System.out.println(branch.getInfo());
                getAllInfo(branch.getSubordinateInfo());
            }
        }
    }


}
