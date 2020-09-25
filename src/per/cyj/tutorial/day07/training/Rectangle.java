package per.cyj.tutorial.day07.training;

/**
 * 长方形求周长和面积类
 *
 * @author chenyongjun
 * @since 2020-02-09
 */

/*
    定义一个长方形类，定义求周长和面积的方法
    长方形的类：
        成员变量：长、宽
        成员方法：
            求周长：(长+宽)*2
            求面积：长*宽
    注意：
        import必须出现在所有的class前面
 */
public class Rectangle {

    // 长方形的长
    private int length;

    // 长方形的宽
    private int width;

    // 无参构造方法
    public Rectangle() {
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // 求周长
    public int perimeter() {
        return (length + width) * 2;
    }

    // 求面积
    public int area() {
        return length * width;
    }
}
