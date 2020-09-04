package per.cyj.tutorial.day03;

/**
 * + 的用法
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day03Demo04 {

    public static void main(String[] args) {
        /*
            +的用法：
                1、加法
                2、正号
                3、字符串连接符
         */
        System.out.println(3 + 4);  // 加法
        System.out.println(+4);     // 正号

        System.out.println('a');
        System.out.println('a' + 1);    // 这是加法

        // 字符串连接符
        System.out.println("Hello" + 'a' + 1);
        System.out.println('a' + 1 + "hello");
    }
}
