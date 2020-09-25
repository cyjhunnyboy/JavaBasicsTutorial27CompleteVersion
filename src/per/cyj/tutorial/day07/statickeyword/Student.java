package per.cyj.tutorial.day07.statickeyword;

/**
 * static关键字
 *
 * @author chenyongjun
 * @since 2020-02-09
 */

/*
    static特点：（可以修饰成员变量，还可以修饰成员方法）
        1、随着类的加载而加载
            回想main方法
        2、优于对象存在
        3、被类的所有对象共享
            举例1：
                 咱们班级的学生应该共享同一个班级编号。
                 其实这个特点也是在告诉我们什么时候使用静态？
                 如果某个成员变量是被所有对象共享的，那么它就应该定义为静态的。
            举例：
                 饮水机（用静态修饰）
                 水杯（不能使用静态修饰）
        4、可以通过类名调用
            其实它本身也可以通过对象名调用
            推荐使用类名调用。
            静态修饰的内容一般我们称其为：与类相关的，类成员
 */
public class Student {

    // 静态变量
    static int num2 = 20;
    // 非静态变量
    int num = 10;
}
