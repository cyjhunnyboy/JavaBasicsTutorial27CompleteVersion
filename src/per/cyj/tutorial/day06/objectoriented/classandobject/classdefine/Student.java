package per.cyj.tutorial.day06.objectoriented.classandobject.classdefine;

/**
 * 学生类
 *
 * @author chenyongjun
 * @since 2020-02-08
 */

/*
    事物：
        属性：事物的信息描述
        行为：事物的功能

    类：
        成员变量：事物的属性
        成员方法：事物的行为

    定义一个类，其实就是定义类的成员变量和成员方法

    案例：定义一个学生类

    学生事物：
        属性：姓名、年龄，地址...
        行为：学习，吃饭，睡觉...

    把事物转换为对应的类

    学生类：
        成员变量：姓名、年龄、地址...
        成员方法：学习，吃饭，睡觉...

    成员变量：和以前定义常量是一样的，只不过位置发生了改变。在类中，方法外。
    成员方法：和以前定义方法是一样的，只不过把static去掉，后面再详细讲解static的作用

    首先我们先定义一个类，然后完成类的成员
 */

// 这是我的学生类
public class Student {

    // 定义变量
    // 姓名
    String name;
    // 年龄
    int age;
    // 地址
    String address;

    // 定义方法
    // 学习的方法
    public void study() {
        System.out.println("学生爱学习！");
    }

    // 吃饭的方法
    public void eat() {
        System.out.println("学习累了，要吃饭！");
    }

    // 睡觉的方法
    public void sleep() {
        System.out.println("学习累了，要睡觉！");
    }
}
