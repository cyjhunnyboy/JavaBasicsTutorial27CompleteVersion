package per.cyj.tutorial.day03;

/**
 * 算术运算符
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day03Demo01 {

    /*
        运算符：就是对常量和变量进行操作的符号
        分类：算术运算符、赋值运算符、比较运算符、逻辑运算符、位运算符、三目运算符

        算术运算符：+ - * / % ++ --

        注意事项：
            1、整数相除只能得到整数，如果想要得到小数，必须把数据变为浮点数
            2、/获取的是除法操作的商，%获取的除法操作的余数
     */
    public static void main(String[] args) {
        // 定义变量
        // 把3赋值给int类型的变量x
        int x = 3;
        int y = 4;

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        // 整数相除只能得到整数
        System.out.println("x / y = " + (x / y));
        System.out.println("-------------------");

        // 整数相除想得到小数，怎么办呢？
        // 只需要把操作的数据中任意的一个数据变为浮点数
        System.out.println("x * 1.0 / y = " + (x * 1.0 / y));

        // %的应用，得到的是余数
        System.out.println("x % y = " + (x % y));
    }
}
