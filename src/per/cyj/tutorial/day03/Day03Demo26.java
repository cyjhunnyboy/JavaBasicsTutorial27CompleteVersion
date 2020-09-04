package per.cyj.tutorial.day03;

/**
 * 选择结构
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day03Demo26 {

    /*
        由于if语句的第二种格式刚才也能完成了三元运算符可以完成的效果。
        所以，我们就认为他们可以完成一样的操作，但是他们就一点区别也没有吗？肯定不是
        区别：
            1、三元运算符的操作都可以使用if语句改进，反之不成立
            2、当if语句控制的语句体是一条输出语句的时候，就不成立。
               因为三元运算符是一个运算符，必须要求有一个结果返回，而输出语句却不能作为一个返回结果
     */
    public static void main(String[] args) {
        // 获取两个数据的最大值
        int a = 10;
        int b = 20;

        int max1;
        if (a > b) {
            max1 = a;
        } else {
            max1 = b;
        }

        System.out.println("max1 = " + max1);

        // 用三元运算符改进
        int max2 = (a > b) ? a : b;
        System.out.println("max2 = " + max2);

        // 判断一个数据是奇数还是偶数，并输出是奇数还是偶数
        int x = 100;

        if (x % 2 == 0) {
            System.out.println("100是一个偶数");
        } else {
            System.out.println("100是一个奇数");
        }

        // 用三元改进
        // 这种改进是错误的
        // String s = (x % 2 == 0) ? System.out.println("100是一个偶数"); : System.out.println("100是一个奇数");
    }
}
