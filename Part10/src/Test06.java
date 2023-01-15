import java.util.Calendar;
import java.util.Scanner;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/9 - 16:47
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你想要查看的日期：（提示：请按照例如2012-5-6的格式书写）");
        String strDate = sc.next();
        java.sql.Date date = java.sql.Date.valueOf(strDate);
        //Date--->Calendar:
        Calendar cal =Calendar.getInstance();
        cal.setTime(date);
        System.out.println(cal.getTime());
        //后续操作：
        //星期提示：
        System.out.println("日\t一\t二\t三\t四\t五\t六\t");

        int maxDay = cal.getActualMaximum(Calendar.DATE);
        int nowDay = cal.get(Calendar.DATE);

        int num = cal.get(Calendar.DAY_OF_WEEK);
        int day = num - 1;
        int count = 0;//计数器最开始值为0
        for (int i = 1; i <= day; i++) {
            System.out.print("\t");
        }
        count = count + day;
        //遍历：从1号开始到maxDay号进行遍历：
        for (int i = 1; i < maxDay; i++) {
            if(i == nowDay){//如果遍历的i和当前日子一样的话，后面多拼一个*
                System.out.print(i+"*"+"\t");
            }else{
                System.out.print(i+"\t");
            }
            count++;//每在控制台输出一个数字，计数器做加1操作
            if(count%7 == 0){//当计数器的个数是7的倍数的时候，就换行操作
                System.out.println();
            }
        }

    }
}
