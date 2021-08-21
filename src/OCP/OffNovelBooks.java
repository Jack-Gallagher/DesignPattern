package OCP;

/**
 * @Author：Jack
 * @Date： 2021/8/22 - 1:24
 * @Description： OCP
 * @Version： 1.0
 */
public class OffNovelBooks extends NovelBooks{
    public OffNovelBooks(String bName, double bPrice, String bAuthor) {
        super(bName, bPrice, bAuthor);
    }

    @Override
    public double getPrice() {
        double offPrice = super.getPrice()-20;
        return offPrice;
    }
}
