package per.cyj.tutorial.day02;

/**
 * Java常量
 *
 * @author chenyongjun
 * @since 2020-02-05
 */

/*
    常量：在程序执行过程中，其值不会发生改变的量
    分类：
        A：字面值常量
        B：自定义常量（后面讲）
    字面值常量：
        A：字符串常量：用双引号括起来的内容。举例："Hello", "World"
        B：整数常量：所有整数。如：100、200
        C：小数常量：所有的小数。如：10.23、100.13
        D：字符常量：用单引号括起来的内容。如：'a'、 'A'、 '0'、 错误的：'AB'
        E：布尔常量：比较特殊。如：true、false
        F：空常量：后面讲。如：null
 */
public class Day02Demo07 {

    public static void main(String[] args) {
        // 字符串常量的输出
        System.out.println("Hello, World!");

        // 整数常量的输出
        System.out.println(100);

        // 小数常量的输出
        System.out.println(100.24);

        // 字符常量的输出
        System.out.println('A');
        System.out.println('0');

        // 布尔常量的输出
        System.out.println(true);
        System.out.println(false);

        // 空常量的输出
        System.out.println((String) null);
    }
}
