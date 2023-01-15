import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/10 - 16:45
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test09 {
    public static void main(String[] args) {
        /*
        LinkedList常用方法：
        增加 addFirst(E e) addLast(E e)
             offer(E e) offerFirst(E e) offerLast(E e)
        删除 poll()
            pollFirst() pollLast()  ---》JDK1.6以后新出的方法，提高了代码的健壮性
            removeFirst() removeLast()
        修改
        查看 element()
             getFirst()  getLast()
             indexOf(Object o)   lastIndexOf(Object o)
             peek()
             peekFirst() peekLast()
        判断
         */
        //创建一个LinkedList集合对象：
        LinkedList<String> list = new LinkedList<>();
        list.add("aaaaaaaaa");
        list.add("bbbbbbbbb");
        list.addFirst("jj");
        list.addLast("kk");
        System.out.println(list);
        list.offer("hhhh");
        list.offerFirst("PP");
        list.offerLast("rr");
        System.out.println(list);
        System.out.println(list.poll());
        System.out.println(list);
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());
        System.out.println(list);
        System.out.println("---------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("---------------------");
        for(String s : list){
            System.out.println(s);
        }
        System.out.println("---------------------");
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //下面这种方式好，节省内存
        for(Iterator<String> it = list.iterator();it.hasNext();){
            System.out.println(it.next());
        }
    }
}
