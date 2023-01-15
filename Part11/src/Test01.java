import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/10 - 15:31
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
         /*
        Collection接口的常用方法：
        增加：add(E e) addAll(Collection<? extends E> c)
        删除：clear() remove(Object o)
        修改：
        查看：iterator() size()
        判断：contains(Object o)  equals(Object o) isEmpty()
         */
        //创建对象：接口不能创建对象，利用实现类创建对象：
        Collection col = new ArrayList();
        //调用方法：
        //集合有一个特点：只能存放引用数据类型的数据，不能是基本数据类型
        //基本数据类型自动装箱，对应包装类。int--->Integer
        col.add(18);
        col.add(12);
        System.out.println(col);
        List list = Arrays.asList(new Integer[]{12,123});
        col.addAll(list);
        System.out.println(col);
        //col.clear();
        //System.out.println(col);
        System.out.println("集合中元素的数量为："+col.size());
        System.out.println("集合是否为空："+col.isEmpty());
        boolean isRemove=col.remove(123);
        System.out.println(col);
        System.out.println("集合中数据是否被删除："+isRemove);
        Collection col2 = new ArrayList();
        col2.add(18);
        col2.add(12);
        col2.add(11);
        col2.add(17);
        Collection col3 = new ArrayList();
        col3.add(18);
        col3.add(12);
        col3.add(11);
        col3.add(17);
        System.out.println(col2.equals(col3));
        System.out.println(col2==col3);//地址一定不相等  false
        System.out.println("是否包含元素："+col3.contains(117));

    }
}
