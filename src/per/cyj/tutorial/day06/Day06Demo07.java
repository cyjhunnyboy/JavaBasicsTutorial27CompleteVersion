package per.cyj.tutorial.day06;

import java.util.Scanner;

/**
 * 二维数组
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class Day06Demo07 {

    /*
        需求：打印杨辉三角形（行数可以键盘录入）
        1
        1  1
        1  2  1
        1  3  3  1
        1  4  6  4  1
        1  5 10 10  5  1
        分析：看到这种图像的规律
            1、任何一行的第一列和最后一列都是1
            2、从第三行开始，每一个数据都是它上一行的前一列和它上一行的本列之和，最后一列除外
        步骤：
            1、首先定义一个二维数组。行数如果是n，我们把列数也定义为n，n通过键盘录入获得
            2、给这个二维数组任何一行的第一列和最后一列赋值为1
            3、按照规律给其他元素赋值
                从第三行开始，每一个数据都是它上一行的前一列和它上一行的本列之和，最后一列除外
            4、遍历这个二维数组
     */
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        // 这个n的数据来自键盘录入
        System.out.println("请输入一个数据：");
        int n = sc.nextInt();

        // 定义一个二维数组
        int[][] arr = new int[n][n];

        // 二维数组初始化
        initArray(arr);

        // 打印二维数组
        printArray(arr);
    }

    /**
     * 杨辉三角形二维数组初始化
     *
     * @param arr 二维数组
     */
    public static void initArray(int[][] arr) {
        // 给这个二维数组任何一行的第一列和最后一列赋值为1
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = 1;  // 任何一行第1列
            arr[i][i] = 1;  // 任何一行的最后1列
        }

        // 从第三行开始，每一个数据都是它上一行的前一列和它上一行的本列之和，最后一列除外
        for (int i = 2; i < arr.length; i++) {
            // 这里如果j<=i有个小问题，就是最后一列的问题
            // 所以这里要减去1，并且j也应该从1开始，因为第一列也是有值了
            for (int j = 1; j <= i - 1; j++) {
                // 每一个数据都是它上一行的前一列和它上一行的本列之和
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
    }

    /**
     * 控制台打印二维数组
     *
     * @param arr 二维数组
     */
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 内循环判断条件语句：j<=i
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
