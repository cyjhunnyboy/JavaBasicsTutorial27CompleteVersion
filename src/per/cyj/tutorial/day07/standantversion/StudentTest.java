package per.cyj.tutorial.day07.standantversion;

/**
 * 学生类测试类
 *
 * @author chenyongjun
 * @since 2020-02-09
 */
public class StudentTest {

    public static void main(String[] args) {
        // 方式1给成员变量赋值
        // 无参构造方法+setXxx()
        Student s1 = new Student();
        s1.setName("林青霞");
        s1.setAge(27);
        // 输出成员变量值
        System.out.println(s1.getName() + "---" + s1.getAge());
        s1.show();

        System.out.println("-----------------");

        // 方式2给成员变量赋值
        Student s2 = new Student("刘亦菲", 22);
        System.out.println(s2.getName() + "---" + s2.getAge());
        s2.show();
    }
}
