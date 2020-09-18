package per.cyj.tutorial.day05;

/**
 * 数组
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class Day05Demo17 {

    /*
        数组遍历：就是依次输出数组中的每一个元素。
        注意：数组提供了一个属性length，用于获取数组的长度
             格式：数组名.length
     */
    public static void main(String[] args) {
        // 定义数组
        int[] arr = {11, 22, 33, 44, 55};

        // 获取每一个元素
        // 如何获取呢？我们知道数组名结合编号（索引）就可以找到数据
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("--------------");

        // 虽然这种做法可以，但是不是我想要的
        // 我们发现，代码的重复很高，输出语句，数组名都是相同的，仅仅是索引是变化的
        // 我们就可以使用循环搞定索引值
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("--------------");

        // 从0开始我们是明确的，但是为什么到5呢？我们是数了一下数组的个数
        // 继续看下这个数组如何遍历
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 9, 11, 33, 44, 12, 45, 12, 44, 99, 123, 43, 11, 44, 112, 87, 55, 76};
        // 而我们在很多时候，数组的元素不能靠数，这个时候，数组就给
        // 我们提供了一个属性：length专门用于获取数组的长度
        // 格式：数组名.length 返回数组的长度
        System.out.println(arr.length);
        System.out.println(arr2.length);
        System.out.println("--------------");

        // 改进第一个程序
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        System.out.println("--------------");

        // 我们如果想要对多个数组进行遍历，每个数组的遍历我们都把代码写一遍
        // 麻烦不？ 麻烦，所以，我们准备用方法改进
        // 用方法改进后，再调用
        printArray(arr);
        // 遍历第二个数组
        printArray(arr2);
        System.out.println("--------------");

        printArray2(arr);
        printArray2(arr2);
        System.out.println("--------------");

        printArray3(arr);
        printArray3(arr2);
    }

    /*
        遍历数组的方法
        两个明确：
            1、返回值类型：void
            2、参数列表：int[] arr
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // 请看改进版
    public static void printArray2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) { // 这是最后一个元素
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    // 请看改进版2
    public static void printArray3(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) { // 这是最后一个元素
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
