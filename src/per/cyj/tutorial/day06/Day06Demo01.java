package per.cyj.tutorial.day06;

/**
 * 二维数组
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class Day06Demo01 {

    /*
        二维数组：就是元素为一维数组的一个数组
        格式1：
            数据类型[][] 数组名=new 数据类型[m][n];
            m：表示这个二维数组有多少个一维数组
            n：表示每一个一维数组的元素有多少个
        注意：
            1、以下格式也可以表示为二维数组
                a.数据类型 数组名[][] = new 数据类型[m][n];
                b.数据类型[] 数组名[] = new 数据类型[m][n];
            2、注意下面定义的区别
                int x, y;
                int[] x, y[];
     */
    public static void main(String[] args) {
        // 定义一个二维数组
        // 定义了一个二维数组arr，这个二维数组有3个一维数组的元素，每一个一维数组有2个元素
        int[][] arr = new int[3][2];

        // 输出二维数组的名称
        System.out.println(arr);  // 地址值

        // 输出二维数组的第一个元素一维数组的名称
        System.out.println(arr[0]);  // 地址值
        System.out.println(arr[1]);  // 地址值
        System.out.println(arr[2]);  // 地址值

        // 输出二维数组的元素
        System.out.println(arr[0][0]);  // 0
        System.out.println(arr[0][1]);  // 0
    }
}
