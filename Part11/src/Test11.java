import java.util.HashSet;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/11 - 9:16
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test11 {
    public static void main(String[] args) {
        //创建一个HashSet集合：
        HashSet<Integer> hs = new HashSet<>();
        System.out.println(hs.add(20));
        hs.add(5);
        hs.add(10);
        System.out.println(hs.add(20));
        hs.add(41);
        hs.add(0);
        System.out.println(hs.size());//唯一，无序
        System.out.println(hs);
    }
}
