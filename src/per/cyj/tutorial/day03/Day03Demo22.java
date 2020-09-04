package per.cyj.tutorial.day03;

/**
 * 选择结构
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day03Demo22 {

    /*
        选择结构
            if语句
            switch语句

        if语句：
            格式1：
                if(关系表达式) {
                    语句体;
                }
            执行流程：先计算关系表达式的值，看其返回值结果是true还是false
            如果是true，则执行语句体，否则，不执行语句体
     */
    public static void main(String[] args) {
        int x = 10;

        if (x == 10) {
            System.out.println("x等于10");
        }

        if (x == 20) {
            System.out.println("x等于20");
        }

        System.out.println("over");
    }
}
