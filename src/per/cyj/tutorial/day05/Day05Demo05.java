package per.cyj.tutorial.day05;

/**
 * 方法
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day05Demo05 {

    /*
        方法注意事项
        1、方法不调用不执行
        2、方法与方法是平级关系，不能嵌套定义
        3、方法定义的时候参数之间用逗号隔开
        4、方法调用的时候不用再传递数据类型
        5、如果方法有明确的返回值，一定要有return带回一个值

     */
    public static void main(String[] args) {
        /*
        // 错误的
        public static int sum(int a, int b) {
            return a + b;
        }
         */

        // 错误的
        // int resutl = sum(int 10, int 20);
        int x = 10;
        int y = 20;
        int resutl = sum(x, y);
        System.out.println(resutl);

    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
