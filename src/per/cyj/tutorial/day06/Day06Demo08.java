package per.cyj.tutorial.day06;

/**
 * 参数传递问题
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class Day06Demo08 {

    /*
        思考题一：看程序写结果，然后分析为什么是这样子的。并画图讲解。最后总结Java中参数传递规律
        Java中的参数传递问题：
            基本类型：形式参数的改变对实际参数没有任何影响
            引用类型：形式参数的改变直接影响实际参数。因为引用类型参数传递的是地址，该地址和实际参数的地址一样，都是指向同一个堆空间
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a:" + a + ", b:" + b); // a:10, b:20
        change(a, b);
        System.out.println("a:" + a + ", b:" + b); // a:10, b:20

        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr); // [1, 2, 3, 4, 5]
        change(arr);
        printArray(arr); // [1, 4, 3, 8, 5]
    }

    /**
     * 修改基本类型变量的值
     *
     * @param a 整型变量a
     * @param b 整型变量b
     */
    public static void change(int a, int b) {
        System.out.println("a:" + a + ", b:" + b); // a:10, b:20
        a = b;
        b = a + b;
        System.out.println("a:" + a + ", b:" + b); // a:20, b:40
    }

    /**
     * 如果数组元素能被2整除，该元素就乘以2
     *
     * @param arr 数组
     */
    public static void change(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] *= 2;
            }
        }
    }

    /**
     * 控制台打印一维数组
     *
     * @param arr 一维数组
     */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "] ");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
