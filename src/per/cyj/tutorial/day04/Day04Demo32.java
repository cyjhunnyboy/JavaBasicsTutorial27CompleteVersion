package per.cyj.tutorial.day04;

/**
 * return语句
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo32 {

    /*
        return：返回
        其实它的作用不是结束循环的，而是结束方法的
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                System.out.println("退出");
                // break;
                // continue;
                return;
            }
            System.out.println(i);
        }

        System.out.println("Program is over!");
    }
}
