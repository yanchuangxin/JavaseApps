import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/11 - 15:07
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test21 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(12);
        list.add(3);
        list.add(14);
        System.out.println(list);
        list.add(3);//add方法无论元素是否存在，都可以添加进去--》添加重复的元素
        //adj. 缺席的；缺少的；心不在焉的；茫然的
        list.addIfAbsent(33);//添加不存在的元素--》不可以添加重复的数据
        System.out.println(list);
    }
}
