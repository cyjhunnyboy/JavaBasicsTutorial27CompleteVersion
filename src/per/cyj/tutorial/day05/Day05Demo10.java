package per.cyj.tutorial.day05;

/**
 * 方法
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class Day05Demo10 {

    /*
         比较两个数据是否相等。参数类型分别为两个byte类型，两个short类型，
         两个int类型，两个long类型，并在main方法中进行测试
     */
    public static void main(String[] args) {
        // 测试bye
        byte b1 = 3;
        byte b2 = 4;
        System.out.println("byte: " + compare(b1, b2));

        // 测试short
        short s1 = 5;
        short s2 = 5;
        System.out.println("shot: " + compare(s1, s2));

        // 测试int
        int i1 = 5;
        int i2 = 5;
        System.out.println("int: " + compare(i1, i2));

        // 测试long
        long l1 = 5L;
        long l2 = 5L;
        System.out.println("long: " + compare(l1, l2));
    }

    // byte类型
    public static boolean compare(byte a, byte b) {
        System.out.println("byte");
        return a == b;
    }

    // short类型
    public static boolean compare(short a, short b) {
        System.out.println("short");
        return a == b;
    }

    // int类型
    public static boolean compare(int a, int b) {
        System.out.println("int");
        return a == b;
    }

    // long类型
    public static boolean compare(long a, long b) {
        System.out.println("long");
        return a == b;
    }
}
