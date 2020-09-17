package per.cyj.tutorial.day05;

/**
 * 数组
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class Day05Demo21 {

    /*
        需求：数组元素查找（查找指定元素第一次在数组中出现的索引）

        分析：
            1、定义一个数组，并静态初始化
            2、写一个功能实现
                遍历数组，依次获取数组中的每一个元素，和已知的数据进行比较
                如果相等，就返回当前的索引值
     */
    public static void main(String[] args) {
        // 定义一个数组，并静态初始化
        int[] arr = {200, 250, 38, 88, 444, 250, 200, 1};

        // 需求：查找数据在这个数组中第一次出现的索引
        int index = searchIndex(arr, 250);
        System.out.println("250在数组中第一次出现的索引是：" + index);

        int index2 = searchIndex(arr, 10);
        System.out.println("10在数组中第一次出现的索引是：" + index2);

        int index3 = queryIndex(arr, 200);
        System.out.println("10在数组中第一次出现的索引是：" + index3);

        int index4 = queryIndex(arr, 20);
        System.out.println("10在数组中第一次出现的索引是：" + index4);

    }

    /*
        需求：数组元素查找（查找指定元素第一次在数组中出现的索引）
        两个明确：
            返回值类型：int
            参数列表：int[] arr, int value
     */
    public static int searchIndex(int[] arr, int value) {
        // 遍历数组，依次获取数组中每一个元素，和value进行比较
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                // 如果相等，就返回当前的索引值
                return i;
            }
        }

        // 目前的代码有一个小问题
        // 就是假如查找的元素在数组中不存在，那就是找不到，找不到，你就对应的返回吗？ 所以报错
        // 只要是判断，就可能是false，所以大家要细心

        // 如果找不到数据，我们一般返回一个负数即可，而且是返回-1
        return -1;
    }

    /*
        需求：数组元素查找（查找指定元素第一次在数组中出现的索引）
        两个明确：
            返回值类型：int
            参数列表：int[] arr, int value
    */
    public static int queryIndex(int[] arr, int value) {
        // 定义一个索引
        int index = -1;

        // 有就修改索引值
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }

        // 返回index
        return index;
    }
}
