package per.cyj.tutorial.day06;

/**
 * 综合练习
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class Day06Demo09 {

    /*
        某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安全，
        在传递的过程中需要加密，加密规则如下：
        1、首先将数据倒叙，然后将每位数字都加上5，再用和除以10的余数代替该数字，
           最后将第一位和最后一位数字交换。请任意给定一个小于8位的整数，然后，把
           加密后的结果在控制台打印出来。
        要求：
            A：数据是小于8位的整数
                定义一个int类型的整数
                int number = 123456;
            B：加密规则
                1、首先将数据倒序
                    结果是：number = 654321;
                2、然后将每位数字都加上5，再用和除以10的余数代替该数字
                    (6+5) % 10 = 1
                    (5+5) % 10 = 0
                    结果是：number = 109876
                3、将第一位和最后一位数字交换
                    结果是：number = 609871
            C：把加密后的结果输出在控制台
        通过简单的分析，我们知道如果我们有办法把这个数据变成数字就好了。
        不是直接写成这个样子的：int[] arr = {1, 2, 3, 4, 5, 6};
        如何把数据转成数组呢？
            1、定义一个数据
                int number = 123456;
            2、定义一个数组，这个时候问题就来了，数组的长度是多少呢？
                int[] arr = new int[8]; // 不肯能超过8
                在赋值的时候，我用一个变量记录索引的变化
                定义一个索引值是0
                int index = 0;
            3、获取每一个数据
                int ge = number % 10;
                int shi = number / 10 % 10;
                int bai = number / 10 / 10 % 10;

                arr[index] = ge;
                index++;
                arr[index] = shi;
                index++;
                arr[index] = bai
                ...
     */
    public static void main(String[] args) {
        // 定义一个数据
        int number = 123456;

        // 定义一个数组
        int[] arr = new int[8];

        // 把数据中每一位上的数据取到后存储到数组中
        /*
        int index = 0;
        arr[index] = number % 10;
        index++;
        arr[index] = number / 10 % 10;
        index++;
        arr[index] = number / 10 / 10 % 10;
        */

        // 通过观察这个代码，我们发现应该是可以通过循环改进的
        int index = 0;
        while (number > 0) {
            arr[index] = number % 10;
            index++;
            number /= 10;
        }

        // 然后将每位数字都加上5，再用和除以10的余数代替该数字
        for (int i = 0; i < index; i++) {
            arr[i] += 5;
            arr[i] %= 10;
        }

        // 将第一位和最后一位数字交换
        int temp = arr[0];
        arr[0] = arr[index - 1];
        arr[index - 1] = temp;

        // 输出数据
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
