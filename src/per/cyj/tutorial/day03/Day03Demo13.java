package per.cyj.tutorial.day03;

/**
 * 位运算符
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day03Demo13 {

    /*
        << 左移：左边最高位丢弃，右边补零
        >> 右移：最高位是0，左边补齐0，最高位是1，左边补齐1
        >>> 无符号右移：无论最高位是0还是1，左边补齐0
     */
    public static void main(String[] args) {
        // 3 << 2 把<<左边的数据*2的移动次幂
        // 3*2^2 = 3 * 4 = 12
        /*
            计算出3的二进制：11
                00000000 00000000 00000000 00000011
            (00)000000 00000000 00000000 0000001100
                00000000 00000000 00000000 00001100 = 12
         */
        System.out.println(3 << 2);

        // >> 把>>左边的数据除以2的移动次幂
        System.out.println(24 >> 2);    // 24/2^2 = 6
        System.out.println(24 >>> 2);   // 24/2^2 = 6

        System.out.println("=====================");

        /*
            >>的移动
            计算出24的二进制
            原码：10000000 00000000 00000000 00011000
            反码：11111111 11111111 11111111 11100111
            补码：11111111 11111111 11111111 11101000
            11111111 11111111 11111111 11101000
            1111111111 11111111 11111111 111010(00)  补码
            补码：11111111 11111111 11111111 11111010
            反码：11111111 11111111 11111111 11111001（减1）
            原码：10000000 00000000 00000000 00000110（符号位不变，按位取反） = -6

            >>>的移动
            计算出24的二进制
            原码：10000000 00000000 00000000 00011000
            反码：11111111 11111111 11111111 11100111
            补码：11111111 11111111 11111111 11101000

            11111111 11111111 11111111 11101000
            0011111111 11111111 11111111 111010(00)
            结果：00111111 11111111 11111111 11111010 (正数，原码、补码、反码相同） = 1073741818
         */
        System.out.println(-24 >> 2);
        System.out.println(-24 >>> 2);
    }
}
