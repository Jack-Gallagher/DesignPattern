package OCP;

import javax.crypto.spec.IvParameterSpec;
import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * @Author：Jack
 * @Date： 2021/8/22 - 1:14
 * @Description： OCP
 * @Version： 1.0
 */
public class BookStore {
    private final static ArrayList<IBook> bookList = new ArrayList<>();
    static {
        bookList.add(new OffNovelBooks("aaa",3200,"nnnnn"));
        bookList.add(new OffNovelBooks("vvv",4500,"nnnn"));
        bookList.add(new OffNovelBooks("ddd",5699,"nnnnnnn"));
    }

    public static void main(String[] args) {
        final NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.setMaximumFractionDigits(2);
        System.out.println("*************************************************");

        for (IBook iBook : bookList) {
            System.out.println("name" + iBook.getName() + "author " + iBook.getAuthor() + "price" + currencyInstance.format(iBook.getPrice()/100.0)+"$");
        }
    }
}
