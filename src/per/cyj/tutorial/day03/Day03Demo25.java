package per.cyj.tutorial.day03;

import java.util.Scanner;

/**
 * 选择结构
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day03Demo25 {

    /*
        if语句格式2的练习
            1、获取两个数据中的最大值
            2、判断一个数据是奇数还是偶数，并输出是奇数还是偶数
     */
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner scan = new Scanner(System.in);

        // 获取两个数中的最大值
        System.out.println("请输入第一个数据：");
        int x = scan.nextInt();

        System.out.println("请输入第二个数据：");
        int y = scan.nextInt();

        // 定义一个变量接收最大值
        int max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }

        System.out.println("max = " + max);
        System.out.println("-------------------------");

        // 判断一个数据是奇数还是偶数
        System.out.println("请输入你要判断的数据：");
        int a = scan.nextInt();

        if (a % 2 == 0) {
            System.out.println(a + "这个数据是偶数");
        } else {
            System.out.println(a + "这个数据是奇数");
        }
    }
}
