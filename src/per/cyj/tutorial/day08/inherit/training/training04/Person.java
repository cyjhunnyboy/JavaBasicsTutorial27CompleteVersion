package per.cyj.tutorial.day08.inherit.training.training04;

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
 *      看上面两个类的成员，发现了很多相同的东西，所以我们就考虑抽取一个共性的类
 *      人：
 *          成员变量：姓名，年龄
 *          构造方法：无参，带参
 *          成员方法：getXxx()/setXxx()
 *          学生 继承 人
 *          老师 继承 人
 *
 * @author chenyongjun
 * @since 2020-02-10
 */
// 人类
public class Person {

    // 姓名
    private String name;
    // 年龄
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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
