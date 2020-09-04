package per.cyj.tutorial.day03;

import java.util.Scanner;

/**
 * 选择结构
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day03Demo33 {

    /*
        键盘录入月份的值，输出对应的季节
        春：3,4,5
        夏：6,7,8
        秋：9,10,11
        冬：12，1,2
        分析：
            1、键盘录入月份的值，需要导入包Scanner
            2、我们应该判断这个月份在哪个季节，而这个判断情况较多，所以用if语句格式3
        if语句使用的场景：
            1、针对表达式是一个boolean类型的判断
            2、针对一个范围的判断
     */
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        // 录入数据
        System.out.println("请你输入一个月份：");
        int month = sc.nextInt();

        // if语句格式3判断月份属于哪个季节
        // 这个程序确实符合了需求，但是不够简洁
        if (month < 1 || month > 12) {
            System.out.println("你输入的月份有误");
        } else if (month >= 3 && month <= 5) {
            System.out.println("春季");
        } else if (month >= 6 && month <= 8) {
            System.out.println("夏季");
        } else if (month >= 9 && month <= 11) {
            System.out.println("秋季");
        } else {
            System.out.println("冬季");
        }
    }
}
