package per.cyj.tutorial.day08.utilclass;

import java.util.Scanner;

/**
 * 猜数字小游戏（数据在1-100之间）
 *
 * 分析：
 *      A：程序产生一个随机数。（被猜的）
 *      B：键盘录入数据。（你猜的）
 *      C：把你猜的和被猜的进行比较
 *          1、大了
 *          2、小了
 *          3、猜中了
 *      D：给出多次猜的机会，猜中就结束
 *          while()循环，猜中就break
 *
 * @author chenyongjun
 * @since 2020-02-09
 */
public class GussNumber {

    public static void main(String[] args) {
        // 程序产生了一个随机数。（被猜的）
        int number = (int) (Math.random() * 100 ) + 1;

        while (true) {
            // 键盘录入数据。（你猜的）
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要猜的数据（1-100）：");
            int gussNumber = sc.nextInt();

            // 把你猜的和被猜的进行比较
            if (gussNumber > number) {
                System.out.println("你猜的数据'" + gussNumber + "'大了");
            } else if (gussNumber < number) {
                System.out.println("你猜的数据'" + gussNumber + "'小了");
            } else {
                System.out.println("恭喜你，猜中了！");
                break;
            }
        }
    }
}
