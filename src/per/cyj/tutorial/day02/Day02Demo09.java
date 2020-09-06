package per.cyj.tutorial.day02;

/**
 * 数据类型
 *
 * @author chenyongjun
 * @since 2020-02-05
 */

/*
    数据类型：Java是一中强类型的语言，针对每一种数据都定义了明确的数据类型。
    数据类型分类：
        A：基本数据类型
        B：引用数据类型（类、接口、数组）

    基本数据类型：4类8种
        A：整数    占用字节数
            byte    1
            short   2
            int     4
            long    8
        B：浮点数
            float   4
            double  8
        C：字符
            char    2
        D：布尔
            boolean 1
    注意事项：
    1、整数默认是int类型
    2、浮点数默认是double类型
    3、长整型后缀用L或者l标记，建议用L
    4、单精度浮点数用F或者f标记，建议用F
 */
public class Day02Demo09 {

    public static void main(String[] args) {
        // 定义变量的格式：数据类型 变量名 = 初始化值;
        // 定义一个字节变量
        byte b = 10;
        System.out.println(b);
        System.out.println("---------------");

        // 定义一个短整型变量
        short s = 100;
        System.out.println(s);
        System.out.println("---------------");

        // 定义一个整型变量
        int i1 = 1000;
        System.out.println(i1);
        // 超过了int的范围
        // int i2 = 1000000000000;
        // System.out.println(i2);
        System.out.println("---------------");

        // 长整型后缀需要使用L或者l标记，建议L
        long l1 = 1000000000000L;
        System.out.println(l1);
        // long类型不管如何都记得加L
        // long l2 = 100;
        long l2 = 100L;
        System.out.println(l2);
        System.out.println("---------------");

        // 定义浮点数变量
        float f = 12.234F;
        System.out.println(f);
        double d = 12.345;
        System.out.println(d);
        System.out.println("---------------");

        // 定义字符变量
        char c1 = 'a';
        System.out.println(c1);
        char c2 = '中';
        System.out.println(c2);
        System.out.println("---------------");

        // 定义布尔变量
        boolean bool = true;
        System.out.println(bool);
    }
}
