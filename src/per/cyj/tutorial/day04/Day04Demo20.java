package per.cyj.tutorial.day04;

/**
 * while循环语句
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo20 {

    /*
        练习：用while循环实现
        左边：求出1-100之和
        右边：统计水仙花数有多少个
     */
    public static void main(String[] args) {
        // 求出1-100之和
        // for语句版本
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
        System.out.println("------------------");

        // while语句版本
        int sum2 = 0;
        int j = 1;
        while (j <= 100) {
            sum2 += j;
            j++;
        }
        System.out.println("sum2 = " + sum2);
    }
}
