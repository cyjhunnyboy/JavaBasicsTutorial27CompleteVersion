package per.cyj.tutorial.day04;

/**
 * continue语句
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo30 {

    /*
        continue：继续
        使用场景：循环体重，离开次场景无意义
        测试找到和break的区别：
            break：跳出单层循环
            continue：跳出本次循环
     */
    public static void main(String[] args) {

        // break：跳出单层循环，结束循环
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("---------------------");

        // continue：跳出一次循环，进入下一次的执行
        for (int j = 1; j <= 10; j++) {
            if (j == 3) {
                continue;
            }
            System.out.println(j);
        }
    }
}
