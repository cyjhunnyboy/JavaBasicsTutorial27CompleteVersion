package per.cyj.tutorial.day04;

/**
 * 嵌套循环
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo37 {

    /*
        需求：在控制台输出九九乘法表

        首先我们写出九九乘法表：
        1*1=1
        1*2=2   2*2=4
        1*3=3   2*3=6   3*3=9
        1*4=4   2*4=8   3*4=12  4*4=16
        ...
        1*9=9   2*9=18  3*9=27  ...

        我们先把这个九九乘法表看出是这样的一个形状
        *
        **
        ***
        ****
        *****
        ******
        *******
        ********
        *********

        注意：
            1、'\x' x表示任意字符，这种做法叫做转义字符
            2、'\t' tab键的位置
            3、'\r' 回车
            4、'\n' 换行
     */
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------------");

        // 为了使用数据，我们从1开始
        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y + "*" + x + "=" + y * x + "\t");
            }
            System.out.println();
        }
    }
}
