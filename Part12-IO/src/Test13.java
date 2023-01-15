import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/12 - 15:49
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test13 {
    public static void main(String[] args) throws IOException {
        /*InputStream in = System.in;
        int n = in.read();
        System.out.println(n);*/

        /*Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);*/

        Scanner sc = new Scanner(new FileInputStream(new File("d:\\Test.txt")));
        while(sc.hasNext()){
            System.out.println(sc.next());
        }
    }
}
