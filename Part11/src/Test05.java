/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/10 - 16:18
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */

class GenericTest<E>{
    int age;
    String name;
    E sex;
    public void a(E n){}
    public void b(E[] m){}
}

public class Test05 {
    public static void main(String[] args) {
        GenericTest gt1=new GenericTest();
        gt1.a("abdc");
        gt1.a(12);
        gt1.a(2.3);
        gt1.b(new String[]{"s","a"});
        System.out.println(gt1);
        GenericTest<String> gt2 = new GenericTest<>();
        gt2.sex = "男";
        gt2.a("abc");
        gt2.b(new String[]{"a","b","c"});
        System.out.println(gt2);

    }
}
