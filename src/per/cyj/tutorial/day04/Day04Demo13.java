package per.cyj.tutorial.day04;

/**
 * for循环语句
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo13 {

    public static void main(String[] args) {
        /*
            需求：
            1、求出1-100之和
            2、求出1-100之间偶数和
            3、求出1-100之间奇数和
         */
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1-100之和是：" + sum);

        int sum1 = 0;
        for (int i1 = 1; i1 <= 100; i1++) {
            if (i1 % 2 == 0) {
                sum1 += i1;
            }
        }
        System.out.println("1-100之间偶数和是：" + sum1);

        int sum2 = 0;
        for (int i2 = 1; i2 <= 100; i2++) {
            if (i2 % 2 != 0) {
                sum2 += i2;
            }
        }
        System.out.println("1-100之间偶数和是：" + sum2);
    }
}
