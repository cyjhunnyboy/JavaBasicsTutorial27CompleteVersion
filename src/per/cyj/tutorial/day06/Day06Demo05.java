package per.cyj.tutorial.day06;

/**
 * 二维数组
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class Day06Demo05 {

    /*
       需求：二维数组遍历
       外循环控制的是二维数组的长度，其实就是一维数组的个数
       内循环控制的是一维数组的长度，其实就是一维数组元素的个数
     */
    public static void main(String[] args) {
        // 定义一个二维数组
        int[][] arr = {{1, 2, 3}, {4, 5}, {6}};

        // 方法改进
        printArray2(arr);

    }

    /*
        需求：遍历二维数组
        两个明确：
            返回值类型：void
            参数列表：int[][] arr
     */
    public static void printArray2(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
