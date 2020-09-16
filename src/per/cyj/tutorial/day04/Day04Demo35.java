package per.cyj.tutorial.day04;

/**
 * 嵌套循环
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo35 {

    /*
        需求：请输出一个4行5列的星星（*）图案

        结果：
            ****
            ****
            ****
            ****
            ****

        循环嵌套：就是循环语句的循环体本身就是一个循环语句

        通过结果我们知道这样的一个结论：外循环控制行数，内循环控制列数
     */
    public static void main(String[] args) {
        // 原始做法
        System.out.println("****");
        System.out.println("****");
        System.out.println("****");
        System.out.println("****");
        System.out.println("****");

        System.out.println("-----------------------");

        // 虽然可以完成要求，但是不是很好
        // 如果是多行多列就会比较麻烦，所以我们准备改进，如何改进呢？
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            // 通过输出空的输出语句实现换行
            System.out.println();
        }
    }
}
