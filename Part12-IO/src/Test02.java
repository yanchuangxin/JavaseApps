import java.io.File;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/11 - 16:32
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        File f=new File("D:"+ File.separator+"IdeaProjects");
        System.out.println("文件是否可读："+f.canRead());
        System.out.println("文件是否可写："+f.canWrite());
        System.out.println("文件的名字："+f.getName());
        System.out.println("上级目录："+f.getParent());
        System.out.println("是否是一个目录："+f.isDirectory());
        System.out.println("是否是一个文件："+f.isFile());
        System.out.println("是否隐藏："+f.isHidden());
        System.out.println("文件的大小："+f.length());
        System.out.println("是否存在："+f.exists());
        System.out.println("绝对路径："+f.getAbsolutePath());
        System.out.println("相对路径："+f.getPath());
        System.out.println("toString:"+f.toString());

        File f2 = new File("D:\\a\\b\\c");
        //创建目录：
        //f2.mkdir();
        f2.mkdirs();
        System.out.println(f2.exists());
       // f2.delete();
        System.out.println(f2.exists());

        //文件夹下目录/文件对应的名字的数组
        for(String item:f2.list()){
            System.out.println(item);
        }

        File[] files = f.listFiles();//作用更加广泛
        for(File file:files){
            System.out.println(file.getName()+","+file.getAbsolutePath());
        }
    }
}
