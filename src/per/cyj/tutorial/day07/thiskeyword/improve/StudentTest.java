package per.cyj.tutorial.day07.thiskeyword.improve;

/**
 * this关键字使用
 *
 * @author chenyongjun
 * @since 2020-02-09
 */

public class StudentTest {

    public static void main(String[] args) {
        // 创建第一个对象
        Student s1 = new Student();
        s1.setName("林青霞");
        s1.setAge(27);
        System.out.println(s1.getName() + "---" + s1.getAge());

        // 创建第二个对象
        Student s2 = new Student();
        s2.setName("刘意");
        s2.setAge(30);
        System.out.println(s2.getName() + "---" + s2.getAge());
    }
}
