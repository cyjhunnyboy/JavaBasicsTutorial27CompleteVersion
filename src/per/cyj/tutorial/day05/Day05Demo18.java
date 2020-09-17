package per.cyj.tutorial.day05;

/**
 * 数组
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class Day05Demo18 {

    /*
        数组获取最值（获取数组中的最大值最小值）

        分析：
            1、定义一个数组，并对数组的元素进行静态初始化
            2、从数组中任意的找一个元素作为参照物（一般取第一个），默认它就是最大值
            3、然后遍历其他元素，依次获取和参照物进行比较，如果大就留下来，如果小就离开
            4、最后参照物里保存的就是最大值
     */
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = {34, 98, 10, 142, 1};

        // 请获取数组中的最大值
        // 从数组中任意的找一个元素作为参照物
        int max = arr[0];
        // 然后遍历其他的元素
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // 最后参照物里保存的就是最大值
        System.out.println("max = " + max);

        System.out.println("--------------------");

        // 把这个代码用方法改进
        // 调用方法
        int maxEleOfArr = maxEleOfArr(arr);
        System.out.println("max = " + maxEleOfArr);

        System.out.println("--------------------");

        // 请获取数组中的最小值
        int min = minEleOfArr(arr);
        System.out.println("min = " + min);
    }

    /*
        需求：获取数组中的最大值

        两个明确：
            1、返回值类型：int
            2、参数列表：int[] arr
     */
    public static int maxEleOfArr(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    /*
        需求：获取数组中的最小值

        两个明确：
            1、返回值类型：int
            2、参数列表：int[] arr
     */
    public static int minEleOfArr(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
