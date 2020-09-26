package per.cyj.tutorial.day08.inherit.training.demo04;

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
// 定义学生类
public class Student extends Person {

    public Student() {
    }

    public Student(String name, int age) {
        // this.name = name;
        // this.age = age;
        super(name, age);
    }
}
