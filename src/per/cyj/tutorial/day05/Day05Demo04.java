package per.cyj.tutorial.day05;

import java.util.Scanner;

/**
 * 方法
 *
 * @author chen-PC
 * @since 2020-02-07
 */
public class Day05Demo04 {

    /*
        键盘录入三个数据，返回三个数据中的最大值
     */
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        // 录入数据
        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据：");
        int b = sc.nextInt();
        System.out.println("请输入第三个数据：");
        int c = sc.nextInt();

        int max = returnMax(a, b, c);
        System.out.println("三个数中最大值是：" + max);

    }

    /*
        需求：键盘录入三个数据，返回三个数据中的最大值

        两个明确：
            1、返回值类型：int
            2、参数列表：int a, int b, int c
     */
    public static int returnMax(int a, int b, int c) {
        // if嵌套
        /*
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }
         */

        // 用三元运算符改进
        /*
        if (a > b) {
            return (a > c ? a : c);
        } else {
            return (b > c ? b : c);
        }
         */

        // 继续改进
        // 不建议，写代码一定要注意阅读性强
        // return (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        int temp = ((a > b) ? a : b);
        int max = ((temp > c) ? temp : c);
        return max;
    }
}
