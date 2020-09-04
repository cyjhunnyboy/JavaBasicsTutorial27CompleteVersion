package per.cyj.tutorial.day03;

import java.util.Scanner;

/**
 * 选择结构
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day03Demo29 {

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

        if (score < 0 || score > 100) {
            System.out.println("你输入的成绩有误");
        } else if (score >= 90 && score <= 100) {
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
    }
}
