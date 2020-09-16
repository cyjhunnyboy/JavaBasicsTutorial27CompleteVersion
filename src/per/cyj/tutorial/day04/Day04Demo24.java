package per.cyj.tutorial.day04;

/**
 * do...while循环语句
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo24 {

    /*
        do...while循环的基本格式
        do{
            循环体语句;

        do...while循环扩展格式
        do{
            循环体语句;
            控制条件语句;
        }while(判断条件语句);

     */
    public static void main(String[] args) {
        // 输出10次"Hello, World!"
        int i = 0;
        do {
            System.out.println("Hello, World!");
            i++;
        } while (i < 10);
    }
}
