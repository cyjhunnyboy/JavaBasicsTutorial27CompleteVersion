package per.cyj.tutorial.day05;

/**
 * 数组
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class Day05Demo19 {

    /*
        数组元素逆序（就是把元素对调）

        分析：
            1、定义一个数组，并进行静态初始化
            2、把0索引和arr.length -1的数据交换
            3、把1索引和arr.length -2的数据交换
            ...
            只要做到arr.length/2的时候即可
     */
    public static void main(String[] args) {
        // 定义一个数组，并进行静态初始化
        int[] arr = {12, 98, 40, 34, 76};

        // 逆序前遍历数组
        System.out.println("逆序前");
        printArray(arr);

        // 数组逆序
        // reverse(arr);
        reverse2(arr);

        // 逆序后遍历数组
        System.out.println("逆序后");
        printArray(arr);

    }

    /*
        需求：数组逆序
        两个明确：
            返回值类型：void（有人会想到应该返回逆序后的数组，但是没必要，因为是同一个数组）
            参数列表：int[] arr
     */
    public static void reverse(int[] arr) {
        /*
        // 第一次交换
        int temp  = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        // 第二次交换
        int temp1 = arr[1];
        arr[1] = arr[arr.length - 1 - 1];
        arr[arr.length - 1 - 1] = temp1;
        */

        // 用循环改进
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    /*
        数组逆序
     */
    public static void reverse2(int[] arr) {
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    /*
        两个明确：
            1、返回值类型：void
            2、参数列表：int[] arr
     */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                // 这是最后一个数组元素
                System.out.println(arr[i] + " ]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
