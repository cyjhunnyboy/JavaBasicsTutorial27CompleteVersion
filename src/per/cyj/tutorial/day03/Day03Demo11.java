package per.cyj.tutorial.day03;

/**
 * 位运算符
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day03Demo11 {

    /*
        ^的特点：一个数据对另一个数据位异或两次，该数本身不变
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println((a ^ b) ^ b);  // 10
        System.out.println((a ^ b) ^ a);  // 20
    }
}