package per.cyj.tutorial.day08.inherit.training.demo03;

/**
 * 学生案例和老师案例讲解
 *      学生：
 *          成员变量：姓名，年龄
 *          构造方法：无参，带参
 *          成员方法：getXxx()/setXxx()
 *      老师：
 *          成员变量：姓名，年龄
 *          构造方法：无参，带参
 *          成员方法：getXxx()/setXxx()
 *
 * @author chenyongjun
 * @since 2020-02-10
 */
// 定义学生类
public class Student {

    // 姓名
    private String name;
    // 年龄
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
