package per.cyj.tutorial.day08.utilclass.version02;

/**
 * 这是针对数组进行操作的工具类
 *
 * @author chenyongjun
 * @version V2.0
 * @since 2020-02-09
 */
public class ArrayTool {

    /**
     * 这是私有构造
     */
    private ArrayTool() {
    }

    /**
     * 这是遍历数组的方法，遍历后控制台输出的格式是：[元素1, 元素2, 元素, ...]
     *
     * @param arr 这是要被遍历的数组
     */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    /**
     * 这是获取数组中最大值的方法
     *
     * @param arr 这是要获取最大值的数组
     * @return 返回数组中的最大值
     */
    public static int getMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    /**
     * 这是获取组织中最小值的方法
     *
     * @param arr 这是要获取最小值的数组
     * @return 返回数组中的最小值
     */
    public static int getMin(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }

    /**
     * 这是指定元素在数组中第一次出现的索引，如果元素不存在，就返回-1
     *
     * @param arr   被查找的数组
     * @param value 要查找的元素
     * @return 返回元素在数组中的索引，如果不存在，返回-1
     */
    public static int getIndex(int[] arr, int value) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
            }
        }

        return index;
    }
}
