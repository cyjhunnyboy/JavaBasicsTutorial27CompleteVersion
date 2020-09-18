package per.cyj.tutorial.day06;

/**
 * 二维数组
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class Day06Demo03 {

    /*
        二维数组定义格式3：
            基本格式：
            数据类型[][] arr = new 数据类型[][]{{元素..},{元素..},{元素..}};
            简化版格式：
            数据类型[][] arr = {{元素..},{元素..},{元素..}};
            举例：
            int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
            int[][] arr = {{1,2,3},{4,6},{6}};
     */
    public static void main(String[] args) {
        // 定义一个二维数组
        int[][] arr = {{1, 2, 3}, {4, 5}, {6}};

        System.out.println(arr);        // [[I@1b6d3586
        System.out.println(arr[0]);     // [I@4554617c
        System.out.println(arr[1]);     // [I@74a14482
        System.out.println(arr[2]);     // [I@1540e19d

        System.out.println(arr[0][0]);  // 1
        System.out.println(arr[1][0]);  // 4
        System.out.println(arr[2][0]);  // 6

        System.out.println(arr[0][1]);  // 2
        System.out.println(arr[1][1]);  // 5
        // ArrayIndexOutOfBoundsException
        System.out.println(arr[2][1]);  // 错误
    }
}
