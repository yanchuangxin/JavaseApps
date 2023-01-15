import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/10 - 10:46
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test08 {
    public static void main(String[] args) {
        //格式化类：DateTimeFormatter
        //方式一:预定义的标准格式。如: ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE;IS0_LOCAL_TIME
        //noinspection unused
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //df1就可以帮我们完成LocalDateTime和String之间的相互转换：
        //LocalDateTime-->String:
        LocalDateTime now = LocalDateTime.now();
        String str = dateTimeFormatter.format(now);
        System.out.println(str);
        //String--->LocalDateTime
        TemporalAccessor temporalAccessor = dateTimeFormatter.parse("2020-06-15T15:02:51.29");
        System.out.println(temporalAccessor);
        //方式二:本地化相关的格式。如: oflocalizedDateTime()
        //参数：FormatStyle.LONG / FormatStyle.MEDIUM / FormatStyle.SHORT
        //FormatStyle.LONG :2020年6月15日 下午03时17分13秒
        //FormatStyle.MEDIUM: 2020-6-15 15:17:42
        //FormatStyle.SHORT:20-6-15 下午3:18
        DateTimeFormatter df2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        //LocalDateTime-->String:
        LocalDateTime now1 = LocalDateTime.now();
        String str2 = df2.format(now1);
        System.out.println(str2);
        //String--->LocalDateTime
        TemporalAccessor parse1 = df2.parse("23-1-10 上午11:06");
        System.out.println(parse1);
        //方式三: 自定义的格式。如: ofPattern( "yyyy-MM-dd hh:mm:ss") ---》重点，以后常用
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //LocalDateTime-->String:
        LocalDateTime localDateTime= LocalDateTime.now();
        String format = dateTimeFormatter1.format(localDateTime);
        System.out.println(format);
        //String--->LocalDateTime
        TemporalAccessor parse = dateTimeFormatter1.parse("2020-06-15 03:22:03");
        System.out.println(parse);

    }
}
