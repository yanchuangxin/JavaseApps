import java.util.Comparator;

/**
 * @Auther: yanchuangxin
 * @Date: 2023/1/11 - 9:29
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
class Student implements Comparable<Student>{
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }

    private double height;

    public Student(int age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }
}
class BiJiao01 implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        //比较年龄：
        return o1.getName().compareTo(o2.getName());
    }
}
public class Test13 {
    public static void main(String[] args) {
        Student s1 = new Student(14,160.5,"da");
        Student s2 = new Student(14,170.5,"dd");
        System.out.println(s1.compareTo(s2));
        Comparator biJiao01 = new BiJiao01();
        biJiao01.compare(s1,s2);

    }
}
