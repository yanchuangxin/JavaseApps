import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/11 - 17:04
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        //1.有个目标文件：
        File f = new File("D:"+File.separator+"demo.txt");
        //2.FileWriter管怼到文件上去：
        FileWriter fw =new FileWriter(f);
        //3.开始动作：输出动作：
        //一个字符一个字符的往外输出：
        String str = "hello你好";
        for (int i = 0; i < str.length(); i++) {
            fw.write(str.charAt(i));
        }

        //4.关闭流：
        fw.close();
      /*  发现：
        如果目标文件不存在的话，那么会自动创建此文件。
        如果目标文件存在的话：
        new FileWriter(f)   相当于对原文件进行覆盖操作。
        new FileWriter(f,false)  相当于对源文件进行覆盖操作。不是追加。
        new FileWriter(f,true)   对原来的文件进行追加，而不是覆盖。*/
    }
}
