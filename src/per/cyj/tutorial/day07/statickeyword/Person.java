package per.cyj.tutorial.day07.statickeyword;

/**
 * static关键字
 *
 * @author chenyongjun
 * @since 2020-02-09
 */

/*
    定义一个人类
    姓名和年龄都是变化的，这个我能接受，因为每个人的姓名和年龄是不同的。
    但是，我们现在选取的这几个人都是中国人，他们的国籍都是一样的。
    一样的国籍，我们每次创建对象，在堆内存都要开辟这样的空间，我就觉得有点浪费了，怎么办呢？
        针对多个对象有共同的这样的成员变量值的时候
        Java提供了一个关键字来修饰：static
 */
public class Person {

    /**
     * 国籍
     */
    // String country;
    static String country;
    /**
     * 姓名
     */
    String name;
    /**
     * 年龄
     */
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public void show() {
        System.out.println("姓名：" + name + "，年龄：" + age + "，国籍：" + country);
    }
}
