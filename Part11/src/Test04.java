import java.util.ArrayList;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/10 - 16:15
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test04 {
    public static void main(String[] args) {
        //创建一个ArrayList集合，向这个集合中存入学生的成绩：
        //加入泛型的优点：在编译时期就会对类型进行检查，不是泛型对应的类型就不可以添加入这个集合。
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(98);
        al.add(18);
        al.add(39);
        al.add(60);
        al.add(83);
       /* al.add("丽丽");
        al.add(9.8);*/
        //对集合遍历查看：
        for(Object obj:al){
            System.out.println(obj);
        }
        for(Integer i:al){
            System.out.println(i);
        }
    }
}
