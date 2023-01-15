import java.io.*;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/11 - 17:18
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        //1.有一个源文件
        File f1 = new File("d:\\Test.txt");
        //2.有一个目标文件：
        File f2 = new File("d:\\Demo.txt");
        //3.搞一个输入的管 怼到源文件上：
        FileReader fr = new FileReader(f1);
        //4.搞一个输出的管，怼到目标文件上：
        FileWriter fw = new FileWriter(f2);
        //5.开始动作：
        /*int n= fr.read();
        while(n!=-1){
            fw.write(n);
            n= fr.read();
        }*/


        char[] ch=new char[5];
        int len= fr.read(ch);
        while(len!=-1){
            fw.write(ch,0,len);
            len= fr.read(ch);
        }

        /*char[] ch=new char[5];
        int len= fr.read(ch);
        while(len!=-1){
            fw.write(new String(ch,0,len));
            len= fr.read(ch);
        }*/


        //6.关闭流：(关闭流的时候，倒着关闭，后用先关)
        fw.close();
        fr.close();
    }
}
