package per.cyj.tutorial.day04;

import java.util.Scanner;

/**
 * switch语句
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo05 {

    /*
        根据键盘录入的字符串，判断是否满足要求，如果有就输出
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
     */
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        // 录入数据
        System.out.println("请输入你要判断的字符串：");
        String s = sc.nextLine().trim().toLowerCase();

        switch (s) {
            case "java":
                System.out.println("你输入的是：Java");
                break;
            case "python":
                System.out.println("你输入的是：Python");
                break;
            case "selenium":
                System.out.println("你输入的是：Selenium");
                break;
            case "appium":
                System.out.println("你输入的是：Appium");
                break;
            default:
                System.out.println("对不起，没有找到你输入的数据！");
                break;
        }
    }
}
