package per.cyj.tutorial.day03;

/**
 * 选择结构
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day03Demo34 {

    /*
        获取三个数中的最大值
        由此案例主要是为了讲解if语句是可以嵌套使用的，而且是可以任意的嵌套
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        // 三元运算符实现求最大值
        int temp = (a > b) ? a : b;
        int max = (temp > c) ? temp : c;
        System.out.println("max = " + max);
        System.out.println("-------------------");

        // 三元运算符实现求最大值
        int max1 = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("max1 = " + max1);

        System.out.println("-------------------");

        // 使用if语句实现
        int temp2;
        if (a > b) {
            temp2 = a;
        } else {
            temp2 = b;
        }
        int max2;
        if (temp2 > c) {
            max2 = temp2;
        } else {
            max2 = c;
        }
        System.out.println("max2 = " + max2);
        System.out.println("-------------------");

        int max3;
        if (a > b) {
            if (a > c) {
                max3 = a;
            } else {
                max3 = c;
            }
        } else {
            if (b > c) {
                max3 = b;
            } else {
                max3 = c;
            }
        }
        System.out.println("max3 = " + max3);
    }
}
