package per.cyj.tutorial.day06.objectoriented.classandobject.objectuse;

/**
 * 学生类
 *
 * @author chenyongjun
 * @since 2020-02-08
 */

/*
    在一个Java文件中定义两个类：一个基本的类，一个测试类
    注意：文件名称和测试类名一致

    如何使用呢？
        创建对象使用。

    如何创建对象呢？
        格式：类名 对象名 = new 类名();

    如何使用成员变量呢？
        对象名.成员变量名
    如何使用成员方法呢？
        对象名.成员方法名();
 */

// 这是学生测试类
public class StudentDemo {

    public static void main(String[] args) {
        // 类名 对象名 = new 类名();
        Student s = new Student();

        // 输出成员变量的值
        // System.out.println(s.name);
        // System.out.println(s.age);
        // System.out.println(s.address);
        System.out.println(s.name + "---" + s.age + "---" + s.address);

        // 给成员变量赋值
        s.name = "林青霞";
        s.age = 25;
        s.address = "北京";
        System.out.println(s.name + "---" + s.age + "---" + s.address);

        // 调用方法
        s.study();
        s.eat();
        s.sleep();
    }
}

// 这是学生类
class Student {

    // 姓名
    String name;    // 默认值：null
    // 年龄
    int age;        // 默认值：0
    // 地址
    String address; // 默认值：null

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
