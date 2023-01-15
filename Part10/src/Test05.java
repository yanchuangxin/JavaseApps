import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/9 - 16:32
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test05 {
    public static void main(String[] args) {
        DateFormat dataFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date d = dataFormat.parse("2019-4-6 12:23:54");
            System.out.println(dataFormat.format(d));

        } catch (ParseException e) {
            e.printStackTrace();
        }
        //Date--->String
        String format = dataFormat.format(new Date());
        System.out.println(format);
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.toGMTString());
        System.out.println(date.toLocaleString());
    }
}
