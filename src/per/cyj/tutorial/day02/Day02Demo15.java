package per.cyj.tutorial.day02;

/**
 * 数据类型
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day02Demo15 {

    public static void main(String[] args) {
        /*
            思考题：
                1）	byte b = 130;有没有问题？如果想让赋值正确，可以怎么做？结果是多少呢？
                2）	练习byte b = 300;
         */

        // 因为byte的范围是：-128~127，而130不在此范围内，所以报错
        // Error:(18, 18) java: 不兼容的类型: 从int转换到byte可能会有损失
        // byte b = 130;

        // 使用强制类型转换
        byte b = (byte) 130;
        // 结果是多少呢？
        /*
            分析过程：
                我们要想知道结果是什么，就应该知道是如何进行计算的，而我们又知道计算机中的数据的运算
                都是补码进行的。而要得到补码，首先要计算出数据的二进制
            A：获取130这个数的二进制
                00000000 00000000 00000000 10000010
                这是130的原码，也是反码，还是补码
            B：做截取操作，截成byte类型的了
                10000010
                这个结果是补码
            C：已知补码求原码
                        符号位         数值位
                   补码   1           0000010
                   反码   1           1111101 取反
                   原码   1           1111110 +1
                   结果：11111110=-126
         */
        System.out.println(b);
    }
}
