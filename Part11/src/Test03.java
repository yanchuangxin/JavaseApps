import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/10 - 15:47
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
         /*
        List接口中常用方法：
        增加：add(int index, E element)
        删除：remove(int index)  remove(Object o)
        修改：set(int index, E element)
        查看：get(int index)
        判断：
         */
        List list = new ArrayList<>();
        list.add(13);
        list.add(17);
        list.add(6);
        list.add(-1);
        list.add(2);
        list.add("abc");
        System.out.println(list);
        list.add(3,66);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove("abc");
        System.out.println(list);
        Object o=list.get(0);
        System.out.println(o);
        System.out.println("---------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("---------------------");
        for(Object item:list){
            System.out.println(item);
        }
        System.out.println("---------------------");
        Iterator iterator2 = list.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

    }
}
