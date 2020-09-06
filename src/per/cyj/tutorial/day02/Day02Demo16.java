package per.cyj.tutorial.day02;

/**
 * 数据类型
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day02Demo16 {

    /*
        1、通过字符和一个整数相加，我们给出一张表：ASCII表。通过看完这张表以后，我们要记住三个值。
            'a'   97
            'A'   65
            '0'   48
     */
    public static void main(String[] args) {
        // 直接输出一个字符
        System.out.println('a');
        // 输出一个字符和一个整数做加法
        // 结果：98，说明'a'是97
        System.out.println('a' + 1);
    }
}
