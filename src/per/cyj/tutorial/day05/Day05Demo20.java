package per.cyj.tutorial.day05;

import java.util.Scanner;

/**
 * 数组
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class Day05Demo20 {

    /*
        数组查表法（根据键盘录入索引，查找对应星期）
        意思是：String[] strArray = {"星期一", "星期二',...};
     */
    public static void main(String[] args) {
        // 定义一个字符串数组
        String[] strArray = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"};

        // 创建键盘录入对象
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 键盘录入数据
            System.out.println("请输入一个数据(0-6)：");
            int index = scanner.nextInt();
            if (index >= 0 && index <= 6) {
                // 查找星期几
                System.out.println("你要查找的星期是：" + strArray[index]);
            } else {
                break;
            }
        }
    }
}
