import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/10 - 17:27
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test10 {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        list.add("ee");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            if("cc".equals(it.next())){
               // list.add("KK");
            }
        }
        System.out.println(it.hasNext());


    }
}
