package per.cyj.tutorial.day07.construction;

/**
 * 构造方法
 *
 * @author chenyongjun
 * @since 2020-02-09
 */

/*
    我们一直在使用构造方法，但是，我们确实没有定义过构造方法。
    用的是从哪里来的呢？
    构造方法的注意事项：
        1、如果我们没有给出构造方法，系统将自动提供一个无参构造方法。
        2、如果我们给出了构造方法，系统将不再提供默认的无参构造方法。
        注意：这个时候，如果我们还想使用无参构造方法，就必须自己给出。建议永远自己给出无参构造方法
    给成员变量赋值的两种方式
        1、setXxx()
        2、构造方法
 */
public class Construct2 {

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     * 无参构造方法
     */
    public Construct2() {
        System.out.println("这是无参构造方法");
    }

    /**
     * 构造方法的重载格式
     *
     * @param name 姓名
     */
    public Construct2(String name) {
        System.out.println("这是带一个String类型的构造方法");
        this.name = name;
    }

    /**
     * 带参构造方法
     *
     * @param age 年龄
     */
    public Construct2(int age) {
        System.out.println("这是一个带int类型的构造方法");
        this.age = age;
    }

    /**
     * 带参构造方法
     *
     * @param name 姓名
     * @param age  年龄
     */
    public Construct2(String name, int age) {
        System.out.println("这是一个带多个参数的构造方法");
        this.name = name;
        this.age = age;
    }

    /**
     * 成员方法，打印姓名、年龄
     */
    public void show() {
        System.out.println(name + "---" + age);
    }
}
