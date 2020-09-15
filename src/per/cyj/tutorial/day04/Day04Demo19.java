package per.cyj.tutorial.day04;

/**
 * while循环语句
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo19 {

    /*
        while循环的基本格式:

        while(判断条件语句){
            循环体语句;
        }

        括展格式：

        初始化语句;
        while(判断条件语句){
            循环体语句;
            控制条件语句;
        }

        通过这个格式，我们可以看出和for循环是差不多的

        for(初始化语句;判断条件语句;控制条件语句){
            循环体语句;
        }

     */
    public static void main(String[] args) {
        // 控制台输出"Hello, World!"10次
        // for循环版本
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello, World!");
        }

        System.out.println("---------------------");

        // while循环版本
        int j = 0;
        while (j < 10) {
            System.out.println("Hello, World!");
            j++;
        }
    }
}
