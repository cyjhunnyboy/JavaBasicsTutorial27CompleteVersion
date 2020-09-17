package per.cyj.tutorial.day05;

/**
 * 数组
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class Day05Demo16 {

    /*
        数组常见的两个小问题
            1、java.lang.ArrayIndexOutOfBoundsException: 数组索引越界异常
               原因：你访问了不存在的索引
            2、java.lang.NullPointerException：空指针异常
               原因：数组已经不再指向堆内存了，而你还用数组名访问元素。

        作用：请自己把所有的场景Exception结尾的问题总结一下，以后遇到就记录下来
             现象、原因、解决方案
     */
    public static void main(String[] args) {
        // 定义数组
        int[] arr = {1, 2, 3};

        // java.lang.ArrayIndexOutOfBoundsException: 3
        // System.out.println(arr[3]);

        // 引用类型的常量：空常量 null
        arr = null;
        System.out.println(arr[0]);
    }
}
