package per.cyj.tutorial.day03;

import java.util.Scanner;

/**
 * 键盘录入
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day03Demo18 {

    /*
        1）键盘录入两个数据，并对这两个数据求和，输出结果
        2）键盘录入两个数据，获取这两个数据中的最大值
        3）键盘录入三个数据，获取这三个数据中的最大值
        4）键盘录入两个数据，比较这两个数据是否相等
     */
    public static void main(String[] args) {
        // 需求：键盘录入两个数据，获取这两个数据中的最大值
        // 创建键盘录入数据对象
        Scanner scanner = new Scanner(System.in);

        System.out.println("请你输入第一个数据：");
        int x = scanner.nextInt();

        System.out.println("请输入第二个数据：");
        int y = scanner.nextInt();

        // 把键盘录入的数据求最大值
        // int max = x > y ? x : y;
        int max = Math.max(x, y);
        System.out.println("max = " + max);
    }
}
