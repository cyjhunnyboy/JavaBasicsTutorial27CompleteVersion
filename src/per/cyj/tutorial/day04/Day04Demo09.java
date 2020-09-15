package per.cyj.tutorial.day04;

/**
 * for循环语句
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo09 {

    public static void main(String[] args) {
        /*
            循环语句：for循环、while循环、do...while语句
            for(初始化语句;判断条件语句;控制条件语句) {
                循环体语句;
            }
            执行流程：
                1、执行初始化语句
                2、执行判断条件语句，看其返回结果是true还是false
                    a.如果是true，就继续执行
                    b.如果是false，就结束循环
                3、执行循环体语句
                4、执行控制条件语句
                5、回到2继续
            注意事项：
                1、判断条件语句无论简单还是复杂结果是boolean类型
                2、循环体语句如果是一条大括号可以省略，如果是多条语句，不能省略，建议永远不要省略
                3、一般来说，有左大括号就没有分号，有分号就没有左大括号
            需求：请在控制台输出10次"Hello, World!"
         */
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello, World!");
        }
    }
}
