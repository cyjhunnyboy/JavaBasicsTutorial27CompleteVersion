package per.cyj.tutorial.day07.training;

import java.util.Scanner;

/**
 * 长方形求周长和面积测试类
 *
 * @author chenyongjun
 * @since 2020-02-09
 */
public class RectangleTest {

    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        // 录入长方形长宽数据
        System.out.println("请录入长方形长：");
        int length = sc.nextInt();
        System.out.println("请录入长方形宽：");
        int width = sc.nextInt();

        // 创建对象
        Rectangle rect = new Rectangle();
        // 给长方形长宽赋值
        rect.setLength(length);
        rect.setWidth(width);

        // 求长方形周长和面积并在控制台输出
        System.out.println("长方形周长是：" + rect.perimeter());
        System.out.println("长方形面积是：" + rect.area());
    }
}
