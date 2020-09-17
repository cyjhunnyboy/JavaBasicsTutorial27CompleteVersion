package per.cyj.tutorial.day05;

/**
 * 数组
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class Day05Demo12 {

    /*
        定义一个数组，输出该数组的名称和数组元素值
     */
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = new int[3];

        // 输出数字名称
        System.out.println(arr);
        // 输出数组元素值
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // 给数组元素赋值
        arr[0] = 100;
        arr[1] = 200;

        // 输出数字名称
        System.out.println(arr);
        // 输出数组元素值
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
