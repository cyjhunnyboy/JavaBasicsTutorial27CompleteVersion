package per.cyj.tutorial.day05;

/**
 * 方法
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class Day05Demo09 {

    /*
        需求：我要求数的和
        我们的需求不断的发生改变，我们就对应的提供了多个求和的方法
        但是呢，他们的名字是不一样的
        而我们又要求命名做到：见名知意
        但是，很明显，现在没有做到
        那么，肿么办呢？
        针对这种情况，方法的功能相同，列表参数不同的情况，为了见名知意，Java允许它们起的名字一样
        其实，这种情况有一个专业的名词：方法重载
        方法重载：
            在同一个类中，方法名相同，参数列表不同，与返回值类型无关
            参数列表不同：
                1、参数个数不同
                2、参数类型不同
     */
    public static void main(String[] args) {
        // JVM会根据不同的参数去调用不同的功能
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 30, 20));
        System.out.println(sum(10, 20, 30, 40));
        System.out.println(sum(10.5f, 20));
    }

    // 需求1：求两个数的和
    public static int sum(int a, int b) {
        System.out.println("int");
        return a + b;
    }

    /*
    // 需求2：求三个数的和
    public static int sum1(int a, int b, int c) {
        return a + b + c;
    }
     */

    // 需求2：求三个数的和
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    /*
    // 需求3：求4个数的和
    public static int sum2(int a, int b, int c, int d) {
        return a + b + c + d;
    }
     */

    // 需求3：求4个数的和
    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static float sum(float a, float b) {
        System.out.println("float");
        return a + b;
    }
}
