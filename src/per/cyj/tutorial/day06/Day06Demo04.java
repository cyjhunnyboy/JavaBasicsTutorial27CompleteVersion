package per.cyj.tutorial.day06;

/**
 * 二维数组
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class Day06Demo04 {

    /*
       需求：二维数组遍历
       外循环控制的是二维数组的长度，其实就是一维数组的个数
       内循环控制的是一维数组的长度，其实就是一维数组元素的个数
     */
    public static void main(String[] args) {
        // 定义一个二维数组
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // 请问谁代表{1, 2, 3}
        // arr[0]就是第一个数组
        // arr[0] = {1, 2, 3}
        for (int i = 0; i < arr[0].length; i++) {
            System.out.println(arr[0][i]);
        }

        System.out.println("------------------");

        for (int i = 0; i < arr[1].length; i++) {
            System.out.println(arr[1][i]);
        }

        System.out.println("------------------");

        for (int i = 0; i < arr[2].length; i++) {
            System.out.println(arr[2][i]);
        }

        System.out.println("------------------");

        // 用循环改进
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------------------");

        // 这个时候，注意了，3是我们根据上面的代码得出来的
        // 但是，它不能针对任何的数组都可以这样的
        // 所以，我们应该想办法改进
        // 其实，外面的这个循环的长度就是二维数组的长度
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------------------");

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
