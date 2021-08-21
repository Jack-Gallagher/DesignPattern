package OCP;

/**
 * @Author：Jack
 * @Date： 2021/8/22 - 0:51
 * @Description： OCP
 * @Version： 1.0
 */
public class NovelBooks implements IBook{
    private String bName;
    private double bPrice;
    private String bAuthor;

    public NovelBooks(String bName, double bPrice, String bAuthor) {
        this.bName = bName;
        this.bPrice = bPrice;
        this.bAuthor = bAuthor;
    }

    public String getName() {
        return bName;
    }

    public double getPrice() {
        return bPrice;
    }

    public String getAuthor() {
        return bAuthor;
    }
}
