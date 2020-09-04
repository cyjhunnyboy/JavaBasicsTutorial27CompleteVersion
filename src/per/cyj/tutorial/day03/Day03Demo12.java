package per.cyj.tutorial.day03;

/**
 * 位运算符
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day03Demo12 {

    /*
        面试题：
            请自己实现两个整数变量的交换
            注意：以后讲课的过程中，我没有明确指定数据的类型，默认int类型
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("=========================");

        // 方式1：使用第三方变量（开发中最常用的方式）
        int c = a;
        a = b;
        b = c;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("=========================");

        // 方式2：用位异或实现（面试用）
        // 左边：xyx
        // 右边：x^y
        int x = 10;
        int y = 20;
        x = x ^ y;
        y = x ^ y; // y = x ^ y ^ y = x
        x = x ^ y; // x = x ^ y ^ x = y
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("=========================");

        // 方式3：用变量相加的做法
        int a1 = 10;
        int b1 = 20;
        a1 = a1 + b1;   // a1 = 30
        b1 = a1 - b1;   // b1 = 10
        a1 = a1 - b1;   // a1 = 20
        System.out.println("a1 = " + a1 + ", b1 = " + b1);
        System.out.println("=========================");

        // 方式4：一句话搞定
        int x1 = 10;
        int y1 = 20;
        y1 = (x1 + y1) - (x1 = y1); // y1 = 30 - 20 = 10, x1 = 20
        System.out.println("x1 = " + x1 + ", y1 = " + y1);
    }
}
