package per.cyj.tutorial.day02;

/**
 * 数据类型
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day02Demo14 {

    public static void main(String[] args) {
        /*
            1、面试题：
                1) byte b1 = 3, b2 = 4, b;
                2) b = b1 + b2;
                3) b = 3 + 4;
                哪句是编译失败的呢？为什么？b=b1+b2;是有问题的，因为变量相加，会首先看类型问题，最终把结果赋值的时候也会考虑类型问题。
                常量相加，首先做加法，然后看结果是否在赋值的数据类型范围内，如果不是，才报错
            2、思考题：
                1）	byte b = 130;有没有问题？如果想让赋值正确，可以怎么做？结果是多少呢？
                2）	练习byte b = 300;
         */
        byte b1 = 3, b2 = 4, b;
        // 编译报错：Error:(22, 16) java: 不兼容的类型: 从int转换到byte可能会有损失
        // 这个是类型提升，所以有问题
        // b = b1 + b2;

        // 常量，先把结果计算出来，然后看是否在byte类型的范围内，如果在就正常赋值，如果不在就报错
        b = 3 + 4;
        System.out.println(b);

        int b3 = b1 + b2;
        System.out.println(b3);
    }
}
