package per.cyj.tutorial.day07.training;

import java.util.Scanner;

/**
 * @author chen-PC
 * @apiNote 加减乘除测试类
 * @since 2020-02-09
 */
public class MyMathTest {

    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个操作数：");
        int firstNum = sc.nextInt();
        System.out.println("请输入第二个操作数：");
        int secondNum = sc.nextInt();

        // 创建MyMath对象，并使用
        MyMath myMath = new MyMath();

        System.out.println("加法结果是：" + myMath.add(firstNum, secondNum));
        System.out.println("减法结果是：" + myMath.sub(firstNum, secondNum));
        System.out.println("乘法结果是：" + myMath.mul(firstNum, secondNum));
        System.out.println("除法结果是：" + myMath.div(firstNum, secondNum));
    }
}
