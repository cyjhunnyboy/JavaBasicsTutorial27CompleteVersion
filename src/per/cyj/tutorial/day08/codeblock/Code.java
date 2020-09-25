package per.cyj.tutorial.day08.codeblock;

/**
 * 代码块：在Java中，使用{}括起来的代码被称为代码块。
 * <p>
 * 根据其位置和声明的不同，可以分为
 * 1）局部代码块：局部位置，用于限定变量的生命周期
 * 2）构造代码块：在类中的成员位置，用{}括起来的代码，每次调用构造方法执行前，都会先执行构造代码块
 * 作用：可以把多个构造方法中的共同代码放到一起。对对象进行初始化。
 * 3）静态代码块：在类中的成员位置，用{}括起来的代码，只不过它用static修饰了.
 * 作用：一般是对类进行初始化。
 * <p>
 * 面试题：静态代码块，构造代码块，构造方法的执行顺序？
 * <p>
 * 静态代码块-->构造代码块-->构造方法；而且静态代码块只执行一次，构造代码块每次调用构造方法都执行
 *
 * @author chenyongjun
 * @since 2020-02-09
 */
public class Code {

    // 静态代码块
    static {
        int a = 1000;
        System.out.println(a);
    }

    // 构造代码块
    {
        int x = 100;
        System.out.println(x);
    }

    // 构造方法
    public Code() {
        System.out.println("Code");
    }

    // 构造方法
    public Code(int a) {
        System.out.println("Code");
    }

    // 构造代码块
    {
        int y = 200;
        System.out.println(y);
    }

    // 静态代码块
    static {
        int b = 2000;
        System.out.println(b);
    }
}
