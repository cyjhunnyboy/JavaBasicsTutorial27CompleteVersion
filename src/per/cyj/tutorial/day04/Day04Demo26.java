package per.cyj.tutorial.day04;

/**
 * 循环语句的区别
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo26 {

    /*
        循环语句的区别：
        1、do...while循环至少执行一次循环体。而for，while循环必须先判断条件是否成立，然后决定是否执行循环体语句
        那么，我们一般使用哪种循环呢？优先考虑for循环，其次考虑while，最后考虑do...while
     */
    public static void main(String[] args) {
        int i = 3;
        while (i < 3) {
            System.out.println("我爱欧阳娜娜");
            i++;
        }

        System.out.println("--------------------------");

        int j = 3;
        do {
            System.out.println("我爱欧阳娜娜");
            j++;
        } while (j < 3);

        System.out.println("--------------------------");

        for (int k = 3; k < 3; k++) {
            System.out.println("我爱欧阳娜娜");
        }
    }
}
