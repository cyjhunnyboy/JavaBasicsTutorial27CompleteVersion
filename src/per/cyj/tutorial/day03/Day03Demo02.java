package per.cyj.tutorial.day03;

/**
 * 算术运算符
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day03Demo02 {

    /*
        ++ --运算符的使用
        作用：就是对变量进行自增1或者自减1

        单独使用：放在操作数的前面和后面效果一样。（这种用法是我们比较常见的）
        参与运算使用：放在操作的前面，先自增或者自减1，然后再参与运算；放在操作的后面，先参与运算，再自增或者自减1
     */
    public static void main(String[] args) {
        // 定义两个变量
        int x = 3;
        int y = 4;

        // 字符串的拼接
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("x: " + x + ", y: " + y);
        System.out.println("======================");

        // 单独使用
        int x1 = 3;
        int y1 = 4;
        x1++;
        y1--;
        System.out.println("x1: " + x1 + ", y1: " + y1);

        int x2 = 3;
        int y2 = 4;
        ++x2;
        --y2;
        System.out.println("x2: " + x2 + ", y2: " + y2);

        // Error:(29, 28) java: 意外的类型
        // 常量是不可以这样做的
        // System.out.println(10++);
        System.out.println("======================");

        // 参与运算使用
        int a = 3;
        int b = 4;
        int c = a++;
        int d = b--;
        System.out.println("a: " + a + ", b: " + b);
        System.out.println("c: " + c + ", d: " + d);
        ;

        int a1 = 3;
        int b1 = 4;
        int c1 = ++a1;
        int d1 = --b1;
        System.out.println("a1: " + a1 + ", b1: " + b1);
        System.out.println("c1: " + c1 + ", d1: " + d1);
    }
}
