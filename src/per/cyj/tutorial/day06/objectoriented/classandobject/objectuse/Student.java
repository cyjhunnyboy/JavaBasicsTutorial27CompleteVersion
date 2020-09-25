package per.cyj.tutorial.day06.objectoriented.classandobject.objectuse;

/**
 * 学生类
 *
 * @author chenyongjun
 * @since 2020-02-08
 */

// 这是学生类
public class Student {

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
