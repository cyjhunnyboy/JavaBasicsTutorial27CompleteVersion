package per.cyj.tutorial.day04;

/**
 * 嵌套循环
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo36 {

    /*
        需求：请输出下列的形状

            *
            **
            ***
            ****
            *****
     */
    public static void main(String[] args) {
        // 通过简单的观察，我们看到这是一个行是5，列数是变化的形状
        // 我们先打印一个5行5列的形状
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("-----------------------");

        /*
            我们实现了一个5行5列的形状
            但是这不是我们想要的，我要的是列数是变化的
            列数是如何变化的呢？
            第一行 1列  i=0, j<=0, j++
            第二行 2列  i=1, j<=1, j++
            第三行 3列  i=2, j<=2, j++
            第四行 4列  i=3, j<=3, j++
            第五行 5列  i=4, j<=4, j++
            外循环i的变化，恰好是j=0,1,2,3,4
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("-----------------------");
    }
}
