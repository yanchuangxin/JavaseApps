import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/10 - 16:35
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test07 {
    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<?> list = null;
        list = list1;
        list = list2;
        list = list3;
    }
}
