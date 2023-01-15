import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/11 - 14:59
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test20ConcurrentMap {
    public static void main(String[] args) {
        //选择一个容器：
        //ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
        // Hashtable map = new Hashtable();
        HashMap<String,Integer> oldmap = new HashMap<>();
        Map map = Collections.synchronizedMap(oldmap);
        //创建10个线程：
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    long startTime =  System.currentTimeMillis();
                    for (int j = 0; j < 10000; j++) {
                        map.put("test"+j,j);
                    }
                    long endTime = System.currentTimeMillis();
                    System.out.println("一共需要的时间：" + (endTime - startTime));
                }
            }).start();
        }
    }
}
