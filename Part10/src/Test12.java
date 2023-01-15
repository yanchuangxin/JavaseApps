/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/10 - 11:53
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test12 {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("nihao wode shijie");
        sb.append("这是梦想");
        sb.delete(3,6);
        System.out.println(sb);
        sb.deleteCharAt(16);
        System.out.println(sb);

        StringBuilder sb1=new StringBuilder("$23445980947");
        sb1.insert(3, ",");//在下标为3的位置上插入 ,
        System.out.println(sb1);
        StringBuilder sb2=new StringBuilder("$2你好吗5980947");
        sb2.replace(3, 5, "我好累");//在下标[3,5)位置上插入字符串
        System.out.println(sb2);
        sb2.setCharAt(3, '!');
        System.out.println(sb2);
        StringBuilder sb3=new StringBuilder("asdfa");
        for (int i = 0; i < sb3.length(); i++) {
            System.out.print(sb3.charAt(i)+"\t");
        }
        System.out.println();
////////////////////////////////////////////////////////////////////////////////////////
        StringBuffer sb5=new StringBuffer("nihaojavawodeshijie");
        //增
        sb5.append("这是梦想");
        System.out.println(sb5);//nihaojavawodeshijie这是梦想
        //删
        sb5.delete(3, 6);//删除位置在[3,6)上的字符
        System.out.println(sb5);//nihavawodeshijie这是梦想
        sb5.deleteCharAt(16);//删除位置在16上的字符
        System.out.println(sb5);//nihavawodeshijie是梦想
        //改-->插入
        StringBuilder sb6=new StringBuilder("$23445980947");
        sb6.insert(3, ",");//在下标为3的位置上插入 ,
        System.out.println(sb6);
        StringBuilder sb7=new StringBuilder("$2你好吗5980947");
        //改-->替换
        sb7.replace(3, 5, "我好累");//在下标[3,5)位置上插入字符串
        System.out.println(sb7);
        sb7.setCharAt(3, '!');
        System.out.println(sb7);
        //查
        StringBuilder sb8=new StringBuilder("asdfa");
        for (int i = 0; i < sb8.length(); i++) {
            System.out.print(sb8.charAt(i)+"\t");
        }
        System.out.println();
        //截取
        String str=sb8.substring(2,4);//截取[2,4)返回的是一个新的String，对StringBuilder没有影响
        System.out.println(str);
        System.out.println(sb8);
    }
}
