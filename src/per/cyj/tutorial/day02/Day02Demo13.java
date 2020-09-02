package per.cyj.tutorial.day02;

/**
 * 数据类型
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day02Demo13 {

    /*
        思考题1：请问下面有没有问题 double d = 12.345; float f = d;
        思考题2：看下面两个定义有没有区别？ float f1 = (float) 12.345; float f2 = 12.345F;
                f1其实通过一个double类型转换过来的，而f2本身就是一个float类型
     */
    public static void main(String[] args) {
        // 把double赋值给float，加了强制类型转换
        double d = 12.345;
        float f = (float) d;
        System.out.println(f);

        // 看下面两个定义有没有区别？
        // f1其实通过一个double类型转换过来的，而f2本身就是一个float类型
        float f1 = (float) 12.345;
        float f2 = 12.345F;
        System.out.println(f1);
        System.out.println(f2);
    }
}
