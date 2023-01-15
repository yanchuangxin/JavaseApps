import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/11 - 15:12
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test22CopyOnWriteArrarySet {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        //在这里也体现出Set和List的本质区别，就在于是否重复
        //所以add方法直接不可以添加重复数据进去
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(7);
        System.out.println(set);//[1, 2, 7]
    }
}
