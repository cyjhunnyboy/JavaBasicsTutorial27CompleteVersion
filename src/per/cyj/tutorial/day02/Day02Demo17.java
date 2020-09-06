package per.cyj.tutorial.day02;

/**
 * 数据类型
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day02Demo17 {

    public static void main(String[] args) {
        // 字符串数据和其他数据做“+”，结果是字符串类型
        // 这里的“+”不是加法运算，而是字符串连接符
        // 结果是：helloa1
        System.out.println("hello" + 'a' + 1);
        // 结果是：98hello
        System.out.println('a' + 1 + "hello");
        // 结果是：5+5=55
        System.out.println("5+5=" + 5 + 5);
        // 结果是：10=5+5
        System.out.println(5 + 5 + "=5+5");
    }
}
