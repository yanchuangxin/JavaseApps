import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/11 - 14:35
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test19 {
    public static void main(String[] args) {
        //ArrayList为案例：从线程不安全  转为线程安全：
        List list = Collections.synchronizedList(new ArrayList<>());
       // ArrayList list = new ArrayList();
        //创建一个线程池：线程池定长100
        ExecutorService es = Executors.newFixedThreadPool(100);
        //并发向集合中添加10000个数据：
        for (int i = 0; i < 10000; i++) {
            es.execute(new Runnable() {
                @Override
                public void run() {
                    list.add("aaa");
                }
            });
        }
        //关闭线程池：
        es.shutdown();
        //监控线程是否执行完毕：
        while(true){
            if(es.isTerminated()){
                System.out.println("所有的子线程都执行完毕了！");
                //执行完毕以后看一下集合中元素的数量：
                if(list.size()==10000){
                    System.out.println("线程安全！");
                }else{
                    System.out.println("线程不安全！");
                }
                //线程执行完以后，while循环可以停止：
                break;
            }
        }
    }
}
