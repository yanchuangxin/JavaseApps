import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/11 - 9:46
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
class Student2 implements Comparable<Student2> {
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Student2(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public int compareTo(Student2 o) {
        return this.getAge()-o.getAge();
    }
}
class BiJiao implements Comparator<Student2> {
    @Override
    public int compare(Student2 o1, Student2 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
public class Test14 {
    public static void main(String[] args) {
        //特点：唯一，无序（没有按照输入顺序进行输出）， 有序（按照升序进行遍历）
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(20);
        ts.add(3);
        ts.add(16);
        ts.add(3);
        System.out.println(ts.size());
        System.out.println(ts);

        TreeSet<String> ts2 = new TreeSet<>();
        ts2.add("alili");
        ts2.add("clili");
        ts2.add("blili");
        ts2.add("alili");
        ts2.add("flili");
        System.out.println(ts2.size());
        System.out.println(ts2);

        TreeSet<Student2> ts3 = new TreeSet<>();
        ts3.add(new Student2(10,"elili"));
        ts3.add(new Student2(8,"blili"));
        ts3.add(new Student2(4,"alili"));
        ts3.add(new Student2(9,"elili"));
        ts3.add(new Student2(10,"flili"));
        ts3.add(new Student2(1,"dlili"));
        System.out.println(ts3.size());
        System.out.println(ts3);
        Comparator<Student2> com = new BiJiao();
        TreeSet<Student2> ts4 = new TreeSet<>(com);//一旦指定外部比较器，那么就会按照外部比较器来比较
        ts4.add(new Student2(10,"elili"));
        ts4.add(new Student2(8,"blili"));
        ts4.add(new Student2(4,"alili"));
        System.out.println(ts4.add(new Student2(9, "elili")));
        ts4.add(new Student2(10,"flili"));
        ts4.add(new Student2(1,"dlili"));
        System.out.println(ts4.size());
        System.out.println(ts4);
        TreeSet<Student2> ts5 = new TreeSet<>(new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        ts5.add(new Student2(10,"elili"));
        ts5.add(new Student2(8,"blili"));
        ts5.add(new Student2(4,"alili"));
        ts5.add(new Student2(9,"elili"));
        ts5.add(new Student2(10,"flili"));
        ts5.add(new Student2(1,"dlili"));
        System.out.println(ts5.size());
        System.out.println(ts5);

    }
}
