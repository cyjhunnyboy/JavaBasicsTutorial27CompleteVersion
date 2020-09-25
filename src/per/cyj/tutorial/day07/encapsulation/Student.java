package per.cyj.tutorial.day07.encapsulation;

/**
 * 学生类
 *
 * @author chenyongjun
 * @since 2020-02-09
 */

/*
    定义一个学生类：
        成员变量：name, age
        成员方法：show()
 */
public class Student {

    // 姓名
    String name;
    // 年龄
    private int age;

    // 写一个方法对数据进行校验
    /*
        返回值类型：void
        参数列表：int a
     */
    public void setAge(int a) {
        if (a < 0 || a > 120) {
            System.out.println("你给的年龄有问题");
        } else {
            age = a;
        }
    }

    // show()方法，显示所有成员变量值
    public void show() {
        System.out.println("姓名：" + name + "，年龄：" + age);
    }
}
