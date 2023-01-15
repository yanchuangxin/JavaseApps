import java.io.*;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/12 - 14:44
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test12 {
    public static void main(String[] args) throws IOException {
        //1.有一个源文件
        File f1 = new File("d:\\Test.txt");

        //2.有一个目标文件：
        File f2 = new File("d:\\Demo.txt");
        //3.输入方向：
        FileInputStream fileInputStream=new FileInputStream(f1);
        InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream,"utf-8");
        //4.输出方向：
        FileOutputStream fileOutputStream=new FileOutputStream(f2);
        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream,"gbk");
        //5.开始动作：
        char[] ch =new char[20];
        int len = inputStreamReader.read(ch);
        while(len!=-1){
            outputStreamWriter.write(ch,0,len);
            len = inputStreamReader.read(ch);
        }

        outputStreamWriter.close();
        inputStreamReader.close();

    }
}
