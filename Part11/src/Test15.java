import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/11 - 11:24
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test15 {
    public static void main(String[] args) {
           /*
        增加：put(K key, V value)
        删除：clear() remove(Object key)
        修改：
        查看：entrySet() get(Object key) keySet() size() values()
        判断：containsKey(Object key) containsValue(Object value)
            equals(Object o) isEmpty()
         */
        Map<String,Integer> map = new HashMap<>();
        map.put("lili",10101010);
        map.put("nana",123456);
        System.out.println(map.put("lili", 34565677));
        map.put("mingming",12323);
        map.put("feifei",34563465);
        System.out.println(map);
//        map.clear();
//        System.out.println(map);
//        map.remove("feifei");
//        System.out.println(map);
        System.out.println(map.size());
        Map<String,Integer> map2 = new HashMap<>();
        map2.put("lili",10101010);
        map2.put("nana",123456);
        System.out.println(map2.put("lili", 34565677));
        map2.put("mingming",12323);
        map2.put("feifei",34563465);
        System.out.println(map2);
        System.out.println(map == map2);
        System.out.println(map.equals(map2));

        Set<String> keySet = map.keySet();
        for (String k:keySet){
            System.out.println(map.get(k));
        }
        Collection<Integer> values = map.values();
        for(Integer i:values){
            System.out.println(i);
        }
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for(Map.Entry<String, Integer> item : entrySet){
            System.out.println(item.getKey()+"--"+item.getValue());
        }

    }
}
