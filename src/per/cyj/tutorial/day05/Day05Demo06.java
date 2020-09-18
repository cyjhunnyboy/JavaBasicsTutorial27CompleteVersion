package per.cyj.tutorial.day05;

/**
 * 方法
 *
 * @author chenyongun
 * @since 2020-02-08
 */
public class Day05Demo06 {

    /*
        需求：在控制台输出如下形状
            *****
            *****
            *****
            *****

        注意：void类型返回值的方法调用
            1、单独调用
            2、输出调用（错误）
            3、赋值调用（错误）
     */
    public static void main(String[] args) {
        // for循环嵌套输出图形
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------------");

        // 需求：我们要在控制台输出一个6行7列的星星图形
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------------");

        // 如果需求继续改变，我们就要考虑使用方法改进
        // 单独调用
        printStar(10, 20);

        // 输出调用
        // Error:(46, 37) java: 此处不允许使用 '空' 类型
        // System.out.println(printStar(10, 20));

        // 赋值调用
        // Error:(51, 9) java: 非法的表达式开始
        // void v = printStar(10, 20);
    }

    /*
        写一个什么样子的方法呢？写一个m行n列的代码
        两个明确：
            1、返回值类型：这个时候没有明确的返回值，不写东西也不行，所以，这里记住是void
            2、参数列表：int m, int n
     */
    public static void printStar(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
