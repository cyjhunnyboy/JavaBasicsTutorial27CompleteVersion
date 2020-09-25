package per.cyj.tutorial.day08.codeblock;

/**
 * 写程序的执行结果
 * <p>
 * 1、林青霞都60了，我很伤心。
 * 2、我是main方法
 * 3、Student 静态代码块
 * 4、Student 构造代码块
 * 5、Student 构造方法
 * 6、Student 构造代码块
 * 7、Student 构造方法
 *
 * @author chenyongjun
 * @since 2020-02-09
 */
public class StudentDemo {

    static {
        System.out.println("林青霞都60了，我很伤心。");
    }

    public static void main(String[] args) {
        System.out.println("我是main方法");

        Student s1 = new Student();
        Student s2 = new Student();
    }
}
