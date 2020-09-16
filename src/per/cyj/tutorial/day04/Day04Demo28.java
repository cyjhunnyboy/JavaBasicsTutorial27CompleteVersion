package per.cyj.tutorial.day04;

/**
 * break语句
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo28 {

    /*
        控制跳转语句：
            break：中断
            continue：继续
            return：返回

        break：中断的意思
        使用场景：
            1、switch语句中
            2、循环语句中（循环语句中加入了if判断的情况）
            注意：离开了上面的两个场景，无意义

        如何使用呢？
        1、跳出单层循环
        2、跳出多层循环
            要想实现这个效果，就必须知道一个东西，带标签的语句
            格式：标签名：语句
     */
    public static void main(String[] args) {
        // 单独使用报错：在switch或loop外部中断
        // berak;

        // 跳出单层循环
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i + ": Hello, World!");
        }

        System.out.println("Program is over!");
        System.out.println("---------------------------------");

        // 这样子无法跳出多层循环，只能跳出单层循环
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 4; y++) {
                if (y == 2) {
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
