package per.cyj.tutorial.day04;

import java.util.Scanner;

/**
 * switch语句
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo07 {

    /*
        键盘录入月份的值，输出对应的季节
        春：3,4,5
        夏：6,7,8
        秋：9,10,11
        冬：12，1,2

        if语句和switch语句使用场景
        1、if语句使用场景：
            a.针对结果是boolean类型的判断
            b.针对一个范围判断
            c.针对几个常量的判断
        2、switch语句使用场景
            a.针对几个常量的判断
     */
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        // 录入数据
        System.out.println("请你输入一个月份：");
        int month = sc.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("你输入的月份有误");
                break;
        }
    }
}
