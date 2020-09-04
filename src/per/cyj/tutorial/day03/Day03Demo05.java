package per.cyj.tutorial.day03;

/**
 * 赋值运算符
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day03Demo05 {

    /*
        赋值运算符：
            1、基本的赋值运算符：=，把=右边的数据赋值给左边的变量
            2、扩展的赋值运算符：+= -= *= /= %=，把左边和右边的做+ - * / %，然后赋值给左边的变量
     */
    public static void main(String[] args) {
        // 定义一个变量
        int x = 10;
        System.out.println(x);

        // 其他用法
        int a, b;
        a = b = 10;
        System.out.println("a = " + a + ", b = " + b);

        // 定义一个变量
        int y = 10;
        y += 20;
        System.out.printf("y = %d", y);
    }
}

