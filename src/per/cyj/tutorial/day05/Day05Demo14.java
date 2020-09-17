package per.cyj.tutorial.day05;

/**
 * 数组
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class Day05Demo14 {

    /*
        定义第一个数组，定义完毕后，给数组元素赋值。赋值完毕后，再输出数组元素名称和元素
        定义第二个数组，定义完毕后，给数组元素赋值。赋值完毕后，再输出数组元素名称和元素
        定义第三个数组，把第一个数组的地址值赋值给它（注意类型一致），通过第三个数组的名称去把元素重新赋值，最后，
        再次输出第一个数组名称和元素
     */
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr1 = new int[3];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println("--------");

        // 定义第二个数组
        int[] arr2 = new int[3];
        arr2[0] = 40;
        arr2[1] = 50;
        arr2[2] = 60;
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println("--------");

        // 定义第三个数组
        int[] arr3 = arr1;
        arr3[0] = 100;
        arr3[1] = 200;

        // 输出第一个数组地址和元素
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println("--------");
    }
}
