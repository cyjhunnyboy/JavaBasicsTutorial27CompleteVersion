package per.cyj.tutorial.day04;

/**
 * while循环语句
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo22 {

    /*
        while循环和for循环的区别？
        1、控制条件语句所控制的那个变量，在for循环结束后，就不能再被访问到了，而while循环结束还可以继续使用，如果你想继续使用，就用while，
           否则推荐使用for。原因是for循环结束，该变量就从内存中消失，能够提供内存的使用效率
        2、如果是一个范围的，用for循环非常明确；如果是不明确做多少次，用while循环较为合适
     */
    public static void main(String[] args) {
        // for循环实现
        for (int i = 0; i < 10; i++) {
            System.out.println("学习Java技术哪家强，中国北京传智博客！");
        }

        // 这里不能再继续访问i了
        // System.out.println(i);
        System.out.println("-------------------------------------");

        // while循环实现
        int j = 0;
        while (j < 10) {
            System.out.println("学习Java技术哪家强，中国北京传智博客！");
            j++;
        }

        // 这里是可以继续访问j的
        System.out.println(j);
        System.out.println("-------------------------------------");
    }
}
