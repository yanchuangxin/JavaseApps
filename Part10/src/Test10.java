import static java.lang.Math.*;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/10 - 11:33
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test10 {
    public static void main(String[] args) {
        //常用属性：
        System.out.println(PI);
        //常用方法：
        System.out.println("随机数："+random());//[0.0,1.0)
        System.out.println("绝对值："+abs(-80));
        System.out.println("向上取值："+ceil(9.1));
        System.out.println("向下取值："+floor(9.9));
        System.out.println("四舍五入："+round(3.5));
        System.out.println("取大的那个值："+max(3, 6));
        System.out.println("取小的那个值："+min(3, 6));
    }
    //如果跟Math中方法重复了，那么会优先走本类中的方法（就近原则）
    public static int random(){
        return 100;
    }
}
