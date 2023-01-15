import java.util.Date;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/9 - 16:13
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        System.out.println(date.toString());
        System.out.println(date.toGMTString());
        System.out.println(date.toLocaleString());

        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getTime());
        System.out.println(System.currentTimeMillis());
        long startTime=System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            System.out.println(i);
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);

    }
}
