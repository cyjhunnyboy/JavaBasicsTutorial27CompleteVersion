package per.cyj.tutorial.day07.privatekeyword;

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

        // 使用成员变量
        // 错误：被私有修饰了，外界不能直接访问了
        // System.out.println(s.name + "---" + s.age);
        System.out.println(s.getName() + "---" + s.getAge());

        // 给成员变量赋值
        // s.name = "林青霞";
        // s.age = 27;
        s.setName("林青霞");
        s.setAge(27);
        System.out.println(s.getName() + "---" + s.getAge());
    }
}
