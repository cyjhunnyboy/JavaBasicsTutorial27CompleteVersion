package per.cyj.tutorial.day05;

import java.util.Scanner;

/**
 * 方法
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class Day05Demo07 {

    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        // 录入数据
        System.out.println("请输入行数：");
        int m = sc.nextInt();
        System.out.println("请输入列数：");
        int n = sc.nextInt();

        // void类型方法的调用
        printStar(m, n);
    }

    /*
       需求：键盘录入行数和列数，输出对应的星形

       输出星形
       两个明确：
          1、返回值类型：void
          2、参数列表：int m, int n
     */
    public static void printStar(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
