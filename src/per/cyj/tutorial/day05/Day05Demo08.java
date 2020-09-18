package per.cyj.tutorial.day05;

import java.util.Scanner;

/**
 * 方法
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class Day05Demo08 {

    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        // 录入数据
        System.out.println("请输入n的值（1-9）：");
        int n = sc.nextInt();

        // void类型方法的调用
        multipleTable(n);
    }

    /*
       需求：输出对应的nn乘法表
       输出星形
       两个明确：
          1、返回值类型：void
          2、参数列表：int n
     */
    public static void multipleTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
    }
}
