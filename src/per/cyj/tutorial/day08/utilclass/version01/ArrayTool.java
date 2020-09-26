package per.cyj.tutorial.day08.utilclass.version01;

/**
 * 这是针对数组进行操作的工具类
 *
 * @author chenyongjun
 * @since 2020-02-09
 */
public class ArrayTool {

    // 把构造方法私有，外界就不能再创建对象了
    private ArrayTool() {
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
