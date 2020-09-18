package per.cyj.tutorial.day06;

import java.util.Scanner;

/**
 * 综合练习
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class Day06Demo10 {

    /*
        某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安全，
        在传递的过程中需要加密，加密规则如下：
        1、首先将数据倒叙，然后将每位数字都加上5，再用和除以10的余数代替该数字，
           最后将第一位和最后一位数字交换。请任意给定一个小于8位的整数，然后，把
           加密后的结果在控制台打印出来。
        测试数据：
            number = 1234567
            第一步：7654321
            第二步：2109876
            第三步：6109872
        知识点：
            变量
            数据类型
            运算符
            键盘录入
            语句
            方法
            数组
     */
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        // 请输入一个数据
        System.out.println("请输入一个数据（小于8位）：");
        int number = sc.nextInt();

        // 写功能实现把number进行加密
        // 调用
        String result = jiaMi(number);
        System.out.println("加密后的结果是：" + result);
    }

    /*
        需求：写一个功能，把数据number实现加密
        两个名明确：
                返回值类型：String 做一个字符串的拼接
            参数列表：int number
     */
    public static String jiaMi(int number) {
        // 定义一个数组
        int[] arr = new int[8];

        // 定义索引
        int index = 0;

        // 把number中的数据想办法存储到数组中
        while (number > 0) {
            arr[index] = number % 10;
            index++;
            number /= 10;
        }

        // 每个数据加5，然后对10取余得到余数
        for (int i = 0; i < index; i++) {
            arr[i] += 5;
            arr[i] %= 10;
        }

        // 将第一位和最后一位数字交换
        int temp = arr[0];
        arr[0] = arr[index - 1];
        arr[index - 1] = temp;

        // 把数组的元素拼接成一个字符串返回
        // 定义一个空字符串
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < index; i++) {
            s.append(arr[i]);
        }

        // 返回加密后的数据
        return s.toString();
    }
}
