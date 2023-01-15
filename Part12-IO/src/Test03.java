import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/11 - 16:39
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        //1.有一个文件：----》创建一个File类的对象
        File f = new File("d:\\Test.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        //2.利用FileReader这个流，这个“管”怼到源文件上去   ---》创建一个FileReader的流的对象
        FileReader fr =new FileReader(f);
        //3.进行操作“吸”的动作  ---》读取动作
        //下面的代码我们验证了：如果到了文件的结尾处，那么读取的内容为-1
       /* int n1 = fr.read();
        int n2 = fr.read();
        int n3 = fr.read();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);*/
       /* int n;
        while ((n=fr.read())!=-1){
            System.out.print((char)n);
        }*/
        //引入一个“快递员的小车”，这个“小车”一次拉5个快递：
        char[] ch = new char[5];//缓冲数组
        int len = fr.read(ch);//一次读取五个:返回值是这个数组中 的有效长度
        while(len!=-1){
            System.out.print(new String(ch, 0, len));
            len = fr.read(ch);
        }

        //4.“管”不用了，就要关闭  ---》关闭流
        //流，数据库，网络资源，靠jvm本身没有办法帮我们关闭，此时必须程序员手动关闭：
        fr.close();


    }
}
