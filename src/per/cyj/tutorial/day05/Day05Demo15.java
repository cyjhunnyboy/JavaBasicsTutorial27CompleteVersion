package per.cyj.tutorial.day05;

/**
 * 数组
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class Day05Demo15 {

    /*
        数组的静态初始化
            1、格式：数组类型[] 数组名=new 数据类型[]{元素1, 元素2,...};
            2、简化格式：数据类型[] 数组名={元素1,元素2,...};
            3、举例：
                int[] arr = new int[]{1, 2, 3};
                int[] arr = {1, 2, 3};

        注意事项：
            1、不要同时动态和静态进行
                格式如下：int[] arr = new int[3]{1, 2, 3} // 错误
     */
    public static void main(String[] args) {
        // 静态数组初始化
        // 标准格式
        int[] arr = new int[]{1, 2, 3};

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("--------");

        // 简化格式
        int[] arr1 = {1, 2, 3};
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println("--------");

        // 不能动态初始化和静态初始化同时进行
        // 即不能给定数组长度同时给定元素值，如下代码是错误的
        // int[] arr2 = new int[3]{1, 2, 3};
    }
}
