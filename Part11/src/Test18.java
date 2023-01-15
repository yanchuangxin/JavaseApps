import java.util.Stack;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/11 - 14:28
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test18 {
    public static void main(String[] args) {
         /*
        Stack是Vector的子类，Vector里面两个重要的属性：
        Object[] elementData;底层依然是一个数组
        int elementCount;数组中的容量
         */
        Stack s = new Stack();
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");
        System.out.println(s);
        System.out.println(s.empty());
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.push("D"));
        System.out.println(s);

    }
}
