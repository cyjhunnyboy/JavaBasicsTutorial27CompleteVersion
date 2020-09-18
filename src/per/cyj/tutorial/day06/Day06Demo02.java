package per.cyj.tutorial.day06;

/**
 * 二维数组
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class Day06Demo02 {

    /*
        二维数组定义格式2：
            数据类型[][] arr = new 数据类型[m][];
            m：表示这个二维数组有多少个一维数组
            列数没有给出，可以动态的给。这一次是一个变化的列数
     */
    public static void main(String[] args) {
        // 定义一个二维数组
        int[][] arr = new int[3][];

        System.out.println(arr);    // [[I@1b6d3586
        System.out.println(arr[0]); // null
        System.out.println(arr[1]); // null
        System.out.println(arr[2]); // null

        // 动态为每一个一维数组分配空间
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[1];

        System.out.println(arr);    // [[I@1b6d3586
        System.out.println(arr[0]); // [I@4554617c
        System.out.println(arr[1]); // [I@74a14482
        System.out.println(arr[2]); // [I@1540e19d

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        // ArrayIndexOutOfBoundsException
        // System.out.println(arr[0][2]); // 错误

        arr[1][0] = 100;
        arr[1][2] = 300;
    }
}
