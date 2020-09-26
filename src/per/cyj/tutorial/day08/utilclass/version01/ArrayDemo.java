package per.cyj.tutorial.day08.utilclass.version01;

/**
 * 工具类中使用静态
 *
 * @author chenyongjun
 * @since 2020-02-09
 */
public class ArrayDemo {

    /*
        在同一个文件夹下，类定义在两个文件中和定义在一个文件中其实一样的。
     */
    public static void main(String[] args) {
        // 定义数组
        int[] arr = {28, 55, 37, 46, 19};

        // 遍历数组
        // ArrayTool at = new ArrayTool();
        // at.printArray(arr);

        // 改为静态方法后，可以直接通过类名调用
        ArrayTool.printArray(arr);
    }
}
