package per.cyj.tutorial.day03;

import java.util.Scanner;

/**
 * 选择结构
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day03Demo27 {

    /*
        if语句的格式3：
            if(关系表达式1){
                语句体1;
            } else if(关系表达式2){
                语句体2;
            } else if(关系表达式3){
                语句体3;
            }
            ......
            else {
                语句体n+1;
            }

         执行流程：
            1、首先计算关系表达式1看其结果是true还是false
            2、如果是true，则执行语句体1，if语句结束
            3、如果是false，接着计算关系表达式2看其返回结果是true还是false
            4、如果是true，则执行语句体2，if语句结束
            5、如果是false，接着计算关系表达式3看其返回结果是true还是false
            ......
            n、如果都是false，就执行语句体n+1
     */
    public static void main(String[] args) {
        // 需求：键盘录入一个成绩，判断并输出成绩的等级
        /*
            90~100 优秀
            80~90 良好
            70~80 还行
            60~70 及格
            0~60  不及格
         */
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        // 录入数据
        System.out.println("请输入你的考试成绩：");
        int score = sc.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 80 && score < 90) {
            System.out.println("良好");
        } else if (score >= 70 && score < 80) {
            System.out.println("还行");
        } else if (score >= 60 && score < 70) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }

        // 这样写已经满足我的基本要求，但是可能别人在使用的时候
        // 不会按照你要求的数据给出了，在做一个程序的基本测试的时候
        // 一定要考虑这样的几个问题：正确的数据，错误的数据，边界数据
        // 而我们刚才写的程序并没有处理错误数据，所以这个程序不是很好，要改进
    }
}
