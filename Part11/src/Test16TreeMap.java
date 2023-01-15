import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/11 - 11:39
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test16TreeMap {
    public static void main(String[] args) {
       /*
        Map<String,Integer> map = new TreeMap<>();
        map.put("blili",1234);
        map.put("alili",2345);
        map.put("blili",5467);
        map.put("clili",5678);
        map.put("dlili",2345);
        System.out.println(map.size());
        System.out.println(map);

        */
        Map<Student2,Integer> map = new TreeMap<>();
        map.put(new Student2(19,"blili"),1001);
        map.put(new Student2(18,"blili"),1003);
        map.put(new Student2(19,"alili"),1023);
        map.put(new Student2(17,"clili"),1671);
        map.put(new Student2(10,"dlili"),1891);
        System.out.println(map);
        System.out.println(map.size());
        Map<Student,Integer> map3 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        map3.put(new Student(19,12.0,"alii"),1001);
        map3.put(new Student(19,12.0,"adlii"),1001);
        map3.put(new Student(19,12.0,"aclii"),1001);
        map3.put(new Student(19,12.0,"alii"),1001);
        System.out.println(map);
        System.out.println(map.size());
    }
}
