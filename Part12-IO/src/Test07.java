import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/12 - 11:20
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test07 {
    public static void main(String[] args) throws IOException {
        //功能：利用字节流将文件中内容读到程序中来：
        //1.有一个源文件：
        File f=new File("D:"+File.separator+"test1.png");
        //2.将一个字节流这个管 怼  到 源文件上：
        FileInputStream fis = new FileInputStream(f);
       /*
        细节1：
        文件是utf-8进行存储的，所以英文字符 底层实际占用1个字节
        但是中文字符，底层实际占用3个字节。
        细节2：
        如果文件是文本文件，那么就不要使用字节流读取了，建议使用字符流。
        细节3：
        read()读取一个字节，但是你有没有发现返回值是 int类型，而不是byte类型？
        read方法底层做了处理，让返回的数据都是“正数”
        就是为了避免如果字节返回的是-1的话，那到底是读入的字节，还是到文件结尾呢。
         */
        //3.开始读取动作
        int count = 0;//定义一个计数器，用来计读入的字节的个数
        //利用缓冲数组：（快递员的小车）
        byte[] b = new byte[1024*6];

        int len =fis.read(b);
        while (len !=-1){
            count++;
           // System.out.print(len);
            for (int i = 0; i < len; i++) {
                System.out.println(b[i]);
            }
            len = fis.read(b);
        }
        System.out.println("count="+count);
        //4.关闭流：
        fis.close();
    }
}
