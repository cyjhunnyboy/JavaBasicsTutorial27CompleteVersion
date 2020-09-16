package per.cyj.tutorial.day04;

/**
 * beak语句
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo29 {

    /*
        break跳出多层循环
            要想实现这个效果，就必须知道一个东西，带标签的语句
            格式：标签名：语句
     */
    public static void main(String[] args) {

        // 跳出多层循环语句，通过带标签的语句实现
        wc:
        for (int x = 0; x < 3; x++) {
            nc:
            for (int y = 0; y < 4; y++) {
                if (y == 2) {
                    // break nc;
                    break wc;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
