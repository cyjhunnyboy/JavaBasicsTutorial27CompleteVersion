package per.cyj.tutorial.day03;

/**
 * 选择结构
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day03Demo23 {

    /*
        if语句注意事项：
            a)	关系表达式无论简单还是复杂，结果必须是boolean类型
            b)	If语句控制的语句体如果是一条语句，大括号可以省略；如果是多条语句，就不能省略，建议永远不要省略
            c)	一般来说：有左大括号就没有分号，有分号没有左大括号
     */
    public static void main(String[] args) {
        int x = 10;

        if (x == 10) {
            System.out.println("x等于10");
        }

        if (x > 5 || x == 10) {
            System.out.println("x大于5或者等于10");
        }

        System.out.println("---------------------");

        int a = 100;
        if (a != 100)
            System.out.println("a = " + a);
        System.out.println("不执行我！");
        System.out.println("---------------------");

        int b = 100;
        if (b != 100) {
            System.out.println("b = " + b);
            System.out.println("不执行我！");
        }
        System.out.println("---------------------");

        /*
        int c = 100;
        if (c != 100); { // ; 这里其实是由语句体的，只不过是空语句体，与后面大括号内容毫无关系
            // 大括号内容是代码块
            System.out.println("c = " + c);
            System.out.println("是否能看到我！");
        }
        */
        System.out.println("over");
    }
}
