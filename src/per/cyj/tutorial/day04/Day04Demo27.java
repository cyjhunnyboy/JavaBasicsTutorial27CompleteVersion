package per.cyj.tutorial.day04;

/**
 * 死循环
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo27 {

    /*
        注意死循环
        1、一定要注意控制条件语句控制的那个变量的问题，不要弄丢了，否则就容易死循环
        2、两种最简单的死循环格式
            while(true){...}
            for(;;){...}
     */
    public static void main(String[] args) {
        /*
        int x = 0;
        while (x < 10) {
            System.out.println(x);
            // x++;
        }
         */

        /*
        while (true) {
            System.out.println("今天我很高兴，学习了死循环");
        }
         */

        for (; ; ) {
            System.out.println("今天我很高兴，学习了死循环");
        }
    }
}
