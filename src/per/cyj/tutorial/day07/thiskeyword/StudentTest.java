package per.cyj.tutorial.day07.thiskeyword;

/**
 * 封装和private使用
 *
 * @author chenyongjun
 * @since 2020-02-09
 */

public class StudentTest {

    public static void main(String[] args) {
        // 创建学生对象
        Student s = new Student();

        // 给成员变量赋值
        s.setName("林青霞");
        s.setAge(27);
        System.out.println(s.getName() + "---" + s.getAge());
    }
}
