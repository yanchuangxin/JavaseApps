import java.io.*;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/12 - 14:33
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test11 {
    public static void main(String[] args) throws IOException {
        //文件---》程序：
        //1.有一个源文件：
        File f = new File("d:\\Test.txt");
        //2.需要一个输入的字节流接触文件：
        FileInputStream fis = new FileInputStream(f);
        //3.加入一个转换流，将字节流转换为字符流：（转换流属于一个处理流）
        InputStreamReader isr = new InputStreamReader(fis);
        //4.开始动作，将文件中内容显示在控制台：
        char[] ch = new char[20];
        int len = isr.read(ch);
        while(len!=-1){
            //将缓冲数组转为字符串在控制台上打印出来
            System.out.print(new String(ch,0,len));
            len = isr.read(ch);
        }
        //5.关闭流：
        isr.close();

    }
}
