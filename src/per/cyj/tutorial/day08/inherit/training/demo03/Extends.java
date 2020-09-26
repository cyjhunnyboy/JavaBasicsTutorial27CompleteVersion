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
public class Extends {

    public static void main(String[] args) {
        // 创建学生对象并测试
        // 方式1
        Student s1 = new Student();
        s1.setName("林青霞");
        s1.setAge(27);
        System.out.println(s1.getName() +  "----" + s1.getAge());

        // 方式2
        Student s2 = new Student("林青霞", 27);
        System.out.println(s2.getName() +  "----" + s2.getAge());

        // 创建老师类并测试
        Teacher t1 = new Teacher();
        t1.setName("刘亦菲");
        t1.setAge(27);
        System.out.println(t1.getName() +  "----" + t1.getAge());

        // 方式2
        Teacher t2 = new Teacher("刘亦菲", 27);
        System.out.println(t2.getName() +  "----" + t2.getAge());
    }
}
