package per.cyj.tutorial.day05;

import java.util.Scanner;

/**
 * 方法
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day05Demo02 {

    /*
        键盘录入两个数据，返回两个数据中最大值
     */
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        // 录入数据
        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据：");
        int b = sc.nextInt();

        int result = returnMax1(a, b);
        System.out.println("较大值是：" + result);

        result = returnMax2(a, b);
        System.out.println("较大值是：" + result);

        result = returnMax3(a, b);
        System.out.println("较大值是：" + result);
    }

    /*
        两个明确：
            1、返回值类型：int
            2、参数列表：int a, int b
    */
    public static int returnMax1(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /*
        两个明确：
            1、返回值类型：int
            2、参数列表：int a, int b
     */
    public static int returnMax2(int a, int b) {
        // 用三元运算符改进
        int c = ((a > b) ? a : b);
        return c;
    }

    /*
        两个明确：
            1、返回值类型：int
            2、参数列表：int a, int b
    */
    public static int returnMax3(int a, int b) {
        // 用三元运算符改进
        // 由于c就是后面的式子
        return ((a > b) ? a : b);
    }
}
