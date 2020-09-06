package per.cyj.tutorial.day02;

/**
 * Java进制
 *
 * @author chenyongjun
 * @since 2020-02-05
 */

/*
    不同进制的数据表现：
        二进制：由0,1组成，以0b开头
        八进制：由0,1,...7组成，以0开头
        十进制：由0,1,...9组成，默认整数是十进制
        十六进制：由0,1,...9,a,b,c,d,e,f(大小写均可)组成，以0x开头
 */
public class Day02Demo08 {

    public static void main(String[] args) {
        // 十进制
        System.out.println(100);
        // 二进制
        System.out.println(0b100);
        // 八进制
        System.out.println(0100);
        // 十六进制
        System.out.println(0x100);
    }
}
