package per.cyj.tutorial.day03;

/**
 * 条件运算符练习
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day03Demo15 {

    /*
        1、获取两个整数中的最大值
        2、获取三个整数中的最大值
        3、比较两个整数是否相同
     */
    public static void main(String[] args) {
        // 获取两个整数中的最大值
        int x = 100;
        int y = 200;
        int xyMax = x > y ? x : y;
        System.out.println("xyMax = " + xyMax);
        System.out.println("--------------");

        // 获取三个整数中的最大值
        int a = 10;
        int b = 20;
        int c = 40;
        // 分两步，先比较a,b的大小
        // 拿a,b的最大值和c进行比较
        int temp = a > b ? a : b;
        System.out.println("temp = " + temp);
        int abcMax = temp > c ? temp : c;
        System.out.println("abcMax = " + abcMax);
        System.out.println("--------------");

        // 一步搞定
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("max = " + max);

        // 比较两个整数是否相同
        int m = 100;
        int n = 200;
        boolean flag = (m == n) ? true : false;
        // boolean flag = (m == n);
        System.out.println("flag = " + flag);
    }
}
