package per.cyj.tutorial.day03;

import java.util.Scanner;

/**
 * 键盘录入
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day03Demo16 {

    /*
        为了让程序的数据更符合开发的数据，加入键盘录入，让程序更灵活
        如何实现键盘数据的录入？
        1、导包，格式：imprt java.util.Scanner;
                位置：在class位置上面
        2、创建键盘录入对象
            格式：Scanner scan = new Scanner(System.in);
        3、通过对象获取数据
            格式：int x = scan.nextInt();
     */
    public static void main(String[] args) {
        // 创建键盘录入数据对象
        Scanner scanner = new Scanner(System.in);

        System.out.println("请你输入一个数据：");
        int x = scanner.nextInt();

        System.out.println("你输入的数据是：" + x);
    }
}