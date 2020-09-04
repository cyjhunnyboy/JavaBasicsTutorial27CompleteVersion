package per.cyj.tutorial.day03;

/**
 * 逻辑运算符
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day03Demo08 {

    /*
        逻辑运算符：
            &, |, ^, !
            &&, ||
        特点：
            1、逻辑运算符一般用于连接boolean类型的表达式或者值
            2、表达式：就是用运算符把常量或者变量连接起来的符合Java语法的式子
               a.算术表达式： a + b
               b.关系表达式：a == b
        结论：
            逻辑与(&)：有false则false
            逻辑或(|)：有true则true
            逻辑异或(^)：相同则false，不同为true， 举例：情侣关系 男男，男女，女男，女女
            逻辑非(!)：非false则true，非true则false，特点：偶数个不改变本身
     */

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        // 逻辑与&
        // false & false = false
        System.out.println((a > b) & (a > c));
        // false & true = false
        System.out.println((a > b) & (a < c));
        // true & false = false
        System.out.println((a < b) & (a > c));
        // true & true = true
        System.out.println((a < b) & (a < c));

        System.out.println("=======================");

        // 逻辑或|
        // false | false = false
        System.out.println((a > b) | (a > c));
        // false | true = true
        System.out.println((a > b) | (a < c));
        // true | false = true
        System.out.println((a < b) | (a > c));
        // true | true = true
        System.out.println((a < b) | (a < c));

        System.out.println("=======================");

        // 逻辑异或^
        // false ^ false = false
        System.out.println((a > b) ^ (a > c));
        // false ^ true = true
        System.out.println((a > b) ^ (a < c));
        // true ^ false = true
        System.out.println((a < b) ^ (a > c));
        // true ^ true = false
        System.out.println((a < b) ^ (a < c));

        System.out.println("=======================");

        // 逻辑非!
        System.out.println(!(a > b));
        System.out.println(!(a < b));
        System.out.println(!!(a < b));
    }
}
