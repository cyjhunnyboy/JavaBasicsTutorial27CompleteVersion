package per.cyj.tutorial.day07.membermethod;

/**
 * 成员方法
 *
 * @author chenyongjun
 * @since 2020-02-09
 */

/*
    类的组成：成员变量、成员方法
    今天我们又加入了一个新的成员：构造方法
    以后再提类的组成：
        1、成员变量
        2、构造方法
        3、成员方法
            根据返回值：
                void类型
                非void类型
            形式参数：
                空方法
                非空方法
 */
public class Member01 {

    // 无参无返回值方法
    public void show() {
        System.out.println("show");
    }

    // 无参有返回值方法
    public String getString() {
        return "Hello, World!";
    }

    // 有参无返回值方法
    public void method(String name) {
        System.out.println(name);
    }

    // 有参有返回值方法
    public String func(String s1, String s2) {
        return s1 + s2;
    }
}

