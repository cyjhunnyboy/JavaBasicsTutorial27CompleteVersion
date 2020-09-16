package per.cyj.tutorial.day04;

/**
 * do...while循环语句
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo25 {

    /*
        需求：1-100之和
     */
    public static void main(String[] args) {
        // 求1-100之和
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        } while (i <= 100);

        System.out.println("sum = " + sum);
    }
}
