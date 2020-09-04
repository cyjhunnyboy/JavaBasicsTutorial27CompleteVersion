package per.cyj.tutorial.day03;

/**
 * 三元运算符
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day03Demo14 {

    /*
        一元运算符：~3
        二元运算符：3 + 4

        三元运算符：
            格式：关系表达式?表达式1:表达式2;
            关系表达式：结果是一个boolean类型
            执行流程：
                根据关系表达式的计算返回一个true或者false
                如果是true，就把表达式1作为结果
                如果是false，就把表达式2作为结果
     */
    public static void main(String[] args) {
        int x = 100;
        int y = 200;

        int z1 = (x > y) ? x : y;
        int z2 = (x < y) ? x : y;
        int z3 = (x == y) ? x : y;
        // 报错：Error:(31, 21) java: 不兼容的类型: int无法转换为boolean
        // int z4 = x = y ? x : y;
        System.out.println("z1 = " + z1);
        System.out.println("z2 = " + z2);
        System.out.println("z3 = " + z3);
    }
}
