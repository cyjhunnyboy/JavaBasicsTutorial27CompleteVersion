package per.cyj.tutorial.day05;

/**
 * 方法
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day05Demo01 {

    /*
        方法：完成特定功能的代码块
        注意：在很多语言里面有函数的定义，而在Java中函数被称为方法
        方法格式：
            修饰符 返回值类型 方法名(参数类型 参数1, 参数类型 参数2...) {
                方法体语句;
                return 返回值;
            }
        详细讲解：
            1、修饰符：目前就用public static。后面我们再详细的讲解其他的修饰符
            2、返回值类型：就是功能结果的数据类型
            3、方法名：符合命名规则即可，方便我们调用
            4、参数：
                实际参数：实际参与运算的
                形式参数：就是方法定义上的，用于接收实际参数的
            5、参数类型：就是参数的数据类型
            6、参数名：就是变量名
            7、方法体语句：就是完成功能的代码块
            8、return：结束方法的
            9、返回值：就是功能的结果，由return带给调用者
        要想写好一个方法，就必须明确两个东西
            1、返回值类型：结果的数据类型
            2、参数列表：你要传递几个参数，以及每个参数的数据类型
        方法的执行特点：
            不调用，不执行
        如何调用呢？（有明确返回值的调用）
            1、单独调用，一般来说没有意义，所以不推荐
            2、输出调用，但是不够好，因为我们可能需要针对结果进行进一步的操作
            3、赋值调用，推荐方案
     */
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        // 方式1：单独调用
        sum1(10, 20);
        sum1(10, 20);

        // 方式2：输出调用
        System.out.println(sum1(x, y));
        System.out.println(sum1(x, y));

        // 方式3：赋值调用
        int result = sum1(x, y);
        // result在这里可以进行操作
        System.out.println(result);
        result = sum2(x, y);
        // result在这里可以进行操作
        System.out.println(result);
    }

    /*
        需求：求两个数据之和的案例
        两个明确：
            返回值类型：int
            参数列表：2个，都是int类型
     */
    public static int sum1(int a, int b) {
        // 如何实现呢
        int c = a + b;
        return c;
    }

    /*
        需求：求两个数据之和的案例
        两个明确：
            返回值类型：int
            参数列表：2个，都是int类型
    */
    public static int sum2(int a, int b) {
        // c就是a+b，所以，可以直接返回a+b
        return a + b;
    }
}
