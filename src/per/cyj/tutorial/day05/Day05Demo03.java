package per.cyj.tutorial.day05;

import java.util.Scanner;

/**
 * 方法
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day05Demo03 {

    /*
        键盘录入两个数据，比较两个数据是否相等
        分析：
            比较两个数据是否相等结果是一个boolean类型
     */
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        // 录入数据
        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据：");
        int b = sc.nextInt();

        boolean flag = compare1(a, b);
        System.out.println(flag);

        flag = compare2(a, b);
        System.out.println(flag);

        flag = compare3(a, b);
        System.out.println(flag);

        flag = compare4(a, b);
        System.out.println(flag);
    }

    /*
        两个明确：
            1、返回值类型：boolean
            2、参数列表：int a, int b
     */
    public static boolean compare1(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    /*
        两个明确：
            1、返回值类型：boolean
            2、参数列表：int a, int b
    */
    public static boolean compare2(int a, int b) {
        // 三元运算符改进
        boolean flag = ((a == b) ? true : false);
        return flag;
    }

    /*
        两个明确：
            1、返回值类型：boolean
            2、参数列表：int a, int b
    */
    public static boolean compare3(int a, int b) {
        // 继续改进
        return ((a == b) ? true : false);
    }

    /*
        两个明确：
            1、返回值类型：boolean
            2、参数列表：int a, int b
    */
    public static boolean compare4(int a, int b) {
        // 最终版
        return a == b;
    }
}
