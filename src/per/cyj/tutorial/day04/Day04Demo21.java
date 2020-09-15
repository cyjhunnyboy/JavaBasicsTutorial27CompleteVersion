package per.cyj.tutorial.day04;

/**
 * while循环语句
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo21 {

    /*
        练习：用while循环实现
        左边：求出1-100之和
        右边：统计水仙花数有多少个
     */
    public static void main(String[] args) {
        // 统计水仙花数有多少个
        // for语句版本
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;

            if (i == (ge * ge * ge + shi * shi * shi + bai * bai * bai)) {
                count++;
            }
        }

        System.out.println("count = " + count);
        System.out.println("------------------");

        // while语句版本
        int count2 = 0;
        int j = 100;
        while (j <= 1000) {
            int ge = j % 10;
            int shi = j / 10 % 10;
            int bai = j / 10 / 10 % 10;

            if (j == (ge * ge * ge + shi * shi * shi + bai * bai * bai)) {
                count2++;
            }

            j++;
        }

        System.out.println("count2 = " + count2);
        System.out.println("------------------");
    }
}
