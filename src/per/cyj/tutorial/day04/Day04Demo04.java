package per.cyj.tutorial.day04;

import java.util.Scanner;

/**
 * switch语句
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo04 {

    /*
        模拟单项选择题
        分析：
            1、出一个选择题，然后供你选择
            2、键盘录入选择的数据
            3、根据选择给出你选择的结论
     */
    public static void main(String[] args) {
        /*
            出一个选择题，然后供你选择
            由于我们现在没有办法键盘录入得到一个字符'A', 'B'
            这样的字符，我们就用65，66这样的值替代，将来我们获取到这样的值以后，强制转换为字符类型
         */
        System.out.println("下面的几个人你最爱谁？");
        System.out.println("65 林青霞");
        System.out.println("66 刘亦菲");
        System.out.println("67 欧阳娜娜");
        System.out.println("68 古力娜扎");

        // 键盘录入选择的数据
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你的选择：");
        int choiceNum = sc.nextInt();

        // 强制转换为字符类型
        char choiceChar = (char) choiceNum;

        switch (choiceChar) {
            case 'A':
                System.out.println("恭喜你，你选择的是：林青霞");
                break;
            case 'B':
                System.out.println("恭喜你，你选择的是：刘亦菲");
                break;
            case 'C':
                System.out.println("恭喜你，你选择的是：欧阳娜娜");
                break;
            case 'D':
                System.out.println("恭喜你，你选择的是：古力娜扎");
                break;
            default:
                System.out.println("对不起，没有该选项");
                break;
        }
    }
}
