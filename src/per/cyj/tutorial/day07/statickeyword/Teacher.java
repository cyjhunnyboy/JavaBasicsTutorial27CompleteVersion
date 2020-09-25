package per.cyj.tutorial.day07.statickeyword;

/**
 * static关键字注意事项
 *
 * @author chenyongjun
 * @since 2020-02-09
 */

/*
    static关键字注意事项
        1、在静态方法中是没有this关键字的
            如何理解呢？
                静态是随着类的加载而加载，this是随着对象的创建而存在的。
                静态比对象先存在。

        2、静态方法只能访问静态的成员变量和静态的成员方法
            静态方法：
                成员变量：只能访问静态变量
                成员方法：只能访问静态成员方法
            非静态方法：
                成员变量：可以是静态的，也可以是非静态的
                成员方法：可以是静态的成员方法，也可以是非静态的成员方法。
        简单记：
            静态只能访问静态
 */
public class Teacher {

    public static int num2 = 30;
    public int num = 10;

    public static void method() {
        // Error:无法从静态上下文中引用非静态变量num
        // System.out.println(num);
        System.out.println(num2);

        // Error: 无法从静态上下文中引用非静态 方法 func1()
        // func1();
        func2();
    }

    public static void func2() {
        System.out.println("静态成员方法func2");
    }

    public void show() {
        // 隐含的告诉你访问的是成员变量
        System.out.println(num);
        // 明确的告诉你访问的是成员变量
        System.out.println(this.num);
        System.out.println(num2);

        func1();
        func2();
    }

    public void func1() {
        System.out.println("成员方法func1");
    }
}
