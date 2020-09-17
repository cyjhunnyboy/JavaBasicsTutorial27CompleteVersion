package per.cyj.tutorial.day05;

/**
 * 数组
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class Day05Demo13 {

    /*
        定义两个数组，分别输出两个数组各自的数组名及元素值
        然后给每个数组的元素重新赋值，再次分别输出两个数组各自的数组名及元素值
     */
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = new int[2];
        // 定义第二个数组
        int[] arr2 = new int[3];

        // 输出数组名和元素值
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println("---------");
        // 输出数组名和元素值
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println("---------");

        // 给元素重新赋值
        arr[1] = 20;
        arr2[1] = 30;
        arr2[0] = 40;

        // 输出数组名和元素值
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println("---------");
        // 输出数组名和元素值
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println("---------");
    }
}
