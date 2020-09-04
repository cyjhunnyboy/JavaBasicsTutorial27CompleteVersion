package per.cyj.tutorial.day03;

/**
 * 算术运算符
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day03Demo03 {

    public static void main(String[] args) {
        /*
            ++ -- 练习题
            第一题：
                int a = 10;
                int b = 10;
                int c = 10;
                a = b++;  // a = 10, b = 11
                c = --a;  // c = 9, a = 9
                b = ++a;  // b = 10, a = 10
                a = c--;  // a = 9, b = 10, c = 8
                请分别计算a,b,c的值

            第二题：
                int x = 4;
                int y = (x++) + (++x) + (x*10);
                请分别计算x,y的值
                y = 4 + (++x) + (x*10), x = 5
                y = 4 + 6 + (x*10), x = 6
                y = 4 + 6 + 60 = 70
         */

        int a = 10;
        int b = 10;
        int c = 10;
        a = b++;    // a = 10, b = 11, c = 10
        c = --a;    // a = 9, b = 11, c = 9
        b = ++a;    // a = 10, b = 10, c = 9
        a = c--;    // a = 9, b = 10, c = 8
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        int x = 4;
        // y = (x++) = 4, x = 5
        // y = 4 + (++x) = 4 + 6 = 10, x = 6
        // y = 10 + (6*10) = 70
        // 结果：x = 6, y = 70
        int y = (x++) + (++x) + (x * 10);
        System.out.println("x = " + x + ", y = " + y);
    }
}
