package per.cyj.tutorial.day03;

/**
 * 逻辑运算符
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day03Demo09 {

    /*
        &&和&的区别？ 同理||和|的区别
        1、和&结果是一样
        2、&&具有短路效果，左边是false，右边不执行
        3、||具有短路效果，左边是true，右边不执行

        开发中常用的逻辑运算符：&& || ！
     */
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        // 逻辑与&&
        // false && false = false
        System.out.println((a > b) && (a > c));
        // false && true = false
        System.out.println((a > b) && (a < c));
        // true && false = false
        System.out.println((a < b) && (a > c));
        // true && true = true
        System.out.println((a < b) && (a < c));
        System.out.println("=======================");

        int x1 = 3;
        int y1 = 4;
        // 结果x1=4, y1=5, b1=true
        boolean b1 = (x1++ == 3 & y1++ == 4);
        System.out.println("x1 = " + x1 + ", y1 = " + y1);
        System.out.println("b1 = " + b1);

        int x2 = 3;
        int y2 = 4;
        // 结果x2=4, y2=5, b2=true
        boolean b2 = (x2++ == 3 && y2++ == 4);
        System.out.println("\nx2 = " + x2 + ", y2 = " + y2);
        System.out.println("b2 = " + b2);

        int x3 = 3;
        int y3 = 4;
        // 结果x3=4, y3=5, b3=false
        boolean b3 = (++x3 == 3 & y3++ == 4);
        System.out.println("\nx3 = " + x3 + ", y3 = " + y3);
        System.out.println("b3 = " + b3);

        int x4 = 3;
        int y4 = 4;
        // 结果x4=4, y4=4, b4=false
        boolean b4 = (++x4 == 3 && y4++ == 4);
        System.out.println("\nx4 = " + x4 + ", y4 = " + y4);
        System.out.println("b4 = " + b4);
        System.out.println("=======================");

        int x5 = 3;
        int y5 = 4;
        // 结果x5=4, y5=5, b5=true
        boolean b5 = (x5++ == 3 | y5++ == 4);
        System.out.println("x5 = " + x5 + ", y5 = " + y5);
        System.out.println("b5 = " + b5);

        int x6 = 3;
        int y6 = 4;
        // 结果x6=4, y6=4, b2=true
        boolean b6 = (x6++ == 3 || y6++ == 4);
        System.out.println("\nx6 = " + x6 + ", y6 = " + y6);
        System.out.println("b6 = " + b6);

        int x7 = 3;
        int y7 = 4;
        // 结果x7=4, y7=5, b7=true
        boolean b7 = (++x7 == 3 | y7++ == 4);
        System.out.println("\nx7 = " + x7 + ", y7 = " + y7);
        System.out.println("b7 = " + b7);

        int x8 = 3;
        int y8 = 4;
        // 结果x8=4, y8=5, b8=true
        boolean b8 = (++x8 == 3 || y8++ == 4);
        System.out.println("\nx8 = " + x8 + ", y8 = " + y8);
        System.out.println("b8 = " + b8);
    }
}
