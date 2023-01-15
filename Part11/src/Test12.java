import java.util.LinkedHashSet;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/11 - 9:22
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test12 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> hs =new LinkedHashSet<>();
        hs.add(5);
        hs.add(20);
        System.out.println(hs.add(20));
        hs.add(41);
        hs.add(0);
        System.out.println(hs.size());
        System.out.println(hs);
    }
}
