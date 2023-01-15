import java.io.*;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/11 - 17:29
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test06 {
    public static void main(String[] args) {
        //1.有一个源文件
        File f1 = new File("d:\\Test.txt");
        //2.有一个目标文件：
        File f2 = new File("d:\\Demo.txt");

        FileReader fr = null;
        FileWriter fw = null;

        try {
            //3.搞一个输入的管 怼到源文件上：
            fr = new FileReader(f1);
            //4.搞一个输出的管，怼到目标文件上：
            fw = new FileWriter(f2);
            //5.开始动作：
            char[] chars = new char[5];
            int len = fr.read(chars);
            while (len != -1) {
                fw.write(chars, 0, len);
                len = fr.read(chars);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //6.关闭流：(关闭流的时候，倒着关闭，后用先关)
            try {
                if (fw != null)
                    fw.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                if (fr != null)
                    fr.read();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
