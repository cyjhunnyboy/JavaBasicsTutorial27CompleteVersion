package per.cyj.tutorial.day03;

/**
 * 赋值运算符
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day03Demo06 {

    /*
        面试题：
            short s = 1; s = s + 1;
            short s = 1; s += 1;
        上面两行代码是否有问题，如果有，那里有问题？

        为什么第二个没有问题？
            扩展的赋值运算其实隐含了一个强制类型转换。
            s += 1;
            不等价于s = s + 1
            而是等价于 s = (s的数据类型) s + 1
     */
    public static void main(String[] args) {
        // short s = 1;
        // Error:(18, 15) java: 不兼容的类型: 从int转换到short可能会有损失
        // s = s + 1;

        short s1 = 1;
        s1 += 1;
        System.out.println(s1);
    }
}
