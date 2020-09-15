package per.cyj.tutorial.day04;

/**
 * for循环语句
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo14 {

    /*
        需求：求5的阶乘
        什么是阶乘呢？
        n! = n*(n-1)! 规则
        n! = n*(n-1)*(n-2)*...3*2*1
        求和思想
        求阶乘思想
     */
    public static void main(String[] args) {
        // 定义最终结果变量
        int result = 1;

        // 这里的i其实可以直接从2开始
        for (int i = 2; i <= 5; i++) {
            result *= i;
        }
        System.out.println("1-5的阶乘是：" + result);
    }
}
