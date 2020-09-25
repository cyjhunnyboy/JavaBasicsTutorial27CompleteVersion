package per.cyj.tutorial.day07.thiskeyword;

/**
 * 学生类
 *
 * @author chenyongjun
 * @since 2020-02-09
 */

/*
    我们曾经说过命名要做到见名知意
    this: 是当前类的对象引用。简单的记，它就代表当前类的一个对象。
    注意：谁调用这个方法，在该方法内部的this就代表谁
    this的场景：
        解决局部变量隐藏成员变量问题
 */
public class Student {

    // 姓名
    private String name;

    // 年龄
    private int age;

    // 姓名获取值
    public String getName() {
        return name;
    }

    // 姓名设置值
    public void setName(String name) {
        // 这里其实就是把自己赋值给了自己，跟成员变量毫无关系
        // 变量的使用规则：就近原则
        // name = name;

        // Error:无法从静态上下文中引用非静态变量 name
        // 这是类名，目前还没说过类似的用法，所以这个是有问题的
        // Student.name = name;

        // 这里的调用只能通过对象名
        // 这个对象如果存在，它应该代表的是Student的一个对象
        // 那么谁能够代表当前类的对象呢？Java提供了一个关键字：this
        this.name = name;
    }

    // 年龄获取值
    public int getAge() {
        return age;
    }

    // 年龄设置值
    public void setAge(int age) {
        // 这里其实就是把自己赋值给了自己，跟成员变量毫无关系
        // 变量的使用规则：就近原则
        // age = age;

        // Error: 无法从静态上下文中引用非静态变量 age
        // 这是类名，目前还没说过类似的用法，所以这个是有问题的
        // Student.age = age;

        // 这里的调用只能通过对象名
        // 这个对象如果存在，它应该代表的是Student的一个对象
        // 那么谁能够代表当前类的对象呢？Java提供了一个关键字：this
        this.age = age;
    }
}
