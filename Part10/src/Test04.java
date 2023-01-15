/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/9 - 16:33
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test04 {
    public static void main(String[] args) {
        //（1）String--->java.sql.Date
        java.sql.Date date=java.sql.Date.valueOf("2023-01-09");
        //（2）java.sql.Date--->java.util.Date
        java.util.Date date1=date;
        System.out.println(date1);
    }
}
