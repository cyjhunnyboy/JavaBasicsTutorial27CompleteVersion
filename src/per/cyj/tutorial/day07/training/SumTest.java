package per.cyj.tutorial.day07.training;

/**
 * 求和测试类
 *
 * @author chenyongjun
 * @since 2020-02-09
 */
public class SumTest {

    public static void main(String[] args) {
        // 方式1测试
        // Sum sum = new Sum();
        // System.out.println(sum.sum());

        // 方式2测试
        Sum sum = new Sum();
        System.out.println(sum.sum(10, 20));

        // 方式3测试
        // Sum sum = new Sum();
        // sum.a = 10;
        // sum.b = 20;
        // System.out.println(sum.sum());
    }
}
