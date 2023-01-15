import java.io.*;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/12 - 14:19
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test10 {
    public static void main(String[] args) throws IOException {
        //1.有一个源文件：
        File f1 = new File("d:\\Test.txt");
        //2.有一个目标文件：
        File f2 = new File("d:\\Demo.txt");
        //3.需要一个管 怼到 源文件：
        FileReader fr = new FileReader(f1);
        //4.需要一根管怼到目标文件：
        FileWriter fw = new FileWriter(f2);
        //5.套一根管在输入字符流外面：
        BufferedReader bufferedReader=new BufferedReader(fr);
        //6.套一根管在输出字符流外面：
        BufferedWriter bufferedWriter=new BufferedWriter(fw);
        //7.开始动作：

        //方式1：读取一个字符，输出一个字符：
        /*int n = br.read();
        while(n!=-1){
            bw.write(n);
            n = br.read();
        }*/

        //方式2:利用缓冲数组：
        /*char[] ch = new char[30];
        int len = br.read(ch);
        while(len!=-1){
            bw.write(ch,0,len);
            len = br.read(ch);
        }*/

        //方式3：读取String：
        String str = bufferedReader.readLine();//每次读取文本文件中一行，返回字符串
        while(str!=null){
            bufferedWriter.write(str);
            //在文本文件中应该再写出一个换行：
            bufferedWriter.newLine();//新起一行
            str = bufferedReader.readLine();
        }

        //8.关闭流
        bufferedWriter.close();
        bufferedReader.close();
    }
}
