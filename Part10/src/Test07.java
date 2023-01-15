import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/10 - 10:23
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test07 {
    public static void main(String[] args) {
        //Ctrl+Alt+V 自动生成变量名
        //1.完成实例化：
        //方法1：now()--获取当前的日期，时间，日期+时间
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        //方法2：of()--设置指定的日期，时间，日期+时间
        LocalDate localDate1 = LocalDate.of(2023, 1, 10);
        System.out.println(localDate1);
        LocalTime localTime1 = LocalTime.of(12, 23, 56);
        System.out.println(localTime1);
        LocalDateTime localDateTime1 = LocalDateTime.of(2023, 1, 10, 12, 12, 23);
        System.out.println(localDateTime1);
        //LocalDate,LocalTime用的不如LocalDateTime多
        //下面讲解用LocalDateTime：
        //一些列常用的get***
        System.out.println(localDateTime.getYear());//2020
        System.out.println(localDateTime.getMonth());//JUNE
        System.out.println(localDateTime.getMonthValue());//6
        System.out.println(localDateTime.getDayOfMonth());//14
        System.out.println(localDateTime.getDayOfWeek());//SUNDAY
        System.out.println(localDateTime.getHour());//22
        System.out.println(localDateTime.getMinute());//22
        System.out.println(localDateTime.getSecond());//6
        //不是set方法，叫with
        //体会：不可变性
        LocalDateTime localDateTime2 = localDateTime.withMonth(8);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);

        //提供了加减的操作：
        //加：
        LocalDateTime localDateTime3 = localDateTime.plusMonths(4);
        System.out.println(localDateTime);
        System.out.println(localDateTime3);
        //减：
        LocalDateTime localDateTime4 = localDateTime.minusMonths(5);
        System.out.println(localDateTime);
        System.out.println(localDateTime4);
    }
}
