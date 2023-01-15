import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/10 - 15:40
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Collection col=new ArrayList();
        col.add(18);
        col.add(12);
        col.add("asc");
        col.add(6.33);
        for (int i = 0; i < col.size(); i++) {
        }
        //方式2：增强for循环
        for(Object o:col){
            System.out.println(o);
        }
        System.out.println("------------------------");
        //方式3：iterator()
        Iterator it = col.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
