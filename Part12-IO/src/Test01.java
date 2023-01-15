import java.io.File;
import java.io.IOException;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/11 - 16:16
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("d:\\test.txt");

        File f = new File("d:"+File.separator+"test.txt");//建议使用这种
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.getName());
        System.out.println(f.getParent());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.isHidden());
        System.out.println(f.length());
        System.out.println(f.exists());
        if(f.exists()){
            f.delete();
        }
        else {
            f.createNewFile();
        }

        System.out.println(f == f1);//比较两个对象的地址
        System.out.println(f.equals(f1));//比较两个对象对应的文件的路径
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
        System.out.println("----------------------");
        File f5 = new File("demo.txt");
        if(!f5.exists()){
            f5.createNewFile();
        }
        System.out.println(f5.getAbsolutePath());
        System.out.println(f5.getPath());
        File f6 = new File("a/b/c/demo.txt");
       /* if(!f6.exists()){
            f6.createNewFile();
        }*/
        System.out.println("绝对路径："+f6.getAbsolutePath());
        System.out.println("相对路径："+f6.getPath());
    }
}
