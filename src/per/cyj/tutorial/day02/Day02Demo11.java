package per.cyj.tutorial.day02;

/**
 * 数据类型
 *
 * @author chenyongjun
 * @since 2020-02-05
 */
public class Day02Demo11 {

    public static void main(String[] args) {
        /*
            +是一个运算符，做加法运算的
            一般来说，我们在运算的时候，要求参与运算的数据类型必须一致
            注意：
                boolean类型不能转换为其他的数据类型
            默认转换（从小到大的转换）
                1、byte,short,char->int->long->float->double
                2、byte,short,char相互之间不转换，他们参与运算的时候首先转换为int类型
         */
        // 直接输出的方式做加法
        System.out.println(3 + 4);
        System.out.println("---------------------");

        // 两个int类型做加法
        int x = 3;
        int y = 4;
        int z = x + y;
        System.out.println(z);
        System.out.println("---------------------");

        // 定义一个byte类型，一个int类型，做加法
        // int类型和byte类型运算，结果是int类型，byte类型自动提升为int类型
        byte a = 3;
        int b = 4;
        System.out.println(a + b);
        System.out.println("---------------------");

        // 报错“可能损失精度”，因为a是byte类型参与运算时先自动转换为int类型
        // byte c = a + b;
        int c = a + b;
        System.out.println(c);
    }
}
