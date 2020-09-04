package per.cyj.tutorial.day04;

import java.util.Scanner;

/**
 * switch语句
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo06 {

    /*
        键盘录入月份的值，输出对应的季节
        春：3,4,5
        夏：6,7,8
        秋：9,10,11
        冬：12，1,2
     */
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        // 录入数据
        System.out.println("请你输入一个月份：");
        int month = sc.nextInt();

        /*
            这样写不简洁，使用case穿透优化代码
         */
        switch (month) {
            case 3:
                System.out.println("春季");
                break;
            case 4:
                System.out.println("春季");
                break;
            case 5:
                System.out.println("春季");
                break;
            case 6:
                System.out.println("夏季");
                break;
            case 7:
                System.out.println("夏季");
                break;
            case 8:
                System.out.println("夏季");
                break;
            case 9:
                System.out.println("秋季");
                break;
            case 10:
                System.out.println("秋季");
                break;
            case 11:
                System.out.println("秋季");
                break;
            case 12:
                System.out.println("冬季");
                break;
            case 1:
                System.out.println("冬季");
                break;
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("你输入的月份有误");
                break;
        }
    }
}
