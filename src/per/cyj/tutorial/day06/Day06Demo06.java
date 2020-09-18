package per.cyj.tutorial.day06;

/**
 * 二维数组
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class Day06Demo06 {

    /*
       需求：公司销售额求和
            某公司按照季度和月份统计的数组如下：单位（万元）
            第一季度：22, 66, 44
            第二季度：77, 33, 88
            第三季度：25, 45, 65
            第四季度：11, 66, 99
       分析：
            1、把题目的数据用二维数据来表示
                int[][] arr = {{22, 66, 44}, {77, 33, 44}, {25, 45, 65}, {11, 66, 99}};
            2、如何求和呢？
                求和其实就是获取到每一个元素，然后累加即可
            3、定义一个求和变量sum，初始化值0
            4、通过遍历就可以得到每一个二维数组的元素
            5、把元素累加即可
            6、最后输出sum，就是结果
     */
    public static void main(String[] args) {
        // 把题目的数据用二维数据来表示
        int[][] arr = {{22, 66, 44}, {77, 33, 88}, {25, 45, 65}, {11, 66, 99}};

        // 调用二维数组求和方法
        int sum = sumArray(arr);

        // 公司一年的销售额
        System.out.println("公司一年的销售为：" + sum + "万元");

    }

    /*
        需求：二维数组元素求和
        两个明确：
            返回值类型：int
            参数列表：int[][] arr
     */
    public static int sumArray(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
