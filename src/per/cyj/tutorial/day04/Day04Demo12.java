package per.cyj.tutorial.day04;

/**
 * for循环语句
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo12 {

    public static void main(String[] args) {
        /*
            需求：求出1-10之间数据之和
         */
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1-10之和是：" + sum);
    }
}
