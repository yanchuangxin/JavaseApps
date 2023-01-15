import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/12 - 13:32
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test08 {
    public static void main(String[] args) {
        //功能：完成图片的复制：
        //1.有一个源图片
        File f1=new File("d:\\111111.JPG");
        //2.有一个目标图片：
        File f2=new File("d:\\222222.JPG");
        try {
            //3.有一个输入的管道 怼 到 源文件：
            FileInputStream fileInputStream=new FileInputStream(f1);
            //4.有一个输出的管道 怼到  目标文件上：
            FileOutputStream fileOutputStream=new FileOutputStream(f2);
            //5.开始复制：（边读边写）
            long startTime = System.currentTimeMillis();
            byte[] ch =new byte[1024];
            int len = fileInputStream.read(ch);
            while (len!=-1){
                fileOutputStream.write(ch,0,len);
                len=fileInputStream.read(ch);
            }
            long endTime = System.currentTimeMillis();
            System.out.println("复制完成的时间为："+(endTime-startTime));

            //6.关闭流：(倒着关闭流，先用后关)
            fileOutputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
        }
    }
}
