import java.sql.Date;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/9 - 16:25
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        Date date=new Date(1592055964263L);
        System.out.println(date);
        java.util.Date date2 = new Date(1592055964263L);

        //【1】util--->sql:
        Date date1 = (Date) date2;

        //【2】sql-->util:
        java.util.Date date3 = date;

        //[3]String--->sql.Date:
        Date date4 = Date.valueOf("2020-12-31");

        System.out.println(date4);
    }
}
