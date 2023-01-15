import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.*;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/11 - 15:15
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test23Queue {

    DelayQueue<User> dq = new DelayQueue<>();
    //登录游戏：
    public void login(User user){
        dq.add(user);
        System.out.println("用户：[" + user.getId() +"],[" + user.getName() + "]已经登录，预计下机时间为：" + user.getEndTime() );
    }
    //时间到，退出游戏，队列中移除：
    public void logout(){
        //打印队列中剩余的人：
        System.out.println(dq);
        try {
            User user = dq.take();
            System.out.println("用户：[" + user.getId() +"],[" + user.getName() + "]上机时间到，自动退出游戏");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //获取在线人数：
    public int onlineSize(){
        return dq.size();
    }

    public static void main(String[] args) throws InterruptedException {
        //创建一个队列，队列可以指定容量指定长度3：
        ArrayBlockingQueue aq =new ArrayBlockingQueue(3);
        //添加元素：
        //【1】添加null元素：不可以添加null元素，会报空指针异常：NullPointerException
        //aq.add(null);
        //【2】正常添加元素：
        aq.add("aaa");
        aq.offer("bbb");

        try {
            aq.put("ccc");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(aq);//[aaa, bbb, ccc]
        //【3】在队列满的情况下，再添加元素：
       // aq.add("ddd");//在队列满的情况下，添加元素 出现异常：Queue full
        System.out.println(aq.offer("ddd"));//没有添加成功，返回false
       //设置最大阻塞时间，如果时间到了，队列还是满的，就不再阻塞了
   /*     try {
            System.out.println(aq);
            aq.offer("ddd",2, TimeUnit.SECONDS);
            System.out.println(aq);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        //真正阻塞的方法： put ,如果队列满，就永远阻塞
       /* try {
            aq.put("ddd");
            System.out.println(aq);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        //得到头元素但是不移除
        System.out.println(aq.peek());
        System.out.println(aq);
        //得到头元素并且移除
        System.out.println(aq.poll());
        System.out.println(aq);
        //得到头元素并且移除
        aq.take();
        System.out.println();
        System.out.println(aq);
        //清空元素：
        aq.clear();
        System.out.println(aq);
       // System.out.println(aq.take());
        System.out.println("-----------------------------------");

        LinkedBlockingDeque linkedBlockingDeque=new LinkedBlockingDeque(3);
        //【1】添加null元素：不可以添加null元素，会报空指针异常：NullPointerException
        //linkedBlockingDeque.put(null);
        //【2】正常添加元素：
        linkedBlockingDeque.add("1111111111");
        linkedBlockingDeque.offer("222");
        linkedBlockingDeque.put("dee");
        System.out.println(linkedBlockingDeque);
        //linkedBlockingDeque.add("dd");//在队列满的情况下，添加元素 出现异常：Queue full
        System.out.println(linkedBlockingDeque.offer("ddd"));//添加成功，返回true
        //设置最大阻塞时间，如果时间到了，队列还是满的，就不再阻塞了
        System.out.println(linkedBlockingDeque.offer("ddd", 2, TimeUnit.SECONDS));
        //真正阻塞的方法： put ,如果队列满，就永远阻塞
       // linkedBlockingDeque.put("ddd");
        System.out.println(linkedBlockingDeque);

        SynchronousQueue sq = new SynchronousQueue();
        //创建一个线程，取数据：
      /*  new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try {
                        System.out.println(sq.take());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();*/

        //搞一个线程，往里面放数据：
       /* new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sq.put("aaa");
                    sq.put("bbb");
                    sq.put("ccc");
                    sq.put("ddd");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();*/
       new Thread(new Runnable() {
           @Override
           public void run() {
               while (true){
                   //设置一个阻塞事件：超出事件就不阻塞了
                   try {
                       Object res = sq.poll(1,TimeUnit.SECONDS);
                       System.out.println(res);
                       if(res==null){
                          break;
                       }
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
           }
       }).start();

       new Thread(new Runnable() {
           @Override
           public void run() {
               try {
                   sq.put("aaa1");
                   sq.put("aaa2");
                   sq.put("aaa3");
                   sq.put("aaa4");
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }

           }
       }).start();
        //优先级 --》取数据的优先级
        PriorityBlockingQueue pq=new PriorityBlockingQueue();
        pq.put(new Student(1,18,""));
        pq.put(new Student(4,11,""));
        pq.put(new Student(5,6,""));
        pq.put(new Student(3,21,""));
        System.out.println(pq);
        System.out.println("------------------------------------------");
        System.out.println(pq.take());
        System.out.println(pq.take());
        System.out.println(pq.take());
        System.out.println(pq.take());


        Test23Queue test23Queue=new Test23Queue();
        test23Queue.login(new User(1,"张三",System.currentTimeMillis()+5000));
        test23Queue.login(new User(2,"张三",System.currentTimeMillis()+2000));
        test23Queue.login(new User(3,"张三",System.currentTimeMillis()+10000));
        while (true){
            test23Queue.logout();
            if(test23Queue.onlineSize()==0)
                break;;
        }
 /*
        双端队列：
        Deque<E> extends Queue
        Queue一端放 一端取的基本方法  Deque是具备的
        在此基础上 又扩展了 一些 头尾操作（添加，删除，获取）的方法
         */
        Deque<String> d = new LinkedList<>() ;
        d.offer("A");
        d.offer("B");
        d.offer("C");
        System.out.println(d);//[A, B, C]
        d.offerFirst("D");
        d.offerLast("E");
        System.out.println(d);//[D, A, B, C, E]
        System.out.println(d.poll());
        System.out.println(d);//[A, B, C, E]
        System.out.println(d.pollFirst());
        System.out.println(d.pollLast());
        System.out.println(d);

    }
}

class User implements Delayed{
    public  int id;
    private String name;
    private long endTime;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public User(int id, String name, long endTime) {
        this.id = id;
        this.name = name;
        this.endTime = endTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        //计算剩余时间 剩余时间小于0 <=0  证明已经到期
        return this.endTime - System.currentTimeMillis();
    }

    @Override
    public int compareTo(Delayed o) {
        //队列中数据 到期时间的比较
        User other = (User)o;
        return ((Long)(this.getEndTime())).compareTo((Long)(other.getEndTime()));
    }
}