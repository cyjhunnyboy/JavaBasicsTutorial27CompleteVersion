package per.cyj.tutorial.day02;

/**
 * 数据类型
 *
 * @author chenyongjun
 * @since 2020-02-05
 */

/*
    使用变量的时候要注意的事项：
    A、作用域：变量定义在哪个大括号内，它就在这个大括号内有效，并且，在同一个大括号内不能同时定义两个同名的变量
    B、初始化值：没有初始化值的变量不能直接使用，你只要在使用之前给值就行，不一定非要在定义的时候立即给值，推荐在定义的时候赋值

    定义变量的格式：
    a、数据类型 变量名 = 初始化值
    b、数据类型 变量名;
       变量名 = 初始化值;

    C、在一行上建议只定义一个变量，可以定义多个，但是不建议
 */
public class Day02Demo10 {

    public static void main(String[] args) {
        // 定义变量
        int x = 100;
        int z;
        // 已在方法main中定义了变量x
        // int x = 100;
        System.out.println(x);

        // int y;
        // 编译报错“可能尚未初始化变量y
        // System.out.println(y);

        z = 200;
        System.out.println(z);

        // 在一行上定义多个变量，可以，但是不建议
        // int a = 10; int b = 20; int c = 30;

        // 这种写法也是可以的
        // int a = 10, b = 20, c = 30;

        // 这种写法报错
        // int d, int g;

        // 这种写法也是正确的
        // int a, b;
        // a = 10;
        // b = 20;

        // 在一行上建议只定义一个变量
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(a + ", " + b + ", " + c);
    }
}
